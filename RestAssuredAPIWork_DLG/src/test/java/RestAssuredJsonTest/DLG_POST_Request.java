package RestAssuredJsonTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class DLG_POST_Request {

	//public static HashMap car = new HashMap();

//	@BeforeClass
//	public void postJsonApiData()
//	{
//
//			
//			
//			RestAssured.baseURI="https://jsonplaceholder.typicode.com";
//			RestAssured.basePath="/users";
//		
//	}
	
	public class Car {

		private String name;

		private String setName(String name)
		{
			return this.name;
		}
		 
		private String username;
		private String setUsername()
		{
			return this.username;
		}
		private String email;
		private String setEmail()
		{
			return this.email;
		}
		private String street;
		private String setStreet()
		{
			return this.street;
		}
		private String suite;
		private String setSuite()
		{
			return this.suite;
		}
		private String city;
		private String setCity()
		{
			return this.city;
		}
		private String zipcode;
		private String setZipcode()
		{
			return this.zipcode;
		}
		private int geolat;
		private int setGeolat()
		{
			return this.geolat;
		}
		private int geolang;
		private int setGeolang()
		{
			return this.geolang;
		}
		
		private int phone;
		private int setPhone()
		{
			return this.phone;
		}
		private String website;
		private String setWebsite()
		{
			return this.website;
		}
		private String companyname;
		private String setCompanyname()
		{
			return this.companyname;
		}
		private String companycatchphrase;
		private String setCompanycatchphrase()
		{
			return this.companycatchphrase;
		}
		private String companybs;
		private String setCompanybs()
		{
			return this.companybs;
		}

	}
	
	
	@Test
	public void aCarObjectGoesIntoTheGarage() {
		Car car = new Car();
		car.setName("Albina");
		car.setUsername();
		car.


		given()
		.contentType("application/json")
		.body(car)
		.when().post("/garage/slots").then()
		.body("empty",equalTo(false))
		.body("position",lessThan(150));
	}
	
	@Test
	public void testPostJsonApiData()
	{
		given()
			.contentType("application/json; charset=UTF-8")
			.body(car)
		.when()
			.post()
			
		.then()
			.statusCode(200)
			.and()
			.body("SuccessCode",equalTo("OPERATION_SUCCESS"))
			.and()
			.body("Message",equalTo("Operation Completed Successfully"));

	}		
		

	}

