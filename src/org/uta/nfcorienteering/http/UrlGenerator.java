package org.uta.nfcorienteering.http;

public class UrlGenerator {

	static final String domain = "example.org";
	static final String event = "events";
	static final String track = "tracks";

	public static String eventListURL() {
		return domain + "/" + event;
	}

	public static String trackUrl(int eventNumber, int trackNumber) {
		return domain + "/" + event + "/" + eventNumber + "/" + track + "/"
				+ trackNumber;
	}
}