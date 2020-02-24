//package com.mavenit.selenium;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import com.mavenit.selenium.pages.HomePage;
//import com.mavenit.selenium.pages.ResultsPage;
//import com.mavenit.selenium.pages.TrolleyPage;
//
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.core.Is.is;
//
//
//    public class SmokeTestSuite4 {
//
//        private HomePage homePage = new HomePage();
//        private TrolleyPage trolleyPage = new TrolleyPage();
//        private ResultsPage resultsPage = new ResultsPage();
//
//        @Test
//        public void searchTest() throws InterruptedException {
//            String searchTerm ="adidas";
//            homePage.doSearch(searchTerm);
//            homePage.getCurrentUrl();
//            String selectedProductName = resultsPage.selectAnyProduct();
//            Thread.sleep(1000);
//            trolleyPage.addToTrolley();
//            Thread.sleep(1000);
//            trolleyPage.goToTrolley();
//            double priceOfTheProduct = resultsPage.getPrice();
//            double actualPrice = priceOfTheProduct*2;
//            //todo *2 of price
//            int indexNumber = 1;
//            resultsPage.selectDropDownValue(indexNumber);
//            Thread.sleep(5000);
//            double IncreasedPrice = resultsPage.getPrice();
//            Thread.sleep(5000);
//            assertThat(actualPrice, equalTo(IncreasedPrice));
//            }
//
//    }
//
//
