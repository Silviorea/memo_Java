package JSON.Lecture;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestValidJson {

	
	public static void main(String[] args) {

		String validJson = "{ \n"
						  + "\"name\":\"John\","
						  + "\"age\":30,"
						  + "\"city\":\"New York\""
						  + "\n }   ";
		
		String invalidJson = "{ \n"
				  			  + "\"name\":\"John\","
							  + "\"age\":30,"
							  + "\"city\":\"New York\""
							  + "\n   "; 				// <= I forgot a brace '}' here
		
		System.out.println("Is validJson a valid Json? = " + isValidJson(validJson));
		System.out.println("Is validJson a valid Json? = " + isValidJson(invalidJson));
		

	}

	public static boolean isValidJson(String jSonString)
	{
		ObjectMapper mapper = new ObjectMapper();
		
//	Le Json passé en paramètre (string, inputStream, file, etc...) peut il etre converti en Arbre Json?
//	Son format va t'il permetre de créer correctement les differents noeud de l'objet JsonNode?
		
		try
		{
			JsonNode jsonNode = mapper.readTree(jSonString);
			return true;
		} 
		
		catch (JsonProcessingException e) 
		{
			e.printStackTrace();
			return false;
		}
		
	}

}
