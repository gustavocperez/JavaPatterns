package br.com.gustavo.proxypattern;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

	@Override
	public HashMap<String, Video> popularVideos() {
		connectToServer("http://www.youtube.com");
		return getRandomVideos();
	}

	@Override
	public Video getVideo(String videoId) {
		connectToServer("http://www.youtube.com/" + videoId);
		return getSomeVideo(videoId);
	}
	
	private int random(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	private void expercienceNetworkiLatency() {
		int randomLatency = random(5, 10);
		for (int i = 0; i < randomLatency; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	private void connectToServer(String server) {
		System.out.println("Connecting to " + server + "... ");
		expercienceNetworkiLatency();
		System.out.println("Connected!" + "\n");
		
	}
	
	
	private HashMap<String, Video> getRandomVideos(){
		System.out.println("Downloading populars... ");
		expercienceNetworkiLatency();
		HashMap<String, Video> hmap = new HashMap<String, Video>();
		hmap.put("catzzzzzzz", new Video("fjdskfankfnds", "Catzzz.avi"));
		hmap.put("csggsfdgsfdz", new Video("fjgsdfgsdfgsds", "dog.avi"));
		hmap.put("asdasasasasz", new Video("fzxzxzxxz", "dogplaying.avi"));
		hmap.put("kjhkjhkhjkjh", new Video("fjgjhkjhkjhks", "dotinha.avi"));
		hmap.put("nbbnbnbnnb", new Video("bnbnbnbnnbs", "diablo2.avi"));
		
		System.out.println("Done!" + "\n");
		return hmap;
	}
	
	private Video getSomeVideo(String videoId) {
		System.out.print("Downloading video...");
		expercienceNetworkiLatency();
		Video video = new Video(videoId, "Some video title");
		System.out.println("Done!" + "\n");
		return video;
	}
	
	

}
