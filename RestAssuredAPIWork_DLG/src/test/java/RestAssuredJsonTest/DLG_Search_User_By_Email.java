package RestAssuredJsonTest;

import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class DLG_Search_User_By_Email {
	
	

	
	@Test
	public void getJsonApiData()
	{
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RestAssured.basePath = "/users";
		
		ArrayList<Integer> Ids = given().contentType(ContentType.JSON).log().all()
				.get().then().extract().path("id");
		
		for(Integer m: Ids)
		{
			String eMail = given().contentType(ContentType.JSON)
				.get("/"+m).then().extract().path("email");
			System.out.println("For User "+ m +" ::the email id is  ::"+eMail);
		}
	}

}
