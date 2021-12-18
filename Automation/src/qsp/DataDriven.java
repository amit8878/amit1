package qsp;

import java.util.HashMap;

public class DataDriven {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<>();
		hm.put("url", "https://demo.actitime.com");
		hm.put("username", "admin");
		hm.put("email", "admin@actitime");
		hm.put("password", "manager");
		
		System.out.println(hm.get("username"));

	}

}
