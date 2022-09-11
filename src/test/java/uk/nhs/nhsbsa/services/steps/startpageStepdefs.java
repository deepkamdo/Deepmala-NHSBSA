package uk.nhs.nhsbsa.services.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.nhs.nhsbsa.services.pages.StartPage;

public class startpageStepdefs {
    @Given("^I am on help check page$")
    public void iAmOnHelpCheckPage() {

    }

    @And("^I accepted the cookies$")
    public void iAcceptedTheCookies() {
        new StartPage().clickOnAnalyticsCookiesBtn();
    }

    @When("^I click on start now button$")
    public void iClickOnStartNowButton() {
        new StartPage().clickOnStartNow();
    }

    @And("^I select Wales for live in country$")
    public void iSelectWalesForLiveInCountry() {
        new StartPage().clickOnWalesCountry();
    }


    @And("^I click on next button$")
    public void iClickOnNextButton() {
        new StartPage().clickOnLiveInPagenextButton();

}

    @And("^I select yes button for registered with a GP who isn't in England$")
    public void iSelectYesButtonForRegisteredWithAGPWhoIsnTInEngland() {
        new StartPage().clickOnYesButton();
    }
    @And("^I select Wales button$")
    public void iSelectWalesButton() {
        new StartPage().clickOnWalesCountry();
    }
    @And("^I select Wales button for dental practice$")
    public void iSelectWalesButtonForDentalPractice() {
        new StartPage().clickOnDentalPracticeOnWalesCountry();
    }


    @And("^I input date of birth$")
    public void iInputDateOfBirth() {
        new StartPage().SendTextToDateOfBirth();

    }

    @And("^I select yes button for live with partner$")
    public void iSelectYesButtonForLiveWithPartner() {new StartPage().clickOnYesButton();
    }

    @And("^I select no button for partner claim benefits or tax credits$")
    public void iSelectNoButtonForPartnerClaimBenefitsOrTaxCredits() {new StartPage().clickOnNoButton();
    }

    @And("^I select no button for pregnant$")
    public void iSelectNoButtonForPregnant() {new StartPage().clickOnNoButton();
    }
    @And("^I select no button for injury serving in the armed forces$")
    public void iSelectNoButtonForInjuryServingInTheArmedForces() {
        new StartPage().clickOnNoButton();
    }
    @And("^I select no button for diabetes$")
    public void iSelectNoButtonForDiabetes() {
        new StartPage().clickOnNoButton();
    }
    @And("^I select no button for glaucoma$")
    public void iSelectNoButtonForGlaucoma() {
        new StartPage().clickOnNoButton();
    }
    @And("^I select no for live in care home$")
    public void iSelectNoForLiveInCareHome() {new StartPage().clickOnNoButton();
    }
    @And("^I select no for savings,investments or property$")
    public void iSelectNoForSavingsInvestmentsOrProperty() {new StartPage().clickOnNoButton();
    }

    @Then("^I confirm that I get help with NHS costs$")
    public void iConfirmThatIGetHelpWithNHSCosts() {
        String expectedresult = "You get help with NHS costs";
       new StartPage().getTextFromHelpWithnhsCosts();
//        Assert.assertEquals("not matched",expectedresult, new StartPage().getTextFromHelpWithnhsCosts());
        Assert.assertTrue(new StartPage().getTextFromHelpWithnhsCosts().contains(expectedresult));
    }



}


