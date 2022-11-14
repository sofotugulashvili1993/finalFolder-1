package FinalFolder;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.aspectj.weaver.Utils;
import org.example.PageObject.LogIn;
import org.example.StepObject.LogInSteps;
import org.example.Base.BaseTest;
import org.example.Utils.Retry;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.example.DataObject.LogInData.*;


@Listeners(org.example.Utils.TestLister.class)
public class LogInTest extends BaseTest {

        @Test (retryAnalyzer = Retry.class)
        @Severity(SeverityLevel.BLOCKER)
        @Description("Positive log in test case")

        public void PositiveLogIn()  {
        LogIn login = new LogIn();
        LogInSteps LogInSteps = new LogInSteps();
        LogInSteps.OpenProfile()
                .UserMail(Mail)
                .UserPassword(Password)
                .Submit()
                .HalloShouldBeVisible();

        Assert.assertTrue(login.Hallo.isDisplayed());


    }

            @Test (retryAnalyzer = Retry.class)
            @Severity(SeverityLevel.BLOCKER)
            @Description("Negative test case with incorrect mail")
            public void NegativeLogInWithIncorrectMail()  {
                LogIn login = new LogIn();
                LogInSteps LogInSteps = new LogInSteps();
                LogInSteps.OpenProfile()
                        .UserMail(IncorrectMail)
                        .UserPassword(Password)
                        .Submit();

                Assert.assertFalse(login.Hallo.isDisplayed());


            }

        @Test (retryAnalyzer = Retry.class)
        @Severity(SeverityLevel.BLOCKER)
        @Description("Negative test case with incorrect password")
        public void NegativeLogInWithIncorrectPassword()  {
            LogIn login = new LogIn();
            LogInSteps LogInSteps = new LogInSteps();
            LogInSteps.OpenProfile()
                    .UserMail(Mail)
                    .UserPassword(IncorrectPassword)
                    .Submit();

            Assert.assertFalse(login.Hallo.isDisplayed());


        }

}

