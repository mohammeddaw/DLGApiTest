package RestAssuredJsonTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
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


public class DLG_POST_DifferentTest
{

		public static HashMap map = new HashMap();
		private final String CONTEXT_PATH = "http://jsonplaceholder.typicode.com";

		@Test
		public void testpost()
		{
			
			List<Map<String, Object>> userAddress = new ArrayList<>();
			
			Map<String,Object > address = new HashMap<>();
			address.put("street","blue line");
			address.put("suite","Apt 12345");
			address.put("city","Ablue");
			address.put("zipcode","92998-3874");
			
			userAddress.add(address);
			
			List<Map<String, Object>> userAddressGeo = new ArrayList<>();
			
			
			Map<String,Object > addressgeo = new HashMap<>();
			addressgeo.put("lat","-37.3159");
			addressgeo.put("lng","87.3159");
			
			Map<String,Object > company = new HashMap<>();
			company.put("name","Romaguera-Cronb");
			company.put("catchPhrase","Multi-layered client-server neural-net");
			company.put("bs","harness real-time e-markets");
			
			userAddressGeo.add(addressgeo);
			
			Map<String,Object > userDetails = new HashMap<>();
			
			
			userDetails.put("name","Dawood Mohammed");
			userDetails.put("username","mohammeddaw");
			userDetails.put("email","mohammeddae@gmail.com");
			userDetails.put("address",userAddress);
			userDetails.put("geo",addressgeo);		
			userDetails.put("phone","1-770-736-8031 x56442");
			userDetails.put("website","hildegard.org");
			userDetails.put("company",company);
			
			
			
			given().
            	contentType("application/json; charset=utf-8").
            	body(userDetails).	
            when().
            	post(CONTEXT_PATH+"/users/1").
            then()
            .assertThat().statusCode(201).log().all()
            .assertThat().statusLine("HTTP/1.1 201 Created");
			
		
     
      
         
           
       
		
		}


}




   
	


