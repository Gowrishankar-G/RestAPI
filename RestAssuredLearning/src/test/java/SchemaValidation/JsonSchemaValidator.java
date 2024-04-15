package SchemaValidation;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;

public class  JsonSchemaValidator{
	
	
	@Test
	
	void JsonSchema()
	{
		
		given()
		
		.when()
		.get("http://localhost:3000/people")
		
		.then()
		.log().all();
	//	.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
		
	}
	

}