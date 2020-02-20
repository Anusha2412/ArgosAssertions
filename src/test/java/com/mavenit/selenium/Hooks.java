package com.mavenit.selenium;

import cucumber.api.java.Before;
import drivers.DriversFactory;
import org.junit.After;

public class Hooks {

    DriversFactory factory = new DriversFactory();

    @Before //hooks
    public void setup() {
       factory.openBrowser();
       factory.navigateTo("https://www.argos.co.uk/");
        factory.maxiBrowser();
    }
   // @After  //hooks
   //public void teardown() {
     //   factory.closeBrowser();
   // }

    }






