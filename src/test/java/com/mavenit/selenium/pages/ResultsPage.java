package com.mavenit.selenium.pages;

import com.mavenit.selenium.drivers.DriversFactory;
import org.openqa.selenium.support.ui.Select;
import com.mavenit.selenium.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class ResultsPage extends DriversFactory {
    private List<WebElement> isProductAvailable() {
        List<WebElement> productWebElements = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (productWebElements.size() == 0) {
            throw new RuntimeException("Zero products found...");
        }
        return productWebElements;
    }

    public List<String> getAllProductNames() {
        List<String> productNamesList = new ArrayList<>();

        List<WebElement> productWebElements = isProductAvailable();
        for (WebElement indProduct : productWebElements) {
            String actual = indProduct.getText();
            productNamesList.add(actual);
        }
        return productNamesList;
    }

    public String getSearchTitle() {
        return driver.findElement(By.className("search-title__term")).getText();
    }

    public String selectAnyProduct() {
        List<WebElement> productWebElements = isProductAvailable();
        int productSize = productWebElements.size();

        int randomNumber = new Helpers().randomNumberGenerator(productSize);
        WebElement selectedElement = productWebElements.get(randomNumber);
        String selectedProductName = selectedElement.getText();
        selectedElement.click();

        return selectedProductName;

    }

    public double getPrice() {
        String price = driver.findElement(By.cssSelector("div.Summary__subTotalLabel__2GphY")).getText();
        String value = price.replaceAll("£", " ");
        double priceOfTheProduct = Double.parseDouble(value);

        return priceOfTheProduct;
    }

    public void selectDropDownValue(int indexNumber) {
        WebElement element = driver.findElement(By.cssSelector("select[class='ProductCard__quantitySelect__2y1R3']"));
        Select s1 = new Select(element);
        s1.selectByIndex(indexNumber);
    }

    public int numberOfProductsInTheTrolley() {
        String value = driver.findElement(By.cssSelector("span.LQbCV")).getText();
        int actualNumber = Integer.parseInt(value);
        return actualNumber;
    }
}



