package org.fundacionjala.todoist.pages;

import org.openqa.selenium.support.FindBy;

/**
 * Created by AbelBarrientos on 9/4/2017.
 */
public class Home extends BasePage {

    public boolean containsUrl(String name) {
        return driver.getCurrentUrl().contains(name);
    }
}
