package org.example.Base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeTest (description = "Configure browser before testst")
    public static void openChrome() {
       open("https://zoommer.ge/");
    }
}





//public class BaseTest {
//    @BeforeTest
//    public void openChrome() {
//        open("https://www.google.com//");
//    }
//
//    @AfterTest
//    public void closeweb() {
//        closeWebDriver();
//    }
//}

