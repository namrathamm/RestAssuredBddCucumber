package stepDefinition;
import org.testng.annotations.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class RestAssuredBDDScenariosteps {

	RequestSpecification request;
	Response response;
	@Given("API Testing")
	public void api_testing() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Given");
		    RestAssured.baseURI = "https://reqres.in/api/users";
	}

	@When("Retrieve correct info")
	public void retrieve_correct_info() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		 RestAssured.given()
        .when().log().all()
        .get("https://reqres.in/api/users")
        .then().log().status();
	}

	@Then("validate positive response of code")
	public void validate_positive_response_of_code() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Successful login");
	}

}