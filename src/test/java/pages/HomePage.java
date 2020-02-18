package pages;

import drivers.DriversFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends DriversFactory {



    public void doSearch(String searchTerm){

        driver.findElement(By.id("searchTerm")).sendKeys(searchTerm);
        driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);

    }

    public String getCurrentUrl(){

        return driver.getCurrentUrl();
    }


}
