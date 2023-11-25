package json;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonfromlist {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("California");
		list.add("Texas");
		list.add("Hawaii");
		list.add("Alaska");
		JSONArray ja = new JSONArray(list);
		System.out.println(ja);

	}

}
