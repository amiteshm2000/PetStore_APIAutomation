package api.test;

import java.io.File;

import org.testng.annotations.Test;

import api.endpoints.PetEndpoints;
import io.restassured.response.Response;

public class TestAddNewPet {

	@Test
	public void addNewPet() {
		File file = new File("/src/test/resources/JSON Payload/addPet.json");
		PetEndpoints addpet = new PetEndpoints();
		Response res = addpet.addNewPet(file);
		res.then().log().all();
	}
}