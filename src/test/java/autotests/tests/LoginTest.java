package autotests.tests;

import autotests.config.Project;
import autotests.pages.LoginPage;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {
    private final LoginPage loginPage = new LoginPage();
    private static final String login = Project.config.userEmail();
    private static final String password = Project.config.userPassword();

    @Test
    @DisplayName("Login user")
    void loginTest() {
        this.loginPage.openPage()
                .setMail(login)
                .submitPassword()
                .setPassword(password)
                .singIn()
                .getUserNameElement()
                .shouldHave(Condition.text(login));
    }
}

