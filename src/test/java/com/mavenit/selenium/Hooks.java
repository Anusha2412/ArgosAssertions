package com.mavenit.selenium;

import drivers.DriversFactory;
import org.junit.After;
import org.junit.Before;

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






