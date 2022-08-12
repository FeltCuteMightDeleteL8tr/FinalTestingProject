package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;

    // Instructors elements
    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/a[1]/i")
    private WebElement twitterButton;

    @FindBy(xpath = "/html/body/section[7]/div/h2")
    private WebElement instructorsHeader;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/a[2]/i")
    public WebElement facebookButton;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/a[3]/i")
    public WebElement linkedInButton;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/a[4]/i")
    public WebElement instagramButton;

    @FindBy(xpath ="/html/body/section[3]/div/div/div[1]/div/div/a")
    public WebElement virtualReadMoreButton;

    // Card Deck elements

    @FindBy(xpath = "/html/body/section[3]")
    public WebElement cardDeckSection;


    // Sign Up for Newsletter elements

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    public WebElement searchInputField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    public WebElement submitButton;


    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickOnEnrollmentButton(){
        this.enrollmentButton.click();
    }

    public void clickOnTwitterButton(){
        this.twitterButton.click();
    }

    public WebElement getInstructorsHeader() {
        return instructorsHeader;
    }

    public void clickOnFacebookButton(){
        this.facebookButton.click();
    }

    public void clickOnLinkedInButton(){
        this.linkedInButton.click();
    }

    public void clickOnInstagramButton(){
        this.instagramButton.click();
    }




}
