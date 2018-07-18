package cn.lixing.worker.Test.uilts;

public class SleepTimeUilts {
	public static void sleepTime(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
