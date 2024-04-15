package Authorization;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;

public class Basic {
	
	
	@Test
	void BasicAuthentification()
	{
		given()
		.auth().basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().all();
		
		
	}

}
