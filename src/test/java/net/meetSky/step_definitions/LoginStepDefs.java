package net.meetSky.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetSky.pages.LoginPage;

import io.cucumber.java.en.Given;
import net.meetSky.utilities.BrowserUtils;
import net.meetSky.utilities.ConfigurationReader;
import net.meetSky.utilities.Driver;
import org.junit.Assert;


public class LoginStepDefs {
    
    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }


    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        loginPage.loginFromFeature(username,password);

    }

    @Then("verify the user should see Login Page and Login button background color same")
    public void verify_the_user_should_see_login_page_and_login_button_background_color_same() {
        String loginPageColor = loginPage.body.getCssValue("background-color");
        System.out.println("loginPageColor = " + loginPageColor);
        String loginBtnColor = loginPage.loginBtn.getCssValue("background-color");
        System.out.println("loginBtnColor = " + loginBtnColor);

        Assert.assertEquals(loginPageColor,loginBtnColor);

    }

    @Then("the user should see the app logo in expected dimensions")
    public void the_user_should_see_the_app_logo_in_expected_dimensions() {

        int expectedAppLogoHeight = 327;
        int expectedAppLogoWidth = 780;

        String actualAppLogoHeight = loginPage.appLogo.getDomProperty("naturalHeight");
        System.out.println("appLogoHeight = " + actualAppLogoHeight);
        String actualAppLogoWidth = loginPage.appLogo.getDomProperty("naturalWidth");
        System.out.println("actualAppLogoWidth = " + actualAppLogoWidth);

        Assert.assertTrue(expectedAppLogoHeight == Integer.valueOf(actualAppLogoHeight));
        Assert.assertTrue(expectedAppLogoWidth == Integer.valueOf(actualAppLogoWidth));
    }

    @When("the user logged in with valid credentials as environment variables")
    public void the_user_logged_in_with_valid_credentials_as_environment_variables() {
        // String password = ConfigurationReader.getProperty("password") + "----------";
        // System.out.println(password);
        loginPage.login(System.getenv("username"), System.getenv("password"));

        BrowserUtils.sleep(5);
    }
    @Then("the user should land on Dashboard page")
    public void the_user_should_land_on_dashboard_page() {
        String actDashboardUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actDashboardUrl.contains("dashboard"));
    }


}
