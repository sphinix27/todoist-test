package org.fundacionjala.todoist;

import org.junit.Test;

import org.fundacionjala.todoist.pages.Dashboard;
import org.fundacionjala.todoist.pages.Home;
import org.fundacionjala.todoist.pages.Login;

import static org.junit.Assert.assertTrue;

/**
 * Created by AbelBarrientos on 9/4/2017.
 */
public class LogInTest {

    private Login login;
    private Dashboard dashboard;
    public LogInTest() {
        login = new Login();
        dashboard = new Dashboard();
    }

    /**
     * Test a single login to TodoIst web page.
     */
    @Test
    public void loginToTodoIst() {
        dashboard.clickLoginButton();
        Home home = login.loginAs("demouser2710@gmail.com", "secret2710");
        assertTrue(home.containsUrl("app#"));
    }
}
