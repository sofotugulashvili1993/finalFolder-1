package org.example.StepObject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.example.PageObject.LogIn;

public class LogInSteps extends LogIn {

    @Step ("Click profile open button")
    public LogInSteps OpenProfile () {
      User.click();
      return this;
  }

   @Step ("Fill user mail, Value:{0}" )
   public LogInSteps UserMail (String Name) {
        inPutMail.setValue(Name);
        return this;
    }

    @Step ("Fill user password, Value:{0}" )
    public LogInSteps UserPassword (String Pass) {
        inPutPassword.setValue(Pass);
        return this;
    }

    @Step ("Click  submit button")
    public LogInSteps Submit () {
        SubmitButton.pressEnter();
        return this;
    }

    @Step ("After positive login, 'გამარჯობა' should be visible")
    public LogInSteps HalloShouldBeVisible () {
        Hallo.shouldBe(Condition.visible);
        return this;
    }

}
