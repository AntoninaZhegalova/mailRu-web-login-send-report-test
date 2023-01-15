package autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public LoginPage openPage() {
        open("/login?page=https%3A%2F%2Faccount.mail.ru%2F%3F&");
        return this;
    }

    public LoginPage setMail(String value) {
        $("input[name=\"username\"]").setValue(value);
        return this;
    }

    public LoginPage submitPassword() {
        $(".submit-button-wrap").click();
        return this;
    }

    public LoginPage setPassword(String value) {
        $("input[name=\"password\"]").setValue(value);
        return this;
    }

    public LoginPage singIn() {
        $(".submit-button-wrap").click();
        return this;
    }

    public SelenideElement getUserNameElement() {
        return $(".ph-project__user-name");
    }

}


