package jsonReadandWrite;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsonWriting {

	public static void main(String[] args) throws IOException {
		
		JSONObject jsonObject= new JSONObject();
		jsonObject.put("Name", "Dinesh");
		jsonObject.put("Age", 5);
		
		JSONArray array = new JSONArray();
		array.add("Nice person");
		array.add("Good Leader");
		jsonObject.put("Special Qualities", array);
		
		FileWriter fileWriter = new FileWriter("Dinesh.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();

	}

}
