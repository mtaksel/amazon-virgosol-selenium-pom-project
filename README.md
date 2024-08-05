Amazon-Virgosol-Selenium-POM-Project

This project demonstrates a comprehensive automated test scenario for the Amazon Turkey website (https://www.amazon.com.tr/) using Selenium WebDriver with the Page Object Model (POM) design pattern. The primary objective is to ensure the smooth operation of key functionalities such as searching for a product, adding it to the cart, and removing it from the cart.
Project Structure

The project follows the Page Object Model (POM) structure, which includes:

    Driver Class: Manages the WebDriver instance.
    TestBase Class: Sets up and tears down the WebDriver before and after each test.
    Page Classes: Encapsulate the web elements and actions for each page.
    Utilities: Contains helper classes such as ConfigurationReader.
    Configuration Properties File: Stores configuration settings like the base URL.
    Logging: Implements logging for better traceability and debugging.

Test Scenario

The test scenario covers the following steps:

    Navigate to the Amazon Turkey website.
    Click the "Accept Cookies" button on the homepage.
    Enter "Bilgisayar" in the search box on the homepage.
    Click the "Search" button on the homepage.
    Click on the first product listed on the products page.
    Click the "Add to Cart" button on the product page.
    Click the "Go to Cart" button on the product page.
    Click the "Delete" button to remove the product in the shopping cart page.
    Verify that the text "Your Amazon cart is empty." is displayed on the shopping cart page.

Getting Started
Prerequisites

    Java
    Maven
    ChromeDriver (or the WebDriver for the browser you intend to use)

Setup

    Clone the repository:

    sh

git clone https://github.com/mtaksel/amazon-virgosol-selenium-pom-project.git

Navigate to the project directory:

sh

    cd amazon-virgosol-selenium-pom-project

    Update the configuration.properties file with the path to your WebDriver and other necessary configurations.

Running the Tests

    Use Maven to run the tests:

    sh

    mvn test

Project Components
Driver Class

Manages the WebDriver instance and ensures only one instance is created (Singleton pattern).
TestBase Class

Sets up and tears down the WebDriver before and after each test, initializing the WebDriver and navigating to the base URL.
Page Classes

    HomePage: Encapsulates actions and elements on the homepage, such as accepting cookies and performing a search.
    SearchResultsPage: Handles actions on the search results page, such as clicking on the first product.
    ProductPage: Manages actions on the product page, like adding the product to the cart and navigating to the cart.
    CartPage: Encapsulates actions and elements on the shopping cart page, such as deleting the product and verifying the cart is empty.

Utilities

    ConfigurationReader: Reads configuration properties from the configuration.properties file.

Configuration Properties File

Stores configuration settings such as the base URL of the website and the path to the WebDriver.
Logging

Implements logging using SLF4J and Logback for better traceability and debugging of test execution.
Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.
License

This project is licensed under the MIT License - see the LICENSE file for details.
