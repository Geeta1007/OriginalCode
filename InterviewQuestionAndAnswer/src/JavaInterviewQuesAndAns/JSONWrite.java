package JavaInterviewQuesAndAns;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Viyan");
		jsonObject.put("Age", 1);
		
		JSONArray array = new JSONArray();
		array.add("Magic smile");
		array.add("Magnetic eyes");
		
		jsonObject.put("Special qualities", array);
		
		FileWriter fileWriter = new FileWriter("JSONWrite.txt");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		
	}

}
