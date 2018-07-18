package cn.lixing.worker.Test.uilts;

import java.io.Closeable;
import java.io.IOException;

public class CloseFileUilt {
	public static void close(Closeable ... io) {
		for(Closeable temp:io) {
			try {
				temp.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
