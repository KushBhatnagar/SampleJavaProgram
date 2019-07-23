package myPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Iterator;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	public static URL url;
	
	public static void main(String[] args) throws IOException, JSONException, ParseException {
		// Proxy proxy = new Proxy(Proxy.Type.HTTP, new
		// InetSocketAddress("web-proxy.cup.hp.com", 8080));
		url = new URL("https://pam-test1.hpconnectedtest.com/pam/healthcheck");
		// HttpsURLConnection connection = (HttpsURLConnection)
		// url.openConnection(proxy);
		HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		connection.setRequestProperty("accept", "application/json");
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);

		}
		in.close();
		JSONParser parser = new JSONParser();
        Object obj = parser.parse(response.toString());
        JSONObject jsonobject = (JSONObject) obj;
		JSONArray dependancyservice = (JSONArray) jsonobject.get("healthTest");
		Iterator iterator = dependancyservice.iterator();
		while (iterator.hasNext()) {
			JSONObject dservice = (JSONObject) iterator.next();
			String Description = (String) dservice.get("description");
			String Result = (String) dservice.get("result");
			System.out.println("Dependancy service details: " + " Description-> " + Description + "result ->" + Result);
			
		}

	}
}
