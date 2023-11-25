package json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class jsonfrommap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", "Yeshwanth");
		map.put("DOB", "31-05-1999");
		map.put("Age", "22");
		map.put("City", "Chennai");
		map.put("Zip", "603002");
		map.put("Qualification", "BE-CSE");
		map.put("Designation", "Software Engineer");
		map.put("Company", "ABC Technolog Pvt Ltd.");
		System.out.println("----Map---");
		System.out.println(map);
		System.out.println("----json---");
		JSONObject jo = new JSONObject(map);
		System.out.println(jo.toString(4));

	}

}
