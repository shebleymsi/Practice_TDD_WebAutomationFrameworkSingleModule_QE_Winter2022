package com.amazon.testPage.homePageTest;

import com.amazon.pages.HomePage;
import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.amazon.pageElement.HomePageElements.*;

public class HomePageTest extends WebTestBase {


    @Test(enabled = false)
    @Ignore
    public void verifySearchProductUsingValidProductName() {
        // Action method
        HomePage homePage = new HomePage(driver);
        homePage.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

    @Test(enabled = true)
    public void verifySearchProductUsingValidProductName1() {
        HomePage homePage = new HomePage(driver);
        // Action method
        homePage.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

    @Test(enabled = true)
    public void verifySearchProductUsingValidProductName6() {
        // Page class object created and pass the WebTestBase class driver
        HomePage homePage = new HomePage(driver);
        // Action method
        homePage.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }


}
