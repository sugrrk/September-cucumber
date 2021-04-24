import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLOutput;

public class HttpClientClass  {
    @Test
    public void GetMethod() throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("https://reqres.in/api/users?page=2");
HttpResponse response = httpclient.execute(httpget);
    System.out.println(response.toString());
}
}