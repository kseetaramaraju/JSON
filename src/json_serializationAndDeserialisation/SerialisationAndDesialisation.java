package json_serializationAndDeserialisation;

import com.google.gson.Gson;

public class SerialisationAndDesialisation {
	public static void main(String[] args) throws Exception {

		// serialisation 
		// convertig java to json
		Gson om=new Gson();
		Student s=new Student(10,"raju");
		String jsonobject = om.toJson(s);
		System.out.println(jsonobject);

		System.out.println("------------");

		// De-serialisation 
		// convertig json to java

		Gson de=new Gson();
		String jsondata="{\"id\":10,\"name\":\"raju\"}";

		Student fromJson = de.fromJson(jsondata,Student.class);
		System.out.println(fromJson);

	}
}
