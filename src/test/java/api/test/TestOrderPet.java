package api.test;

import org.testng.annotations.Test;

import api.endpoints.PetEndpoints;
import api.payload.Pet;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class TestOrderPet {
	@Test(dataProvider="orderPet", dataProviderClass = DataProviders.class)
	public void orderPet(String Id, String PetId, String quantity, String Shipdate, String Status, String x) {
		PetEndpoints pet = new PetEndpoints();
		Pet petPayload = new Pet();
		petPayload.setId(Id);
		petPayload.setPetId(PetId);
		petPayload.setQuantity(quantity);
		petPayload.setShipDate(Status);
		petPayload.setStatus(Status);
		petPayload.setComplete(x);

		Response res = pet.storeOrder(petPayload);
		res.then().log().all();
		
	}
}
