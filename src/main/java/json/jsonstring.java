package json;

import org.json.JSONObject;
// creating the json string to json object
public class jsonstring {

	public static void main(String[] args) {
		String json= "{\"Zip\":\"603002\",\"Designation\":\"Software Engineer\",\"Qualification\":\"BE-CSE\",\"Company\":\"ABC Technolog Pvt Ltd.\",\"DOB\":\"31-05-1999\",\"City\":\"Chennai\",\"Age\":\"22\",\"Name\":\"Yeshwanth\"}";
		
		System.out.println(json);
		
		JSONObject js=new JSONObject(json);
		System.out.println(js.toString(4));
	}

}
