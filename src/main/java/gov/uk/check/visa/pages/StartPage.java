package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-cookie-banner__hide-button govuk-button']")
    WebElement hideThisMessageLink;

    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Check if you need a UK visa']")
    WebElement checkIfYouNeedAUKVisaText;

    public void clickOnAcceptCookies(){
        log.info("Clicking on AcceptCookies : " + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }

    public void clickOnHideThisMessageText(){
        log.info("Mouse hovering on hide this message text : " + hideThisMessageLink.toString());
        mouseHoverToElementAndClick(hideThisMessageLink);
    }

    public void clickOnStartNowButton(){
        log.info("Clicking on Start button : " + startNowButton.toString());
        clickOnElement(startNowButton);
    }

    public void clickStartNow()  {
        clickOnAcceptCookies();
        clickOnHideThisMessageText();
        clickOnStartNowButton();
    }

}
