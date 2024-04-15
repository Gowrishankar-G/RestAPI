package PathAndQueryParameter;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;

public class header {
	
	@Test
	void cookie()
	{
		
		given()
		
		.when()
		.get("https://www.google.com/")
		
		
		.then()
		.header("Content-Type","text/html; charset=ISO-8859-1")
		.log().all();
		
	}

}
