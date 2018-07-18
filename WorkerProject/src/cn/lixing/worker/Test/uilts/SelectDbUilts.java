package cn.lixing.worker.Test.uilts;

import static cn.lixing.worker.Test.uilts.PropertiesFileUilt.*;
import static cn.lixing.worker.Test.uilts.RemoveDuplicateUilts.*;
import static cn.lixing.worker.Test.uilts.SelectDbUilts.select;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
public class SelectDbUilts {
	private static String[][] qpcodeValues;
	/**
	 * 创建Oracle连接对象
	 * @return
	 */
	public static Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName(getData("device", "\\configFile\\jdbc"));
			connection=DriverManager.getConnection(
					getData("url", "\\configFile\\jdbc"), 
					getData("username", "\\configFile\\jdbc"), 
					getData("password", "\\configFile\\jdbc"));
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	/**
	 * 获取数据库的qrcode二维码
	 * @param TableName 表名
	 * @param colValues 列表
	 * @param status 二维码状态
	 * @return 返回String[][]数组
	 */
	public static String[][] selectQpcode(String TableName,String[]colValues,int status) {
		Connection connection;
		String sql;
		String colValueStr;
		PreparedStatement pmt;
		List<String>colValueslist=new ArrayList<>();
		ResultSet result;
		String qpcodeValue;
		String[][] qpcodeValues = null;
		List<String>qpcodeValuesList=new ArrayList<>();
		connection=getConnection();
		for(String colValue:colValues) {
			colValueslist.add(colValue);
		}
		try {
			colValueStr=colValueslist.toString().replace("[", "").replace("]", "");
			sql="select * FROM(select "+colValueStr+" from "+TableName+" WHERE STATUS=? ORDER BY QRCODE_ID DESC) WHERE ROWNUM<=1";
			pmt=connection.prepareStatement(sql);
			pmt.setInt(1, status);
			result=pmt.executeQuery();
			while(result.next()) {
				qpcodeValue=result.getString("QRCODE");
				if(qpcodeValue.endsWith("==")) {
					qpcodeValuesList.add(qpcodeValue);
				}
				
			}
			qpcodeValues=new String[qpcodeValuesList.size()][1];
			for(int i=0;i<qpcodeValuesList.size();i++){
				qpcodeValues[i][0]=qpcodeValuesList.get(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();	
		}
		return qpcodeValues;
	}
	
	/**
	 * 二维码解码
	 * @param status 二维码状态（0,1,9）
	 * @return
	 */
	public static String[][] decrypteQpcodeData(int status) {
		OkHttpClient client = new OkHttpClient();
		JsonParser parser=new JsonParser();
		String decrypteQpcode;
		qpcodeValues=selectQpcode("TB_PQ_QRCODE",new String[] {"QRCODE"},status);
		String [][]decrypteQpcodes=new String[qpcodeValues.length][1];
		for(int i=0;i<qpcodeValues.length;i++) {
			MediaType mediaType = MediaType.parse(getData("Content-Type", "\\configFile\\http"));
			RequestBody body = RequestBody.create(mediaType, "{\"data\":{\"deText\":\""+qpcodeValues[i][0]+"\",\"key\":\"023\"}}");
			Request request = new Request.Builder()
			  .url(getData("url", "\\configFile\\http"))
			  .post(body)
			  .addHeader("cache-control", "no-cache")
			  .addHeader("postman-token", "9c51adc7-ebf3-62de-4718-7a4527d2738c")
			  .build();

			Response response;
			try {
				response = client.newCall(request).execute();
				JsonObject obj=(JsonObject) parser.parse(response.body().string());
				decrypteQpcode=obj.get("repBody").getAsString();
				decrypteQpcodes[i][0]=decrypteQpcode;
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return decrypteQpcodes;
	}
	/**
	 * 获取绑定的设备
	 * @param TableName 表名
	 * @param colValues 列明
	 * @param status 状态 （默认为1）
	 * @return String[][]数组
	 */
	public static String[][] selectdEevices(String TableName,String[]colValues,int status){
		Connection connection;
		String sql;
		String colValueStr;
		PreparedStatement pmt;
		List<String>colValueslist=new ArrayList<>();
		ResultSet result;
		String qpcodeValue;
		String[][] qpcodeValues = null;
		List<String>qpcodeValuesList=new ArrayList<>();
		connection=getConnection();
		for(String colValue:colValues) {
			colValueslist.add(colValue);
		}
		colValueStr=colValueslist.toString().replace("[", "").replace("]", "");
		sql="select "+colValueStr+" from "+TableName+" WHERE STATUS=?";
		try {
			pmt=connection.prepareStatement(sql);
			pmt.setInt(1, status);
			result=pmt.executeQuery();
			while(result.next()) {
				qpcodeValue=result.getString("DEVICE_SN");
				
				qpcodeValuesList.add(qpcodeValue);
			}
			qpcodeValuesList=removeDuplicate(qpcodeValuesList);
			qpcodeValues=new String[qpcodeValuesList.size()][1];
			for(int i=0;i<qpcodeValuesList.size();i++){
				qpcodeValues[i][0]=qpcodeValuesList.get(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return qpcodeValues;
	}
	
	/**
	 * 获取数据库的对应表中的列值
	 * @param TableName 表名
	 * @param colValues 列明
	 * @param id id
	 * @return list<Object>
	 */
	public static List<Object> select(String TableName,String[]colValues,String id,String USER_ACCOUNT) {
		Connection connection;
		String sql;
		String colValueStr;
		PreparedStatement pmt;
		ResultSet result;
		List<Object>rowListDatas=new ArrayList<>();
		List<List<Object>> listArr=null;
		List<String>colValueslist=new ArrayList<>();
		ResultSetMetaData meta=null;
		int colNum=0;
		connection=getConnection();
		for(String colValue:colValues) {
			colValueslist.add(colValue);
		}
		try {
			colValueStr=colValueslist.toString().replace("[", "").replace("]", "");
			sql="select * FROM(SELECT "+colValueStr+" FROM "+TableName+" WHERE USER_ACCOUNT="+USER_ACCOUNT+" ORDER BY "+id+" DESC) WHERE ROWNUM<=1";
			System.out.println(sql);
			pmt=connection.prepareStatement(sql);
			result=pmt.executeQuery();
			meta = result.getMetaData();
			colNum=meta.getColumnCount();
			while(result.next()) {
			for(int i=0;i<meta.getColumnCount();i++) {
				Object colVaules=result.getObject(i+1);
				rowListDatas.add(colVaules);
			}
			}
			listArr = new ArrayList<>();      
	        int arrSize = rowListDatas.size()%colNum==0?rowListDatas.size()/colNum:rowListDatas.size()/colNum+1;      
	        for(int i=0;i<arrSize;i++) {      
	        	List<Object>rowListData=new ArrayList<>();      
	            for(int j=i*colNum;j<=colNum*(i+1)-1;j++) {      
	                if(j<=rowListDatas.size()-1) {      
	                	rowListData.add(rowListDatas.get(j));      
	                }      
	            }      
	            listArr.add(rowListData);
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return listArr.get(0);
	}
	
	
	public static String[][] getQpcodeValues() {
		return qpcodeValues;
	}

	public static void setQpcodeValues(String[][] qpcodeValues) {
		SelectDbUilts.qpcodeValues = qpcodeValues;
	}

	public static void main(String[] args) {
		List<Object>list=select("TB_PQ_QRCODE",new String[] {"USER_ACCOUNT","STATUS"},"QRCODE_ID","607240426");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	
	}
}
