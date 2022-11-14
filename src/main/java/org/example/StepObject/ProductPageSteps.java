package org.example.StepObject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.example.PageObject.ProductPage;

import static org.example.DataObject.ProductPageData.*;

public class ProductPageSteps extends ProductPage {

    @Step ("Click search")
    public ProductPageSteps SearchButton () {
        ButtonSearch.click();
        return this;
    }

    @Step ("Fill search and choose mobile")
    public ProductPageSteps SearchProduct (String mobile) {
        ButtonSearch.setValue(mobile).pressEnter();
        return this;
    }

    @Step ("After find mobile, product should be visible")
    public ProductPageSteps SearchPageCheckShouldBeVisible () {
        SearchPageCheck.shouldBe(Condition.visible);
        return this;
    }


}
