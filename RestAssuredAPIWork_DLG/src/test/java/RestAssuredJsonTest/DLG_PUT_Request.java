package RestAssuredJsonTest;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class DLG_PUT_Request
{

		public static HashMap map = new HashMap();
		private final String CONTEXT_PATH = "http://jsonplaceholder.typicode.com";
		String newName = "Davvvid";
		String newUsername = "Mohamedede";
		String newEmail = "mohammeddda@gmail.com";
		int userId = 1;

		@BeforeClass
		public void insertData()
		{

			map.put("name",newName);
			map.put("username",newUsername);
			map.put("email",newEmail);
			
		}
		
		@Test
		public void putData()
		{
		
			given().
            	contentType("application/json; charset=utf-8").
            	body(map).	
            when().
            	put(CONTEXT_PATH+"/users/"+userId).
            then()
            	.statusCode(200)
                .assertThat().statusCode(200).log().all()
                .assertThat().statusLine("HTTP/1.1 200 OK");

		}


}




   
	


