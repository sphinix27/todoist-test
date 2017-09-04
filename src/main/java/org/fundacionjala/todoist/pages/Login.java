package org.fundacionjala.todoist.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.fundacionjala.todoist.core.DriverManager;

/**
 * Page that represent the Login Modal IFrame.
 */
public class Login extends BasePage {

    @FindBy(css = ".input.input_email")
    private WebElement emailInputField;

    @FindBy(css = ".input.input_password")
    private WebElement passwordInputField;

    @FindBy(css = ".submit_btn.amibutton.amibutton_red.sel_login")
    private WebElement loginButton;

    /**
     * Constructor.
     */
    public Login() {
        loadUrlPage("https://en.todoist.com");
    }

    /**
     * Method to switch to login IFrame.
     */
    public void switchToIframe() {
        driver.switchTo().frame("GB_frame").switchTo().frame("GB_frame");
    }
    /**
     * Method to set the Email Input Field.
     * @param email String Parameter.
     */
    public void setEmailInputField(String email) {
        emailInputField.clear();
        emailInputField.sendKeys(email);
    }

    /**
     * Method to set the Password Input Field.
     * @param password String Parameter.
     */
    public void setPasswordInputField(String password) {
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    /**
     * Method to click the login button.
     */
    public void clickLogIn() {
        loginButton.click();
    }

    public Home loginAs(String username, String password) {
        switchToIframe();
        setEmailInputField(username);
        setPasswordInputField(password);
        clickLogIn();
        return new Home();
    }
}
