//package com.mavenit.selenium;
//
//import jdk.internal.instrumentation.TypeMapping;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import com.mavenit.selenium.pages.HomePage;
//import com.mavenit.selenium.pages.ResultsPage;
//import com.mavenit.selenium.pages.TrolleyPage;
//
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.Is.is;
//
//public class SmokeTestSuite5 {
//
//    private HomePage homePage = new HomePage();
//    private ResultsPage resultsPage = new ResultsPage();
//    private TrolleyPage trolleyPage = new TrolleyPage();
//
//    @Test
//    public void searchTest() throws InterruptedException {
//
//        String searchTerm = "adidas";
//        homePage.doSearch(searchTerm);
//        homePage.getCurrentUrl();
//        Thread.sleep(1000);
//        String selectProductName = resultsPage.selectAnyProduct();
//        Thread.sleep(1000);
//        trolleyPage.addToTrolley();
//        Thread.sleep(1000);
//        trolleyPage.goToTrolley();
//        Thread.sleep(1000);
//        homePage.doSearch(searchTerm);
//        Thread.sleep(1000);
//        String selectedProductName2 = resultsPage.selectAnyProduct();
//        trolleyPage.addToTrolley();
//        Thread.sleep(5000);
//        trolleyPage.goToTrolley();
//        Thread.sleep(5000);
//        int actualNumber = resultsPage.numberOfProductsInTheTrolley();
//        Thread.sleep(5000);
//        int expectedNumber =(2);
//        assertThat(expectedNumber, is(equalTo(actualNumber)));
//
//    }
//}
