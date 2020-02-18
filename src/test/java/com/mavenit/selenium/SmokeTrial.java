package com.mavenit.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.TrolleyPage;

import java.util.List;
import java.util.Random;

public class SmokeTrial extends Hooks{
    private HomePage homePage = new HomePage();
    public TrolleyPage trolleyPage = new TrolleyPage();
@Test
    public void searchTest(){
        String searchTerm = "nike";
        homePage.doSearch(searchTerm);

    WebDriver driver = new ChromeDriver();

        List<WebElement> productWebElements = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        Random random = new Random();
        int randomNumber = random.nextInt(productWebElements.size()-1);

        //Identifying the product
        WebElement selectedElement = productWebElements.get(randomNumber);
        String selectedProductName = selectedElement.getText();
        selectedElement.click();
    System.out.println(selectedProductName);


    }
}
