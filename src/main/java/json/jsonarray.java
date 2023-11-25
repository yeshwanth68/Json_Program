package json;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonarray {

	public static void main(String[] args) {
		JSONArray ja = new JSONArray();     /// creating json array
		ja.put("Personal Details");
		JSONObject jo = new JSONObject();   ///creating json object and put into json array
		jo.put("Name", "Yeshwanth");
		jo.put("DOB", "31-05-1999");
		jo.put("Age", "22");
		jo.put("City", "Chennai");
		jo.put("Zip", "603002");
		jo.put("Qualification", "BE-CSE");
		jo.put("Designation", "Software Engineer");
		jo.put("Company", "ABC Technolog Pvt Ltd.");
		ja.put(jo);
		System.out.println("---json array---");
		System.out.println(ja.toString(4));

		
		

	}

}
