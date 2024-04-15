package Learning;

/*given
 * 
 * 
 * when
 * 
 * 
 * then
 * 
 * 
 * */

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
import org.apache.log4j.BasicConfigurator;

public class HTTPS {
	
	
	
	/*
	 * @Test
	 * 
	 * void getUsers() { given()
	 * 
	 * .when() .get("https://reqres.in/api/users?page=2")
	 * 
	 * .then() .statusCode(200) .body("total_pages",equalTo(2)) .log().all();
	 * 
	 * 
	 * 
	 * }
	 */





   @Test
   void create()
   {
	   HashMap data = new HashMap();
	    data.put("name", "morpheus");
	    data.put("job", "leader");
	   
	   
	   
	   
	   given()
	   .contentType("Application/json ")
	   .body(data)
	   
	   .when()
	   .post("https://reqres.in/api/users")
	   
	   .then()
	   .statusCode(201)
	 //  .body("id",equalTo(306))
	   .log().all();
	   
	   
	   
	   
	   
	   
	   
	   
   }

}
