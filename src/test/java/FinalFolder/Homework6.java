package FinalFolder;

import Base.BaseTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import org.testng.Assert;


public class Homework6 extends BaseTest {

    @Test
    public void test1() {
        SelenideElement search = $(byName("q"));
        SelenideElement text = $(byText("google"));
        search.setValue("sofo tugulashvili");
        Assert.assertFalse(text.is(Condition.visible));
        Assert.assertEquals(search.getValue(), "sofo tugulashvili", "mesiji");
        sleep(5000);
    }

        @Test
        public void test2() {
        String str = "sofo";
        SelenideElement nameInput = $(byName("q"));
        nameInput.setValue(str);
        sleep(5000);
        Assert.assertEquals (nameInput.getValue(), str, "check name input");
    }

}
