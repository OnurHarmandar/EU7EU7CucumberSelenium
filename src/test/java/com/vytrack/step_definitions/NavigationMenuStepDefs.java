package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        System.out.println("The title  is Campaigns");
    }


    @When("the user Navigates to Activities, Calendar Events")
    public void the_user_Navigates_to_Activities_Calendar_Events() {
        System.out.println("User navigates to activities--->Calendar events");
    }


    @Then("the title should be Calendar")
    public void the_title_should_be_Calendar() {
        System.out.println("The title is Calendar");
    }

}
