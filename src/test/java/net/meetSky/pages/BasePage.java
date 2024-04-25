package net.meetSky.pages;





import net.meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import java.util.List;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateTo(String moduleName){

       moduleName = moduleName.substring(0,1).toUpperCase() + moduleName.substring(1).toLowerCase();
       String locator = "//ul[@id='appmenu']//a[@aria-label='"+moduleName+"']";
       WebElement element = Driver.getDriver().findElement(By.xpath(locator));
       element.click();

    }

    @FindBy(xpath = "(//a[contains(.,'Talk')])[1]")
    public List<WebElement> talk;

    @FindBy(xpath = "(//a[contains(.,'Activity')])[1]")
    protected WebElement activity;

    @FindBy(xpath = "(//a[contains(.,'Photos')])[1]")
    public WebElement photos;

    @FindBy(xpath = "(//a[contains(.,'Files')])[1]")
    public WebElement files;

    @FindBy(xpath = "(//a[contains(.,'Dashboard')])[1]")
    public WebElement dashboard;

    @FindBy(xpath = "(//a[contains(.,'Mail')])[1]")
    public WebElement mail;

    @FindBy(xpath = "(//a[contains(.,'Contacts')])[1]")
    public WebElement contacts;

    @FindBy(xpath = "(//a[contains(.,'Tasks')])[1]")
    public WebElement tasks;

    @FindBy(xpath = "(//a[contains(.,'Calendar')])[1]")
    public WebElement calender;

    @FindBy(xpath = "(//a[contains(.,'Notes')])[1]")
    public WebElement notes;

    @FindBy(xpath = "(//a[contains(.,'Contacts')])[1]")
    public WebElement deck;

    @FindBy(id = "expand")
    public WebElement logoutButton;




}
