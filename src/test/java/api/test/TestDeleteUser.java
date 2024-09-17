package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class TestDeleteUser {

	@Test(dataProvider="deleteUser", dataProviderClass = DataProviders.class)
	public void testDeleteUserByName(String username) {
//		logger.info("*****Deleting User*****");
		Response res = UserEndPoints.deleteUser(username);
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
//		logger.info("*****User is Deleted*****");
	}
}
