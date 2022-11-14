package FinalFolder;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.Base.BaseTest;
import org.example.PageObject.LogIn;
import org.example.PageObject.ProductPage;
import org.example.StepObject.ProductPageSteps;
import org.example.Utils.Retry;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.example.DataObject.ProductPageData.GeorgianKeyBoard;
import static org.example.DataObject.ProductPageData.ProductName;

@Listeners(org.example.Utils.TestLister.class)
public class ProductPageTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Fill search field")

    public void FindMobile () {
        ProductPageSteps ProductPageSteps = new ProductPageSteps();
        ProductPage ProductPage  = new ProductPage();
        ProductPageSteps.SearchButton()
                .SearchProduct(ProductName)
                .SearchPageCheck.shouldBe(Condition.visible);
        Assert.assertTrue(ProductPage.SearchPageCheck.isDisplayed());

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Fill search with GeoKeyBoard")

    public void FindMobileGeoKeyBoard () {
        ProductPageSteps ProductPageSteps = new ProductPageSteps();
        ProductPage ProductPage  = new ProductPage();
        ProductPageSteps.SearchButton()
                .SearchProduct(GeorgianKeyBoard)
                .SearchPageCheck.shouldBe(Condition.visible);
        Assert.assertTrue(ProductPage.SearchPageCheck.isDisplayed());

    }


}
