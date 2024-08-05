package tests;

import org.junit.jupiter.api.*;
import pages.ProductsPage;
import pages.CartPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import static org.junit.jupiter.api.Assertions.*;

public class AmazonTest extends BaseTest {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();

    @Test
    public void testScenario() {

        //Go to the https://www.amazon.com.tr/ page.
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        //Click the "Accept Cookies" button on the homepage.
        homePage.acceptCookiesButton.click();

        //Enter "Bilgisayar" in the search box on the homepage.
        homePage.searchBox.sendKeys("Bilgisayar");

        //Click the "Search" button on the homepage.
        homePage.searchButton.click();

        //Click on the first product on the products page.
        productsPage.firstProduct.click();

        //Click the "Add to Cart" button on the product page.
        productsPage.addToCartButton.click();

        //Click the "Go to Cart" button on the product page.
        productsPage.goToCartButton.click();

        //Click the "Delete" button to remove the product in the shopping cart page.
        cartPage.deleteButton.click();

        //Check for the text "Your Amazon cart is empty." on the shopping cart page.
        assertTrue(cartPage.emptyCartMessage.isDisplayed());
    }

}