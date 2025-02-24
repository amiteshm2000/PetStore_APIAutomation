package api.endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Routes {


		public static String baseUrl= "https://petstore.swagger.io/v2";
		
//		USER_MODULE
		public static String createUser=baseUrl+"/user";
		public static String getUser = baseUrl+"/user/{username}";
		public static String updateUser=baseUrl+"/user/{username}";
		public static String deleteUser=baseUrl+"/user/{username}";
		
//		Pet_Module
		public static String orderPet = baseUrl +"/store/order";
<<<<<<< HEAD
		public static String addNewPet = baseUrl + "/pet";
=======
>>>>>>> 0265d786e46070fc4451f01ac4b04c4d05f7753a
}
