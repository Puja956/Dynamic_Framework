package Common_Api_Method;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get_API_Method {
public static int ResponseStatusCode(String baseURI, String Resource) {
		
		RestAssured.baseURI=baseURI;
		
		int StatusCode=given().header("Content-type", "Application/Json").when()
				.get(Resource).then().extract().statusCode();
		return StatusCode;
	}

public static String ResponseBody(String baseURI, String Resource) {
	
	RestAssured.baseURI=baseURI;
	
	String ResponseBody=given().header("Content-type", "Application/Json").when()
			.get(Resource).then().extract().response().asString();
	return ResponseBody;	

}
}
