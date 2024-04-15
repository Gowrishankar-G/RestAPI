package PathAndQueryParameter;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;

public class CookiesNHeaders {
	
	@Test
	void cookie()
	{
		
		given()
		
		.when()
		.get("https://www.google.com/")
		
		
		.then()
		.log().all();
		
	}

}
