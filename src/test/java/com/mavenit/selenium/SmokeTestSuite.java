package com.mavenit.selenium;

import pages.HomePage;
import pages.ResultsPage;
import pages.TrolleyPage;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SmokeTestSuite extends Hooks{

    private HomePage homePage = new HomePage();
    private TrolleyPage trolleyPage = new TrolleyPage();
   private ResultsPage resultsPage = new ResultsPage();

    @Test
    public void searchTest(){
        String searchTerm = "puma";
        homePage.doSearch(searchTerm);
        homePage.getCurrentUrl();
        //to verify that we are looking for puma products by checking if the url has string "puma"
       assertThat(homePage.getCurrentUrl(), endsWith(searchTerm));

       //Assert -2, collect a item to list, loop and verify, product contains strings
       List<String>actualProductList = resultsPage.getAllProductNames();
       for(String product: actualProductList){
           assertThat(product, containsString(searchTerm));
       }

       //Assert -3
       String actualTitle =resultsPage.getActualTitle();
       assertThat(actualTitle, is(equalToIgnoringCase(searchTerm)));

    }
}
