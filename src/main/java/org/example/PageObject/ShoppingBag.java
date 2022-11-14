package org.example.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ShoppingBag {

    public static  SelenideElement

    ShoppingBagButton = $ (byClassName("h_basket_icon")),
    ShoppingBagBtnOpen = $(byText("კალათაში გადასვლა")),
    EmptyShoppingBag = $(byText("თქვენი კალათა ცარიელია")),
    ChooseMobile = $(byXpath("//*[@id=\"js-filter-cont\"]/div[4]/div/div/div[1]/div[1]/div/div[1]/a/h4")),

    AddMobile = $(byXpath("//*[@id=\"add-to-cart-button-7615\"]/img"));

//    checkBag = $(byClassName("h_basket_icon")),
//
//    checkShoppingBag = $(byText("კალათაში გადასვლა"));


}
