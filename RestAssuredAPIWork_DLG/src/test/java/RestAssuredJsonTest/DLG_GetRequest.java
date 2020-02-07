package RestAssuredJsonTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;;

public class DLG_GetRequest {
	
	@Test
	public void getJsonApiData()
	{
		given()
		.when()
			.get("https://jsonplaceholder.typicode.com/users/1")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("name",equalTo("Leanne Graham"))
		.body("email",equalTo("Sincere@april.biz"))	
		.body("phone",equalTo("1-770-736-8031 x56442"))
		.body("website",equalTo("hildegard.org"))
		.body("address.street",equalTo("Kulas Light"))
		.body("address.suite",equalTo("Apt. 556"))
		.body("address.city",equalTo("Gwenborough"))
		.body("address.zipcode",equalTo("92998-3874"))
		.body("address.geo.lat",equalTo("-37.3159"))
		.body("address.geo.lng",equalTo("81.1496"));
		//test ended
				

		
		
		
	}

}
