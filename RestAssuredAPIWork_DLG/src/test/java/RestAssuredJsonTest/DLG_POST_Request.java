package RestAssuredJsonTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;;

public class DLG_POST_Request {


	@Test
	public void postJsonApiData()
	{

			Map<String,String> car = new HashMap<>();
			car.put("name", "dawood");
			car.put("username", "audi");
			car.put("email", "red");
			car.put("address.street", "red");
			car.put("address.suite", "red");
			car.put("address.city", "red");
			car.put("address.zipcode", "red");
			car.put("address.geo.lat", "red");
			car.put("address.geo.lng", "red");
			car.put("phone", "red");
			car.put("website", "red");
			car.put("company.name", "red");
			car.put("company.catchPhrase", "red");
			car.put("company.bs", "red");

			given()
			.contentType("application/json")
			.body(car)
			.when().post("/users").then()
			.statusCode(200);

	}
}
