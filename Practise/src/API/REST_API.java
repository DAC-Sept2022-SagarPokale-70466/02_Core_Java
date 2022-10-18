package API;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;

public class REST_API {

	public static void main(String[] args) {
		
		Transcript transcript = new Transcript();
		transcript.setAudio_url("https://www.computerhope.com/jargon/m/example.mp3");
		
		Gson gson = new Gson();
		gson.
		
		HttpRequest postReq = new HttpRequest.newBuilder()
				.uri(new URI("https://api.assemblyai.com/v2/transcript"))
				.header("Authorization", "564d738e36494f99a7d4bd40d88ddbbb")
				.POST(BodyPublishers.ofString("https://www.computerhope.com/jargon/m/example.mp3"))
				.

	}

}
