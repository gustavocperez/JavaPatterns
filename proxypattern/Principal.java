package br.com.gustavo.proxypattern;

public class Principal {

	public static void main(String[] args) {
		YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYoutubeClass());
		YouTubeDownloader smartDownloader = new YouTubeDownloader(new YoutubeCacheProxy());
		long naive = test(naiveDownloader);
		long smart = test(smartDownloader);
		System.out.println("Tome saved by caching proxy: " + (naive - smart) + "ms");

	}
	
	private static long test(YouTubeDownloader downloader) {
		long startTime = System.currentTimeMillis();
		downloader.renderPopularVideo();
		downloader.renderVideoPage("catzzzzzzz");
		downloader.renderPopularVideo();
		downloader.renderVideoPage("dancevideo");
		downloader.renderVideoPage("catzzzzzzzz");
		downloader.renderVideoPage("someiothervid");
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Time elapsed: " + estimatedTime + "ms\n");
		return estimatedTime;
	}

}
