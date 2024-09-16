package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import com.github.javafaker.Faker;
import api.payload.User;
import io.restassured.response.Response;

//	to perform CRUD operation
public class UserEndPoints {

	public static Response createUser(User userPayload) {
//	TODO Auto-generated constructor stub
		Response res = given().header("Content-Type", "application/JSON").body(userPayload).when()
				.post(Routes.createUser);
		return res;
	}

	public static Response getUser(String username) {
//		TODO Auto-generated constructor stub

		Response res = given().header("Content-Type", "application/JSON").pathParam("username", username).when()
				.get(Routes.getUser);
		return res;
	}
	
	public static Response updateUser(User userPayload, String username) {
//		TODO Auto-generated constructor stub

		Response res = given().header("Content-Type", "application/JSON")
				.pathParam("username", username)
				.body(userPayload)
				.when()
				.put(Routes.updateUser);
		return res;
	}
	
	public static Response deleteUser(String username) {
//		TODO Auto-generated constructor stub

		Response res = given().header("Content-Type", "application/JSON")
				.pathParam("username", username)
				.when()
				.delete(Routes.deleteUser);
		return res;
	}
}

