package org.fundacionjala.todoist.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.fundacionjala.todoist.core.DriverManager;

/**
 * Base Page Object for all pages.
 */
public class BasePage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    /**
     * Constructor.
     */
    public BasePage() {
        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }

    /**
     * Method to load the URL Page.
     * @param url String.
     */
    public void loadUrlPage(String url) {
        driver.get(url);
    }
}
