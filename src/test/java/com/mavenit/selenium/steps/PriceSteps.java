package com.mavenit.selenium.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.MatcherAssert;
import com.mavenit.selenium.pages.HomePage;
import com.mavenit.selenium.pages.ResultsPage;
import com.mavenit.selenium.pages.TrolleyPage;

import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class PriceSteps {

    private HomePage homePage = new HomePage();
    private ResultsPage resultsPage = new ResultsPage();
    private TrolleyPage trolleyPage = new TrolleyPage();

    @Given("^I am on homepages$")
    public void i_am_on_homepage() {
        String actual = homePage.getCurrentUrl();
        assertThat(actual, endsWith("co.uk/"));
    }

    @And("^I search for product adidas$")
    public void i_search_for_product_adidas() throws InterruptedException {
        homePage.doSearch("adidas");
        Thread.sleep(2000);
    }

    @And("^add random product to trolley$")
    public void add_to_trolley() throws InterruptedException {
        trolleyPage.addToTrolley();
        Thread.sleep(1000);
        trolleyPage.goToTrolley();
    }

    @When("^I double the product quantity$")
    public void i_double_the_product_quantity() throws InterruptedException {
        double priceOfTheProduct = resultsPage.getPrice();
        Thread.sleep(1000);
        double actualPrice = priceOfTheProduct*2;
        int indexNumber = 1;
        Thread.sleep(1000);
        resultsPage.selectDropDownValue(indexNumber);
    }

    @Then("^I should be able to see the price of the product get double$")
    public void i_should_be_able_to_see_the_price_of_the_product_get_double() throws InterruptedException {
        double priceOfTheProduct = resultsPage.getPrice();
        Thread.sleep(1000);
        double actualPrice = priceOfTheProduct*2;
        Thread.sleep(1000);
        double IncreasedPrice = resultsPage.getPrice();
        Thread.sleep(1000);
        MatcherAssert.assertThat(actualPrice, equalTo(IncreasedPrice));

    }

}
