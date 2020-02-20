package com.mavenit.selenium;

import pages.HomePage;
import pages.ResultsPage;
import pages.TrolleyPage;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



public class SmokeTestSuite2 {

    private HomePage homePage = new HomePage();
    public TrolleyPage trolleyPage = new TrolleyPage();
    private ResultsPage resultsPage = new ResultsPage();

        @Test
        public void searchTest(){
            String searchTerm = "nike";
            homePage.doSearch(searchTerm);
            homePage.getCurrentUrl();

            // select a nike product
            // List all nike items in the page
            String selectedProductName= resultsPage.selectAnyProduct();
            trolleyPage.addToTrolley();
            trolleyPage.goToTrolley();
            String actual = trolleyPage.getProductInTrolley();
            assertThat(actual, is(equalToIgnoringCase(selectedProductName)));
        }
}
















