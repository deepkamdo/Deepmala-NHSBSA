package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "nhsuk-cookie-banner__link_accept_analytics")
    WebElement acceptAnalyticsCookiesBtn;

    @CacheLookup
    @FindBy(id = "next-button")
    WebElement startNowBtn;

    @CacheLookup
    @FindBy(xpath = "//label[@id='label-wales']")
    WebElement countryWales;

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbuttonlivinpage;

    @CacheLookup
    @FindBy(xpath = "//label[@id='label-yes']")
    WebElement yesbutton;

    @CacheLookup
    @FindBy(xpath = "//label[@id='label-no']")
    WebElement nobutton;

    @CacheLookup
    @FindBy(xpath = "/label[@id='label-wales']")
    WebElement dentalpracticeinwales;

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-day']")
    WebElement day;

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-month']")
    WebElement month;

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-year']")
    WebElement year;


    @CacheLookup
    @FindBy(xpath = "//body[1]/main[1]/div[2]/div[1]/h1[1]")
    WebElement gethelpwithnhscoststext;

public String getTextFromHelpWithnhsCosts(){
    log.info("get Text From Help With nhs Costs"+ gethelpwithnhscoststext.toString());
    return getTextFromElement(gethelpwithnhscoststext);
}
    public void clickOnAnalyticsCookiesBtn() {
        clickOnElement(acceptAnalyticsCookiesBtn);
        log.info("Clicking on the 'AnalyticsCookies' button: " + acceptAnalyticsCookiesBtn.toString());
    }

    public void clickOnStartNow() {
        clickOnElement(startNowBtn);
        log.info("Clicking on the 'startNow' button: " + startNowBtn.toString());
    }

    public void clickOnLiveInPagenextButton() {
        clickOnElement(nextbuttonlivinpage);
        log.info("Clicking on the 'liveinpage' button: " + nextbuttonlivinpage.toString());

    }

    public void clickOnWalesCountry() {
        clickOnElement(countryWales);
        log.info("Clicking on the 'WalesCountry' button: " + countryWales.toString());

    }
        public void clickOnYesButton () {
            clickOnElement(yesbutton);
            log.info("Clicking on the 'YesButton' button: " + countryWales.toString());
        }


        public void clickOnNoButton () {
            clickOnElement(nobutton);
            log.info("Clicking on the 'noButton' button: " + nobutton.toString());
        }

        public void clickOnDentalPracticeOnWalesCountry () {
            clickOnElement(countryWales);
            log.info("Clicking on the 'DentalPractice: " + countryWales.toString());

        }

        public void SendTextToDateOfBirth () {
            sendTextToElement(day, "07");
            sendTextToElement(month, "06");
            sendTextToElement(year, "1983");


        }

    }











