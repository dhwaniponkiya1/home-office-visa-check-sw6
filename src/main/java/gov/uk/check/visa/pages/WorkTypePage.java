package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement healthAndCareProfessional;

    public void selectJobType() {
        clickOnElement(healthAndCareProfessional);
        log.info("Click on '" + healthAndCareProfessional + "' tab");
    }

}
