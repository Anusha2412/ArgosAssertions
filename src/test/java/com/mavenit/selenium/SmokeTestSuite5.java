package com.mavenit.selenium;

import jdk.internal.instrumentation.TypeMapping;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.ResultsPage;
import pages.TrolleyPage;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SmokeTestSuite5 extends Hooks{

    HomePage homePage = new HomePage();
    ResultsPage resultsPage = new ResultsPage();
    TrolleyPage trolleyPage = new TrolleyPage();

    @Test
    public void searchTest() throws InterruptedException {

        String searchTerm = "adidas";
        homePage.doSearch(searchTerm);
        homePage.getCurrentUrl();
        Thread.sleep(1000);
        String selectProductName = resultsPage.selectAnyProduct();
        Thread.sleep(1000);
        trolleyPage.addToTrolley();
        Thread.sleep(1000);
        trolleyPage.goToTrolley();
        Thread.sleep(1000);
        homePage.doSearch(searchTerm);
        Thread.sleep(1000);
        String selectedProductName2 = resultsPage.selectAnyProduct();
        trolleyPage.addToTrolley();
        Thread.sleep(5000);
        trolleyPage.goToTrolley();
        Thread.sleep(5000);
        int actualNumber = resultsPage.numberOfProductsInTheTrolley();
        Thread.sleep(5000);
        int expectedNumber =(2);
        assertThat(expectedNumber, is(equalTo(actualNumber)));







       // driver.findElement(By.id("searchTerm")).sendKeys("adidas");
        //driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
        //String url = driver.getCurrentUrl();


       // List<WebElement> productWebElements = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        //Random random = new Random();
        //int randomNumber = random.nextInt(productWebElements.size() - 1);

        //Identifying the product
        //WebElement selectedElement = productWebElements.get(randomNumber);
        //String selectedProductName = selectedElement.getText();
        //selectedElement.click();

       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Add to cart
       // driver.findElement(By.cssSelector("button[data-test='component-att-button']")).click();

        //Continue Shopping
        //driver.findElement(By.cssSelector("button[data-test='component-att-button-continue']")).click()
        // driver.findElement(By.xpath("//button[@class='Buttonstyles__Button-q93iwm-2 dLIWsO']")).click();
        //driver.navigate().to(url);


       //Thread.sleep(8000);
       //anusha

       //adding another product
       // List<WebElement> productWebElements2 = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
       //Random random2 = new Random();
       //int randomNumber2 = random2.nextInt(productWebElements2.size() - 1);

        //Identifying the product2
       //WebElement selectedElement2 = productWebElements2.get(randomNumber2);
      // String selectedProductName2 = selectedElement2.getText();
      // selectedElement2.click();

      // Thread.sleep(8000);

        //Add to cart
      // driver.findElement(By.cssSelector("button[data-test='component-att-button']")).click();

        //Go to cart
     // driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();

      //checking number of items in trolley
     // String amount =driver.findElement(By.cssSelector("span.LQbCV")).getText();
       // System.out.println(amount);

      //int actualNumber = Integer.parseInt(amount);
        //System.out.println(actualNumber);

        //WebElement element = driver.findElement(By.cssSelector("select[class='ProductCard__quantitySelect__2y1R3']"));
       // System.out.println(element);
       // Select s1 = new Select(element);
       // s1.
       // WebElement value1 = s1.getFirstSelectedOption();
        //System.out.println(value1);
        //Select s2 = new Select(element);
       // WebElement value2 =s2.getFirstSelectedOption();
       // System.out.println(value2);

       // int expectedNumber =(2);
        //assertThat(expectedNumber, is(equalTo(actualNumber)));


    }

}
