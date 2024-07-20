package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class ApiStep {

    ApiPage apiPage;

    public ApiStep(){
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

    @Then("validation status code is equals to {int}")
    public void validationStatusCodeIsEqualsTo(int status_code) {
        apiPage.validationStatusCodeIsEqualsTo(status_code);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);
    }
}
