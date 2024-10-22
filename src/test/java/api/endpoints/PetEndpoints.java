package api.endpoints;

import api.payload.Pet;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PetEndpoints {

	public Response storeOrder(Pet payload) {
		return RestAssured.given().header("Content-Type", "application/JSON").body(payload).when().post(Routes.orderPet);
	}
}
