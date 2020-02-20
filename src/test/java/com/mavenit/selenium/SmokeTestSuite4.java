package com.mavenit.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.ResultsPage;
import pages.TrolleyPage;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;


    public class SmokeTestSuite4 {

        private HomePage homePage = new HomePage();
        private TrolleyPage trolleyPage = new TrolleyPage();
        private ResultsPage resultsPage = new ResultsPage();

        @Test
        public void searchTest() throws InterruptedException {
            String searchTerm ="adidas";
            homePage.doSearch(searchTerm);
            homePage.getCurrentUrl();
            String selectedProductName = resultsPage.selectAnyProduct();
            Thread.sleep(1000);
            trolleyPage.addToTrolley();
            Thread.sleep(1000);
            trolleyPage.goToTrolley();
            double priceOfTheProduct = resultsPage.getPrice();
            double actualPrice = priceOfTheProduct*2;
            //todo *2 of price
            int indexNumber = 1;
            resultsPage.selectDropDownValue(indexNumber);
            Thread.sleep(5000);
            double IncreasedPrice = resultsPage.getPrice();
            Thread.sleep(5000);
            assertThat(actualPrice, equalTo(IncreasedPrice));
            }



            //Total price
            //String price = driver.findElement(By.cssSelector("div.Summary__subTotalLabel__2GphY")).getText();

            //converting String to double
            //String value =price.replaceAll("£", " ");
           // double d = Double.parseDouble(value);
            //double ExpectedPrice=(d*2);

            //selecting dropdown for quantity
            //WebElement element = driver.findElement(By.cssSelector("select[class='ProductCard__quantitySelect__2y1R3']"));
           // Select s1 = new Select(element);
           // s1.selectByIndex(1);

           // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Check new total price
            //Thread.sleep(8000);
            //String price2 = driver.findElement(By.cssSelector("div.Summary__subTotalLabel__2GphY")).getText();

            //Converting string to double
            //String actual = price2.replaceAll("£", " ");
            //double actualPrice = Double.parseDouble(actual);

            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

          //assertThat(ExpectedPrice, equalTo(actualPrice));


    }


