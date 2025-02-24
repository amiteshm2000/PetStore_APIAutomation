package api.endpoints;

import java.io.File;

import api.payload.Pet;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PetEndpoints {

	public Response storeOrder(Pet payload) {
		return RestAssured.given().header("Content-Type", "application/json").body(payload).when().post(Routes.orderPet);
	}
	
	public Response addNewPet(File payload) {
		return RestAssured.given().header("Content-Type", "application/json").body(payload).when().post(Routes.addNewPet);	
	}
}
