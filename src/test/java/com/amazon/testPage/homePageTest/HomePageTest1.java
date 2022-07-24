package com.amazon.testPage.homePageTest;

import com.amazon.pages.HomePage;
import com.amazon.pages.HomePage1;
import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.amazon.pageElement.HomePageElements.verifySearchedProductWebElement;

public class HomePageTest1 extends WebTestBase {
    HomePage1 homePage1;

//    @Test(enabled = false)
//    @Ignore
//    public void verifySearchProductUsingValidProductName() {
//        // Action method
//       HomePage homePage = new HomePage(driver);
//        homePage.searchProductUsingValidProductName();
//
//        // Verification method
//        String expectedProductName = "\"Hand Sanitizer\"";
//        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
//
//    }

    @Test(enabled = true)
    public void verifySearchProductUsingValidProductName1() {
        homePage1 = new HomePage1();
        // Action method
        homePage1.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

    @Test(enabled = true)
    public void verifySearchProductUsingValidProductName5() {
        homePage1 = new HomePage1();
        // Action method
        homePage1.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }


}
