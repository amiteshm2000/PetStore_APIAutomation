package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class TestCreateUser {

	@Test(dataProvider = "createUser", dataProviderClass = DataProviders.class)
	public void testUsercreation(String username, String firstname, String lastname, String email, String pwd,
			String ph) {
		// TODO Auto-generated constructor stub
		User createpayload = new User();
		createpayload.setUsername(username);
		createpayload.setFirstname(firstname);
		createpayload.setLastname(lastname);
		createpayload.setEmail(email);
		createpayload.setPassword(pwd);
		createpayload.setPhone(ph);

		Response res = UserEndPoints.createUser(createpayload);
		Assert.assertEquals(res.getStatusCode(), 200);
	}
}
