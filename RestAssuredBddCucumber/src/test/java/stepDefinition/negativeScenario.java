package stepDefinition;
import org.testng.annotations.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class negativeScenario {
        RequestSpecification request;
		Response response;
		@Given("user is on login page")
		public void user_is_on_login_page() {
		    System.out.println("Given");
		    RestAssured.baseURI = "https://reqres.in/api/users/23";
		}

		@When("user enters ()")
		public void  user_enters()
		{		System.out.println("When");
			 RestAssured.given()
	         .when().log().all()
	         .get("https://reqres.in/api/users/23")
	         .then().log().status();
		}
		@Then("unsuccessful login")
		public void unsuccessful_login() {
			System.out.println("Unsuccesful login");

		}
	}