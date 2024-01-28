package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SaucedemoPage;

public class SaucedemoStepDefinitions {
    SaucedemoPage saucedemoPage = new SaucedemoPage();
    String firstProduct;
    @Then("Enters {string} into the saucedemo username box.")
    public void enters_into_the_saucedemo_username_box(String username) {
        saucedemoPage.usernameBox.sendKeys(username);
    }
    @Then("Enters {string} into the saucedemo password box.")
    public void enters_into_the_saucedemo_password_box(String password) {
        saucedemoPage.passwordBox.sendKeys(password);
    }
    @Then("Clicks on the login button on saucedemo.")
    public void clicks_on_the_login_button_on_saucedemo() {
        saucedemoPage.loginButton.click();
    }
    @Then("Saves the name of the first product and goes to its page.")
    public void saves_the_name_of_the_first_product_and_goes_to_its_page() {
        firstProduct = saucedemoPage.firstProductName.getText();
        saucedemoPage.firstProductName.click();
    }
    @When("Clicks on the Add to Cart button on saucedemo.")
    public void clicksOnTheAddToCartButtonOnSaucedemo() {
        saucedemoPage.firstProductAddToCartButton.click();
    }
    @Then("Clicks on the shopping cart icon on saucedemo.")
    public void clicks_on_the_shopping_cart_icon_on_saucedemo() {
        saucedemoPage.shoppingCart.click();
    }
    @Then("Tests that the selected product is successfully added to the cart.")
    public void tests_that_the_selected_product_is_successfully_added_to_the_cart() {
        Assert.assertTrue(firstProduct.equals(saucedemoPage.inventoryItem.getText()));
    }


}
