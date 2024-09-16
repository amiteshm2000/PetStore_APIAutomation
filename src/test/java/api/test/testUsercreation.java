package api.test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;

public class testUsercreation {
	User userPayload;
	public Logger logger;
	Faker fake = new Faker();
	@BeforeTest()
	public void setupData() {
		userPayload = new User();
		userPayload.setFirstname(fake.name().firstName());
		userPayload.setLastname(fake.name().lastName());
		userPayload.setPassword(fake.internet().password());
		userPayload.setPhone("54678");
		userPayload.setUsername(fake.name().username());
		userPayload.setEmail(fake.internet().emailAddress());
		userPayload.setUserStatus(0);
//		log intitialization
		logger=LogManager.getLogger(this.getClass());
	}

	@Test(priority=1)
	public void testUserCreation() {
		// TODO Auto-generated constructor stub
		logger.info("*****Creating User*****");
		Response res = UserEndPoints.createUser(userPayload);
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
		logger.info("*****User is Created*****");
	}

	@Test(priority=2)
	public void testGetUserByName() {
		// TODO Auto-generated constructor stub
		logger.info("*****Searching for created User*****");
		Response res = UserEndPoints.getUser(this.userPayload.getUsername());
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
		logger.info("*****User is Displayed*****");
	}
	
	@Test(priority=3)
	public void testUpdateUserByName() {
		// TODO Auto-generated constructor stub
		logger.info("*****Updating user Information*****");
		userPayload.setFirstname(fake.name().firstName());
		userPayload.setLastname(fake.name().lastName());
		userPayload.setEmail(fake.internet().emailAddress());
		Response res = UserEndPoints.updateUser(userPayload ,this.userPayload.getUsername());
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
		
		Response resAfterupdate = UserEndPoints.getUser(this.userPayload.getUsername());
		Assert.assertEquals(resAfterupdate.statusCode(), 200);
		resAfterupdate.then().log().all();
		logger.info("*****User iinformation Updated*****");
	}
	
	@Test(priority=4)
	public void testDeleteUserByName() {
		logger.info("*****Deleting User*****");
		Response res = UserEndPoints.deleteUser(this.userPayload.getUsername());
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
		logger.info("*****User is Deleted*****");
	}
}
