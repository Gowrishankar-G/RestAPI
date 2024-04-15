package ParsingResponseBody;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.response.Response;

import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;

public class ParsingResponseJson {
	
	/*
	 * @Test void responseFromJson() {
	 * 
	 * given()
	 * 
	 * .when() .get("http://localhost:3000/people")
	 * 
	 * .then() .statusCode(200) .header("Content-Type", "application/json")
	 * //.body("people[2].firstName",equalTo("Emily")) .log().all(); }
	 */
	
	
	
	
	
	@Test
	void responsem2() 
	{
		Response res = given()
		.contentType("Content-Type.JSON")
		
		.when()
		.get("http://localhost:3000/people");
		
		Assert.assertEquals(res.getStatusCode(),200);
		
		Assert.assertEquals(res.header("Content-Type"),"application/json");
		
		String path = res.jsonPath().get("[2].id").toString();
		System.out.println(path);
		
		
		
		
		
	}

}





