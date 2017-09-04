package org.fundacionjala.todoist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by AbelBarrientos on 9/4/2017.
 */
public class Dashboard extends BasePage {

    @FindBy(className = "sel_login")
    private WebElement loginButton;

    public void clickLoginButton() {
        loginButton.click();
    }
}
