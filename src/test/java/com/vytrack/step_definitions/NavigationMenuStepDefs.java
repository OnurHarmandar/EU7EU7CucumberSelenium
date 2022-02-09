package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {
    @When("the user Navigete to Fleet, Vehicles")
    public void the_user_Navigete_to_Fleet_Vehicles() {
        System.out.println("User navigates to fleet-->vehicles");
    }



    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("The title is Vehicles");
    }




    @When("the user Navigates to marketing, campaigns")
    public void the_user_Navigates_to_marketing_campaigns() {
        System.out.println("User navigates to marketing-->campaigns");
    }


    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("The title is Campaigns");
    }


    @When("the user Navigates to Activities, Calendar Events")
    public void the_user_Navigates_to_Activities_Calendar_Events() {
        System.out.println("User navigates to activities--->Calendar events");
    }


    @Then("the title should be Calendar")
    public void the_title_should_be_Calendar() {
        System.out.println("The title is Calendar");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
        BrowserUtils.waitFor(3);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {
        BrowserUtils.waitFor(5);
        ContactsPage contactsPage=new ContactsPage();
        System.out.println(contactsPage.pageNumber.getAttribute("value"));
        Integer actualPageNumber=Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(actualPageNumber,expectedPageNumber);
    }

}
