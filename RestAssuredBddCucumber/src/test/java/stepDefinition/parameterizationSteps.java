package stepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class parameterizationSteps {
@DataProvider (name = "DeleteData")
	public Object[] dataForDelete() {
	return new Object[] {4,5,6,7};
	}
	@Test (dataProvider = "DeleteData")
	public void test_delete(int userid ) {
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RestAssured.given()
		.when()
		.delete("/users/"+userid).
		then().
		statusCode(204);
	}
	
	
	@Given("user is able to hit the API")
	public void user_is_able_to_hit_the_api() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    
	}

	@When("user set request Header with body and Delete some values")
	public void user_set_request_header_with_body_and_delete_some_values() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	         
	        		 
	}

	@Then("user recieves Delete response")
	public void user_recieves_delete_response() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	       
	        	

	}

}