package cn.lixing.worker.Test.uilts;

import static cn.lixing.worker.Test.uilts.CloseFileUilt.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class PropertiesFileUilt {
	public static String getData(String keyNanem,String fileName) {
		String classPath=System.getProperty("user.dir");
		Properties ps=new Properties();
		BufferedInputStream in=null;
		try {
			in=new BufferedInputStream(
					new FileInputStream(classPath+fileName+".properties"));
			ps.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		close(in);
		return ps.getProperty(keyNanem);
	}
}
