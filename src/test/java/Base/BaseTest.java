package Base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeTest
    public void openChrome() {
        open("https://www.google.com//");
    }

    @AfterTest
    public void closeweb() {
        closeWebDriver();
    }
}
