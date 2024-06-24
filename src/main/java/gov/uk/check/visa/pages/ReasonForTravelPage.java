package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement tourismOrVisitingFamilyAndFriends;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement workAcademicVisitOrBusiness;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement joinPartnerOrFamilyForALongStay;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;



    public void clickOnTourismOrVisitingFamilyAndFriends(){
        clickOnElement(tourismOrVisitingFamilyAndFriends);
        log.info("Click on '" + tourismOrVisitingFamilyAndFriends + "' tab");
    }

    public void clickOnJoinPartnerOrFamilyForALongStay(){
        clickOnElement(joinPartnerOrFamilyForALongStay);
        log.info("Click on '" + joinPartnerOrFamilyForALongStay + "' tab");
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        log.info("Click on '" + continueButton + "' tab");
    }

    public void selectReasonForVisit(String reason){
        clickOnElement(workAcademicVisitOrBusiness);
        log.info("Click on '" + workAcademicVisitOrBusiness + "' tab");
    }


}
