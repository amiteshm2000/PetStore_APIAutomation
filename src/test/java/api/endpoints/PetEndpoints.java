package api.endpoints;

<<<<<<< HEAD
import java.io.File;

=======
>>>>>>> 0265d786e46070fc4451f01ac4b04c4d05f7753a
import api.payload.Pet;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PetEndpoints {

	public Response storeOrder(Pet payload) {
<<<<<<< HEAD
		return RestAssured.given().header("Content-Type", "application/json").body(payload).when().post(Routes.orderPet);
	}
	
	public Response addNewPet(File payload) {
		return RestAssured.given().header("Content-Type", "application/json").body(payload).when().post(Routes.addNewPet);	
=======
		return RestAssured.given().header("Content-Type", "application/JSON").body(payload).when().post(Routes.orderPet);
>>>>>>> 0265d786e46070fc4451f01ac4b04c4d05f7753a
	}
}
