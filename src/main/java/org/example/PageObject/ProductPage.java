package org.example.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    public SelenideElement

    ButtonSearch = $(byId("small-searchterms")),
    SearchPageCheck = $(byClassName("search_result_title"));


}

