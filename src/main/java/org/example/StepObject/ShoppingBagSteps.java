package org.example.StepObject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.example.PageObject.ShoppingBag;

public class ShoppingBagSteps extends ShoppingBag {

    @Step("Hover Shopping Bag Button")
    public ShoppingBagSteps OpenShoppingBag () {
        ShoppingBagButton.hover();
        ShoppingBagBtnOpen.click();
        return this;
    }

    @Step("Visible empty bag")
    public ShoppingBagSteps EmptyText () {
        EmptyShoppingBag.shouldBe(Condition.visible);
        return this;
    }

    @Step("choose mobile in bag")
    public ShoppingBagSteps chooseMobile () {
        ChooseMobile.click();
        return this;
    }

    @Step("add mobile in bag")
    public ShoppingBagSteps addMobile () {
        AddMobile.click();
        return this;
    }

    @Step("check shopping bag after adding mobile")
    public ShoppingBagSteps CheckBag () {
        ShoppingBagButton.hover();
        ShoppingBagBtnOpen.click();
        return this;
    }
}
