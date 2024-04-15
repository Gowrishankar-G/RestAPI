package GoRestChaining;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.gson.JsonObject;

import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;

public class createUser {
	
	@Test
	void craeteUsr(ITestContext context)
	{
		
		Faker fake = new Faker(); 
		JSONObject jsonobj = new JSONObject();
		jsonobj.put("name", fake.name().fullName());
		jsonobj.put("gender", "female");
		jsonobj.put("email", fake.internet().emailAddress());
		jsonobj.put("status", "active");

		String bearer_Token = "845a8e8e732ceb297d556e71570af14affd7badd670ffa866a682e2d936b400f";

		long id = given()
		        .headers("Authorization","Bearer "+bearer_Token)
		        .contentType("application/json")
		        .body(jsonobj.toString())
		        
		        
		        .when()
		        .post("https://gorest.co.in/public/v2/users")
		        .jsonPath() .getLong("id");
		System.out.println(id);
		
		context.setAttribute("user_id", id);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
