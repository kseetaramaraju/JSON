package convert_xml_to_json;

import org.json.JSONObject;
import org.json.XML;

import com.google.gson.JsonObject;

public class Covert_Xml_To_Json {

	public static void main(String[] args) {

		String xml="<Flower><name>Poppy</name><color>RED</color><petals>9</petals></Flower>";

		JSONObject jsonObject=XML.toJSONObject(xml);

		String string = jsonObject.toString();
		System.out.println(string);

	}


}
