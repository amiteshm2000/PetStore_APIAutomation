package api.test;

<<<<<<< HEAD
import org.testng.Assert;
import org.testng.ITestContext;
=======
>>>>>>> 0265d786e46070fc4451f01ac4b04c4d05f7753a
import org.testng.annotations.Test;

import api.endpoints.PetEndpoints;
import api.payload.Pet;
import api.utilities.DataProviders;
import io.restassured.response.Response;

<<<<<<< HEAD
public class TestOrderPet{
	@Test(dataProvider="orderPet", dataProviderClass = DataProviders.class)
	public void orderPet(ITestContext context, String Id, String PetId, String quantity, String Shipdate, String Status, String x) {
=======
public class TestOrderPet {
	@Test(dataProvider="orderPet", dataProviderClass = DataProviders.class)
	public void orderPet(String Id, String PetId, String quantity, String Shipdate, String Status, String x) {
>>>>>>> 0265d786e46070fc4451f01ac4b04c4d05f7753a
		PetEndpoints pet = new PetEndpoints();
		Pet petPayload = new Pet();
		petPayload.setId(Id);
		petPayload.setPetId(PetId);
		petPayload.setQuantity(quantity);
		petPayload.setShipDate(Status);
		petPayload.setStatus(Status);
		petPayload.setComplete(x);

		Response res = pet.storeOrder(petPayload);
<<<<<<< HEAD
//		int id=res.jsonPath().getInt("./Id");
//		context.getSuite().setAttribute(Id, id);
		res.then().log().all();
//		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
=======
		res.then().log().all();
		
	}
>>>>>>> 0265d786e46070fc4451f01ac4b04c4d05f7753a
}
