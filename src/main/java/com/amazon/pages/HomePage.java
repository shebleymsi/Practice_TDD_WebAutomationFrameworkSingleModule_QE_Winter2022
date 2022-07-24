package com.amazon.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.amazon.pageElement.HomePageElements.*;

public class HomePage extends WebTestBase {

    // Constructor of Page Object class and pass driver from WebTestBase class
    public HomePage(WebDriver driver) {
        // WebTestBase.driver=driver;
        PageFactory.initElements(driver, this);
    }

    // Action class for business flow

    // search box functionality should work with valid product name

    // Action method for search box functionality with valid product name purpose
    public static void searchProductUsingValidProductName1() {
        //WebElement demo= driver.findElement(By.xpath(searchBoxWebElement));
        driver.findElement(By.xpath(searchBoxWebElement)).sendKeys("Hand Sanitizer");
        driver.findElement(By.xpath(searchButtonWebElement)).click();
    }


    // Modern Approach: @FindBy with How

    @FindBy()
    public WebElement variableName;

    // @FindBy(how = How.XPATH,using = searchBoxWebElement) public WebElement searchBox;
//    @FindBy(how = How.ID,using = searchBoxWebElement) public WebElement searchBox;
//    @FindBy(how = How.CLASS_NAME,using = searchBoxWebElement) public WebElement searchBox;
//    @FindBy(how = How.CSS,using = searchBoxWebElement) public WebElement searchBox;
//    @FindBy(how = How.XPATH,using = searchBoxWebElement) public WebElement searchBox;

    // Modern Approach: @FindBy
    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath = searchButtonWebElement)
    public WebElement searchButton;


    public void searchProductUsingValidProductName() {
        //WebElement demo= driver.findElement(By.xpath(searchBoxWebElement));
        searchBox.sendKeys("Hand Sanitizer");
        searchButton.click();
    }


}
