package singletone;

public class Downloader {
	
	private static Downloader downloader;
	
	private Downloader(){
	}
	
	public void startDownloading(){
		System.out.println("start downloading ....");
	}
	
	public static Downloader getInstance(){
		if(downloader == null)
			downloader = new Downloader();
		
		return Downloader.downloader;
	}

}
