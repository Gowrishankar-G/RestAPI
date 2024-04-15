package faker;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.gson.JsonObject;

import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;

public class Fakerlib {
	
	@Test
	
	void Fakerlibrary()
	{
		
		Faker lib = new Faker();
		
		String fullName = lib.name().fullName();
		
		String lastName = lib.name().lastName();
		String bloodGroup = lib.name().bloodGroup();
		
		
		System.out.println("FirstName is  " +fullName);
		System.out.println("lastName is  " +lastName);
		System.out.println("bloodGroup is  " +bloodGroup);
		
	}

}
