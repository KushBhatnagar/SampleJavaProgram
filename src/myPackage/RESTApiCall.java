package myPackage;

/**
 * @author Kush:
 * This class will make simple GET call to a Health check REST API to get staus code 
 *
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONException;
import org.json.JSONObject;

public class RESTApiCall {
	public static URL url;
	public static int statusCode;
	public static String healthStatus;

	public static void getHealthcheckResponse() throws IOException, InterruptedException, JSONException {

		url = new URL("https://pam-test1.hpconnectedtest.com/pam/healthcheck");

		HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		statusCode = connection.getResponseCode();
		System.out.println("Status Code of Service is =" + statusCode);

	}

	public static void main(String[] args) throws JSONException {
		System.out.println("Calling the API");
		try {
			getHealthcheckResponse();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}