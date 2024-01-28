package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {

    public SaucedemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(id = "item_4_title_link")
    public WebElement firstProductName;

    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement firstProductAddToCartButton;

    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCart;

    @FindBy(className = "inventory_item_name")
    public WebElement inventoryItem;
}