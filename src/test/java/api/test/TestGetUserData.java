package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class TestGetUserData {

	@Test(dataProvider = "getUser", dataProviderClass = DataProviders.class)
	public void testDeleteUserByName(String username) {
		Response res = UserEndPoints.getUser(username);
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
		res.time();
	}
}
