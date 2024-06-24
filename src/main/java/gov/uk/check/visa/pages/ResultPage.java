package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement youNeedVisaText;

    public String getResultMessage(){
        log.info("Checking text is Displayed");
        return getTextFromElement(resultMessage);
    }

    public String getDisplayedText(){
        log.info("Checking text is Displayed");
        return getTextFromElement(resultText);
    }

    public String getYouNeedVisaText(){
        log.info("Checking text is Displayed");
        return getTextFromElement(youNeedVisaText);
    }
}
