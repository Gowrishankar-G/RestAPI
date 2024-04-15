package CreatingPostRequest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
import org.apache.log4j.BasicConfigurator;

public class Jsonway {
	
	@Test(priority=1)
	
	void HashMp()
	{
		
		HashMap data = new HashMap();
		data.put("firstName","Joe");
		data.put("lastName", "Jackson");
		data.put("gender", "male");
		data.put("age", "28");
		
		
		
		 given()
		   .contentType("Application/json ")
		   .body(data)
		
		.when()
		.post("http://localhost:3000/people")
		
		.then()
		.statusCode(201)
		.body("firstName",equalTo("Joe"))
		.body("gender",equalTo("male"))
		.body("age",equalTo("28"))
		//.header("Content-Type","Application/json; charset=uft-8")
		.log().all();
		
		
		
	}
	
	
	@Test(priority=2)
	void TestDel()
	{
		given()
		
		.when()
		.delete("http://localhost:3000/people/4195")
		
		.then()
		.statusCode(200)
		.log().all();
		
		
		
		
	}

}
