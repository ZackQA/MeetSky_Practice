package net.meetSky.pages;




import net.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="body-login")
    public WebElement body;

    @FindBy(id="user")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;

    @FindBy(css = ".logo>img")
    public WebElement appLogo;

    public void loginFromFeature(String username, String pass){
       userName.sendKeys(username);
        password.sendKeys(pass);
        loginBtn.click();
    }

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginBtn.click();
        // verification that we logged
    }

}
