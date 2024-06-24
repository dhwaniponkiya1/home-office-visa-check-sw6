package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());


    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;


    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDown, nationality);
        log.info("Click on '" + nationalityDropDown + "' tab");
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
        log.info("Click on '" + continueButton + "' tab");
    }


}
