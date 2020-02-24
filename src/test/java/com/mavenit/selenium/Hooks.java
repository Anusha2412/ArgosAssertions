package com.mavenit.selenium;

import cucumber.api.java.Before;
import com.mavenit.selenium.drivers.DriversFactory;

public class Hooks {

    DriversFactory factory = new DriversFactory();

    @Before //hooks
    public void setup() {
       factory.openBrowser();
       factory.navigateTo("https://www.argos.co.uk/");
        factory.maxiBrowser();
        factory.applyImplicitWaits();

    }
   // @After  //hooks
   //public void teardown() {
     //   factory.closeBrowser();
   // }

    }







