package cn.lixing.worker.Test.uilts;

import static cn.lixing.worker.Test.uilts.SelectDbUilts.*;
public class ConcatUilt {
	public static String[][] concat(){
		String [][] repCodeDatas=null;
		String [][] testQrcodeDatas=decrypteQpcodeData(0);
		String [][] testDeviceDatas=selectdEevices("TB_PQ_DEVICE_DETAIL",new String[] {"DEVICE_SN"},1);
		repCodeDatas=new String[testDeviceDatas.length][2];
		for(int i=0;i<testQrcodeDatas.length;i++) {
			repCodeDatas[i][0]=testQrcodeDatas[i][0];
		}
		for(int i=0;i<testDeviceDatas.length;i++) {
			repCodeDatas[i][1]=testDeviceDatas[i][0];
		}
		return repCodeDatas;
	}
}
