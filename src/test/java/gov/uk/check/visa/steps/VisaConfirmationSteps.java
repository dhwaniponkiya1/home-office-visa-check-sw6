package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a Nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click On Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickOnContinue();
    }

    @And("I select reason {string}")
    public void iSelectReason(String reason) {
        new ReasonForTravelPage().clickOnTourismOrVisitingFamilyAndFriends();
    }

    @And("I Click on Continue button after reason")
    public void iClickOnContinueButtonAfterReason() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @Then("I should get result that You will not need a visa to come to the UK")
    public void iShouldGetResultThatYouWillNotNeedAVisaToComeToTheUK() {
        Assert.assertEquals(new ResultPage().getResultMessage(), "You will not need a visa to come to the UK");
    }

    @And("I Select reason  for {string}")
    public void iSelectReasonFor(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("I  Select intended to stay for {string}")
    public void iSelectIntendedToStayFor(String moreOrLess) {
        new DurationOfStayPage().selectLengthOfStay(moreOrLess);
    }

    @And("I Select have planning to work for Health and care professional")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectJobType();
    }

    @Then("I  should get  result You need a visa to work in health and care")
    public void iShouldGetResultYouNeedAVisaToWorkInHealthAndCare() {
        Assert.assertEquals(new ResultPage().getDisplayedText(), "You need a visa to work in health and care");
    }

    @And("I Select reason  for Join partner or family for a long stay")
    public void iSelectReasonForJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().clickOnJoinPartnerOrFamilyForALongStay();
    }

    @Then("I should get result that You need a visa")
    public void iShouldGetResultThatYouNeedAVisa() {
        Assert.assertEquals(new ResultPage().getYouNeedVisaText(), "You may need a visa");
    }

}
