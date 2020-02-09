package RestAssuredJsonTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class DLG_POST_Request
{


		@Test 
		public void testSerialization() 
		{
				
				User user = new User(12,"Dawood","Mohammed","David","sincere@april.bic","kylues stop","apt 345","genbrough","p2998-3874","-37.3159","81.1496","1-770-736-8031 x5644","gmail.com","Romaguera-Crona","Multi-layered client-server neural-net","harness real-time e-markets");
				
				given().
                	contentType("application/json; charset=utf-8").
                	body(user).	
                when().
                	post("http://jsonplaceholder.typicode.com/users").
                then()
               .assertThat().statusCode(201).log().all()
               .assertThat().statusLine("HTTP/1.1 201 Created");
		

		}
	
		public class User {

			public int id;
			public String name;
			public String username;
			public String email;
			public String street;
			public String suite;
			public String city;
			public String zipcode;
			public String geolat;
			public String geolang;
			public String companyname;
			public String website;
			public String phone;
			public String companycatchphrase;
			public String companybs;
			
			public User(int id,String name,String username, 
					String email,String street,String suite,String city,String address,String zipcode,String geolat,String geolang,
					String companyname,String website,String companycatchphrase,String phone,String companybs)
			{
			   this.id=id;
			   this.name = name;
			   this.username = username;
			   this.email=email;
			   this.street=street;
			   this.suite = suite;
			   this.city = city;
			   this.zipcode = zipcode;
			   this.geolat=geolat;
			   this.geolang=geolang;
			   this.companyname=companyname;
			   this.website=website;
			   this.phone=phone;
			   this.companycatchphrase=companycatchphrase;
			   this.companybs=companybs;
			}
			
			
			public int setId(int id)
			{
				return this.id;
			}
			public int getId(int id)
			{
				return this.id;
			}
			public String setName(String name)
			{
				return this.name;
			}
			public String getName(String name)
			{
				return this.name;
			}
			
			
			public String setUsername(String username)
			{
				return this.username;
			}
			public String getUsername(String username)
			{
				return this.username;
			}
			
			public String setEmail(String email)
			{
				return this.email;
			}
			public String getEmail(String email)
			{
				return this.email;
			}
			
			public String setStreet(String street)
			{
				return this.street;
			}
			public String getStreet(String street)
			{
				return this.street;
			}
			public String setSuite(String suite)
			{
				return this.suite;
			}
			public String getSuite(String suite)
			{
				return this.suite;
			}
			
			public String setCity(String city)
			{
				return this.city;
			}
			public String getCity(String city)
			{
				return this.city;
			}
			
			public String setZipcode(String zipcode)
			{
				return this.zipcode;
			}
			
			
			public String getZipcode(String zipcode)
			{
				return this.zipcode;
			}
			
			public String setGeolat(String geolat)
			{
				return this.geolat;
			}
			public String getGeolat(String geolat)
			{
				return this.geolat;
			}
			
			public String setGeolang(String geolang)
			{
				return this.geolang;
			}
			public String getGeolang(String geolang)
			{
				return this.geolang;
			}
			public String setPhone(String phone)
			{
				return this.phone;
			}
			public String getPhone(String phone)
			{
				return this.phone;
			}
			
			public String setWebsite(String website)
			{
				return this.website;
			}

			public String getWebsite(String website)
			{
				return this.website;
			}
			public String setCompanyname(String companyname)
			{
				return this.companyname;
			}
			public String getCompanyname(String companyname)
			{
				return this.companyname;
			}
			
			public String setCompanycatchphrase(String companycatchphrase)
			{
				return this.companycatchphrase;
			}
			public String getCompanycatchphrase(String companycatchphrase)
			{
				return this.companycatchphrase;
			}
			public String setCompanybs(String companybs)
			{
				return this.companybs;
			}
			
			public String getCompanybs(String companybs)
			{
				return this.companybs;
			}

		}


}




   
	


