package sk.itcloud.webmin;

import java.io.*;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class WebminAPI {

	public WebminAPI() throws IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://targethost/homepage");
		CloseableHttpResponse response1 = null;

		try {
			response1 = httpclient.execute(httpGet);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(response1.getStatusLine());
			HttpEntity entity1 = response1.getEntity();
			EntityUtils.consume(entity1);
		} finally {
			response1.close();
		}
	}

	public void listDomains() {

	}
}