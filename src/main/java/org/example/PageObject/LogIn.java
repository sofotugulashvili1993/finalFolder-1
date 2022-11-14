package org.example.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LogIn {

    public SelenideElement

    User          = $(byText("პროფილი")),
    inPutMail     = $(byId("EmailOrPhone")),
    inPutPassword = $(byId("Password")),
    SubmitButton  = $(byText("შესვლა")),

    Hallo         = $(byText("გამარჯობა"));


}
