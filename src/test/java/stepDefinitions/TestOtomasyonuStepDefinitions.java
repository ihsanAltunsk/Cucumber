package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.IOException;

public class TestOtomasyonuStepDefinitions {
    TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();
    Sheet sayfa1;
    int productStockCount;
    @Given("User goes to the test automation homepage.")
    public void user_goes_to_the_test_automation_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @Then("Types phone in the search box and presses ENTER.")
    public void types_phone_in_the_search_box_and_presses_enter() {
        testOtomasyonuPage.searchBox.sendKeys("phone" + Keys.ENTER);
    }
    @Then("Tests that a product can be found in the search results.")
    public void tests_that_a_product_can_be_found_in_the_search_results() {
        int numberOfResults = testOtomasyonuPage.foundProductsElementsList.size();
        Assert.assertTrue(numberOfResults > 0);
    }
    @Then("Waits for a moment.")
    public void waits_for_a_moment() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("Closes the page.")
    public void closes_the_page() {
        Driver.closeDriver();
    }
    @Then("Types shoes in the search box and presses ENTER.")
    public void typesShoesInTheSearchBoxAndPressesENTER() {
        testOtomasyonuPage.searchBox.sendKeys("shoes" + Keys.ENTER);
    }
    @Then("Types nutella in the search box and presses ENTER.")
    public void typesNutellaInTheSearchBoxAndPressesENTER() {
        testOtomasyonuPage.searchBox.sendKeys("nutella" + Keys.ENTER);
    }
    @And("Tests that no product is found in the search results.")
    public void testsThatNoProductIsFoundInTheSearchResults() {
        int numberOfResults = testOtomasyonuPage.foundProductsElementsList.size();
        Assert.assertEquals(0, numberOfResults);
    }
    @Then("Types {string} in the search box and presses ENTER.")
    public void typesInTheSearchBoxAndPressesENTER(String search) {
        testOtomasyonuPage.searchBox.sendKeys(search + Keys.ENTER);
    }
    @And("Waits for {int} seconds.")
    public void waitsForSeconds(int wait) {
        try {
            Thread.sleep(wait*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Given("User goes to the {string} homepage.")
    public void userGoesToTheHomepage(String destination) {
        Driver.getDriver().get(ConfigReader.getProperty(destination));
    }
    @Then("Clicks on the account button.")
    public void clicks_on_the_account_button() {
        testOtomasyonuPage.accountLink.click();
    }
    @And("Enters the email as {string}")
    public void entersTheEmailAs(String email) {
        testOtomasyonuPage.emailBox.sendKeys(ConfigReader.getProperty(email));
    }
    @And("Enters the password as {string}")
    public void entersThePasswordAs(String password) {
        testOtomasyonuPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("Clicks on the signIn button.")
    public void clicks_on_the_sign_in_button() {
        testOtomasyonuPage.loginButton.click();
    }
    @Then("Tests that successful login is possible.")
    public void tests_that_successful_login_is_possible() {
        Assert.assertTrue(testOtomasyonuPage.logoutLink.isDisplayed());
    }
    @And("Tests that the user cannot log into the system.")
    public void testsThatTheUserCannotLogIntoTheSystem() {
        Assert.assertTrue(testOtomasyonuPage.emailBox.isDisplayed());
    }

    @When("Enters {string} given in the list as the email")
    public void entersGivenInTheListAsTheEmail(String email) {
        testOtomasyonuPage.emailBox.sendKeys(email);
    }

    @And("Enters {string} given in the list as the password")
    public void entersGivenInTheListAsThePassword(String password) {
        testOtomasyonuPage.passwordBox.sendKeys(password);
    }

    @Then("The test script finds the stock quantity of the product in the row {string} in the Excel sheet.")
    public void theTestScriptFindsTheStockQuantityOfTheProductInTheRowInTheExcelSheet(String rowNo) {
        String path = "src/test/resources1/cucumb.xlsx";
        Workbook workbook;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sayfa1 = workbook.getSheet("Sayfa1");
        String productNameAtRow = sayfa1.getRow(Integer.parseInt(rowNo)).getCell(0).toString();

        testOtomasyonuPage.searchBox.sendKeys(productNameAtRow + Keys.ENTER);
        productStockCount = testOtomasyonuPage.foundProductsElementsList.size();
    }

    @And("Tests that the stock quantity is greater than the stock quantity given in the row {string}.")
    public void testsThatTheStockQuantityIsGreaterThanTheStockQuantityGivenInTheRow(String rowNo) {
        String path = "src/test/resources1/cucumb.xlsx";
        Workbook workbook;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sayfa1 = workbook.getSheet("Sayfa1");
        String minStockCountStr = sayfa1.getRow(Integer.parseInt(rowNo)-1).getCell(1).toString();
        int minStockCount = (int) Double.parseDouble(minStockCountStr);

        Assert.assertTrue(productStockCount >= minStockCount);
    }
}
