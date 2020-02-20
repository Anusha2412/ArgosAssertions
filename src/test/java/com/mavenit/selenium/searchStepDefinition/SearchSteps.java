package com.mavenit.selenium.searchStepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ResultsPage;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class SearchSteps {

    private HomePage homePage = new HomePage();
    private ResultsPage resultsPage = new ResultsPage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        String actual = homePage.getCurrentUrl();
        assertThat(actual, endsWith("co.uk/"));
    }

    @When("^I search for product nike$")
    public void i_search_for_product_nike() {
        homePage.doSearch("nike");
    }

    @Then("^I should be able to see all nike products$")
    public void i_should_be_able_to_see_all_nike_products() {
        String actualTitle = resultsPage.getSearchTitle();
        List<String> allProductNames = resultsPage.getAllProductNames();

        assertThat(actualTitle, is(equalToIgnoringWhiteSpace("nike")));
        for (String item : allProductNames) {
            assertThat(item.toUpperCase(), containsString("Nike".toUpperCase()));
        }
    }
    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String item) {
        homePage.doSearch(item);
    }

    @Then("^I should be able to see all \"([^\"]*)\"$")
    public void i_should_be_able_to_see_all(String searchItem) {
        String actualTitle = resultsPage.getSearchTitle();
        List<String> allProductNames = resultsPage.getAllProductNames();
        assertThat(actualTitle.toUpperCase(), is(equalToIgnoringWhiteSpace(searchItem.toUpperCase())));
        for (String item : allProductNames) {
            assertThat(item.toUpperCase(), containsString(searchItem.toUpperCase()));

        }
    }
}




