package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class TestUpdateUserData {

	@Test(dataProvider="updateUser", dataProviderClass = DataProviders.class)
	public void testUpdateUserByName(String username, String firstname, String lastname, String email) {
		User userpayload = new User();
		userpayload.setFirstname(firstname);
		userpayload.setLastname(lastname);
		userpayload.setEmail(email);
		Response res = UserEndPoints.updateUser(userpayload ,username);
		Assert.assertEquals(res.statusCode(), 200);
//		res.then().log().all();
		
//		Response resAfterupdate = UserEndPoints.getUser(username);
//		Assert.assertEquals(resAfterupdate.statusCode(), 200);
//		resAfterupdate.then().log().all();

	}
}
