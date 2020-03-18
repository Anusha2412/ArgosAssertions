package com.mavenit.selenium.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.mavenit.selenium.pages.HomePage;
import com.mavenit.selenium.pages.ResultsPage;
import com.mavenit.selenium.pages.TrolleyPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;



public class TrolleySteps {

    private HomePage homePage = new HomePage();
    private TrolleyPage trolleyPage = new TrolleyPage();
    private ResultsPage resultsPage = new ResultsPage();

    @And("^I search for a product adidas$")
    public void i_search_for_a_product_adidas(){
    String searchTerm = "adidas";
        homePage.doSearch("adidas");
    }
    @And("^add a random product to trolley$")
    public void add_a_random_product_to_trolley() throws InterruptedException {
        homePage.getCurrentUrl();
        String selectProductName = resultsPage.selectAnyProduct();
        trolleyPage.addToTrolley();
        trolleyPage.goToTrolley();

    }

    @When("^I add another random product of adidas to trolley$")
    public void i_add_another_random_product_of_adidas_to_trolley() throws InterruptedException {
        homePage.doSearch("adidas");
        String selectedProductName2 = resultsPage.selectAnyProduct();
        trolleyPage.addToTrolley();
        trolleyPage.goToTrolley();
    }

    @Then("^I should be able to see the trolley get updated with the number of products added$")
    public void i_should_be_able_to_see_the_trolley_get_updated_with_the_number_of_products_added() throws InterruptedException {
        int actualNumber = resultsPage.numberOfProductsInTheTrolley();
        int expectedNumber =(2);
        assertThat(expectedNumber, is(equalTo(actualNumber)));

    }

}
