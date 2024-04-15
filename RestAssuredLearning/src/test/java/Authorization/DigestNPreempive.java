package Authorization;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;

public class DigestNPreempive {
	
	@Test(priority=1)
	void DigestAuthentification()
	
	{
		given()
		.auth().digest("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.log().all();		
		
		
		
	}
	
	@Test(priority=2)
void prempiveAuthentification()
	
	{
		given()
		.auth().preemptive().basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.log().all();		
		
		
		
	}
	
	
	
	

}
