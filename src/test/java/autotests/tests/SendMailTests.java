package autotests.tests;

import autotests.config.Project;
import autotests.config.Recipient;
import autotests.config.RecipientConfig;
import autotests.pages.LoginPage;
import autotests.pages.MailInboxPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.not;

public class SendMailTests extends TestBase {
    private final MailInboxPage mailInboxPage = new MailInboxPage();

    @BeforeAll
    static void login() {
        String login = Project.config.userEmail();
        String password = Project.config.userPassword();
        LoginPage loginPage = new LoginPage();

        loginPage.openPage()
                .setMail(login)
                .submitPassword()
                .setPassword(password)
                .singIn();
    }

    @Test
    @DisplayName("Send mail")
    void sendMailTest() {
        RecipientConfig config = Recipient.config;
        this.mailInboxPage.writeLetterButton()
                .setRecipient(config.address())
                .setTheme(config.theme())
                .setText(config.body())
                .sendButtonClick()
                .getSentMessageTextElement()
                .shouldBe(not(empty));
    }
}

