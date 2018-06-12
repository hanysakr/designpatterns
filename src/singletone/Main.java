package singletone;

public class Main {

	public static void main(String[] args) {
		
		SingletoneClass.INSTANCE1.setCounter(10);
		System.out.println(SingletoneClass.INSTANCE1.getCounter());
		System.out.println(SingletoneClass.INSTANCE2.getCounter());
		System.out.println(SingletoneClass.INSTANCE1.getCounter());
		
		Downloader.getInstance().startDownloading();
	}

}
