package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiPage;

public class ApiStep {

    ApiPage apiPage;

    public ApiStep() {
        this.apiPage = new ApiPage();
    }

//    @Given("prepare url valid for get list data")
//    public void prepareURLValidForGetListData(String){
//        apiPage.prepareURL();
//    }

    @Given("prepare url for {string}") //the string can dynamically change
    public void prepareUrlFor(String url) {
        apiPage.prepareURLFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();
    }

    @When("hit api create new user")
    public void hitApiCreateNewUser() {
        apiPage.hitApiCreateNewUsers();
    }

    @Then("validation status code is equals to {int}")
    public void validationStatusCodeIsEqualsTo(int status_code) {
        apiPage.validationStatusCodeIsEqualsTo(status_code);
    }

    @Then("validation status code is not equals to {int}")
    public void validationStatusCodeIsNotEqualsTo(int status_code) {
        apiPage.validationStatusCodeIsNotEqualsTo(status_code);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);
    }

    @When("hit api get list users with invalid endpoint")
    public void hitApiGetListUsersWithInvalidEndpoint() {
        apiPage.hitApiGetListUsersWithInvalidEndpoint();
    }

    @When("hit api get list users with invalid parameter {string} {string}")
    public void hitApiGetListUsersWithInvalidParameter(String parameter, String value) {
        apiPage.hitApiGetListUsersWithInvalidParameters(parameter, value);
    }

    @Then("validation response body contains error message {string}")
    public void validationResponseBodyContainsErrorMessage(String errorMessage) {
        apiPage.validationResponseBodyContainsErrorMessage(errorMessage);
    }

    @And("validation response body contains user data")
    public void validationResponseBodyContainsUserData() {
        apiPage.validationResponseBodyContainsUserData();
    }

}


