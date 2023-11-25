package json;

import org.json.JSONObject;

public class creatingjson {
	public static void main (String args[]) {
		JSONObject jo = new JSONObject();
		jo.put("Name", "Yeshwanth");
		jo.put("DOB", "31-05-1999");
		jo.put("Age", "22");
		jo.put("City", "Chennai");
		jo.put("Zip", "603002");
		jo.put("Qualification", "BE-CSE");
		jo.put("Designation", "Software Engineer");
		jo.put("Company", "ABC Technolog Pvt Ltd.");
		System.out.println(jo);
		System.out.println("---pretty json---");
		System.out.println(jo.toString(4));
	}

}
