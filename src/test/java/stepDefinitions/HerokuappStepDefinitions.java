package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuPage;

public class HerokuappStepDefinitions {
    HerokuPage herokuPage = new HerokuPage();

    @When("Clicks on the Add Element button.")
    public void clicks_on_the_add_element_button() {
        herokuPage.addElementButton.click();
    }
    @When("Tests the visibility of the Delete button.")
    public void tests_the_visibility_of_the_delete_button() {
        Assert.assertTrue(herokuPage.deleteButton.isDisplayed());
    }
    @Then("Clicks on the Delete button.")
    public void clicks_on_the_delete_button() {
        herokuPage.deleteButton.click();
    }
    @And("Tests the visibility of the Add Remove Elements text.")
    public void testsTheVisibilityOfTheAddRemoveElementsText() {
        Assert.assertTrue(herokuPage.addRemoveText.isDisplayed());
    }
}
