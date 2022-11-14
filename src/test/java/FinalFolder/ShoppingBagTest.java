package FinalFolder;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.Base.BaseTest;
import org.example.PageObject.ShoppingBag;
import org.example.StepObject.ProductPageSteps;
import org.example.StepObject.ShoppingBagSteps;
import org.example.Utils.Retry;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.example.DataObject.ProductPageData.ProductName;

//@Listeners(org.example.Utils.TestLister.class)
public class ShoppingBagTest extends BaseTest {

    @Test //(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Open Empty Shopping Bag")

    public void EmptyShoppingBag() {
        ShoppingBagSteps ShoppingBagSteps = new ShoppingBagSteps ();
        ShoppingBagSteps.OpenShoppingBag()
                .EmptyText();
        Assert.assertTrue(ShoppingBag.EmptyShoppingBag.isDisplayed());

    }

    @Test //(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Add mobile from ProductPage to ShoppingBag")

    public void AddMobileShoppingBag() {

        ProductPageSteps ProductPageSteps = new ProductPageSteps ();
        ShoppingBagSteps ShoppingBagSteps = new ShoppingBagSteps ();
        ProductPageSteps.SearchButton()
                .SearchProduct(ProductName);
        ShoppingBagSteps.chooseMobile()
                        .addMobile()
                        .CheckBag();

        Assert.assertFalse(ShoppingBag.EmptyShoppingBag.isDisplayed());

    }

}
