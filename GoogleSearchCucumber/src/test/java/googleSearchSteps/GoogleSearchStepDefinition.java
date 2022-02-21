package googleSearchSteps;

import googleSearchPages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDefinition {
	
	loginPage loginpage = new loginPage();
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	   System.out.println("User will be on login page.");
	   loginpage.verifyLoging();
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		System.out.println("User will get the title.");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		System.out.println("The title will be 'Login my store.");
	}

}
