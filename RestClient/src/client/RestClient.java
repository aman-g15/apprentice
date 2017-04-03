package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class RestClient {

	public static void main(String[] args) {
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet("http://localhost:8080/cooperativebank/rest/bank/name");
		HttpResponse response = null;
		try {
			response = client.execute(request);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (null != response) {
			BufferedReader rd = null;
			try {
				rd = new BufferedReader
				        (new InputStreamReader(
				        response.getEntity().getContent()));
			} catch (UnsupportedOperationException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(null!=rd ){
			try{
				System.out.println(rd.readLine());
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		}

	}
}
