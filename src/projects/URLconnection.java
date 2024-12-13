package projects;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class URLconnection {
	String link="https://www.facebook.com/";
	
	@Test
	public void responsepg() {
		try {
		URL u=new URL(link);
		HttpURLConnection constant=(HttpURLConnection)u.openConnection();
		int code=constant.getResponseCode();
		System.out.println(code);
		if(code==200) {
			System.out.println("successful link");
		}
		else {
			System.out.println("Not a successful link");
		}
	}
		catch(Exception e) {
			
		}

}
}
