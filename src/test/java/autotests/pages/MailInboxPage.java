package autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MailInboxPage {

    public MailInboxPage writeLetterButton() {
        $(".compose-button_white").click();
        return this;
    }

    public MailInboxPage setRecipient(String recipient) {
        $("div[data-name=\"to\"] input").setValue(recipient);
        return this;
    }

    public MailInboxPage setTheme(String theme) {
        $("input[name='Subject']").setValue(theme);
        return this;
    }

    public MailInboxPage setText(String body) {
        $(".cke_editable_inline").setValue(body);
        return this;
    }

    public MailInboxPage sendButtonClick() {
        $("button[data-test-id=\"send\"]").click();
        return this;
    }

    public SelenideElement getSentMessageTextElement() {
        return $(".layer-sent-page a");
    }
}
