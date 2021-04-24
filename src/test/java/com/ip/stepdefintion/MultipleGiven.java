package com.ip.stepdefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleGiven {
    @Given("one thing")
    public void oneThing() {
    }

    @Given("another thing")
    public void anotherThing() {
    }

    @Given("yet another thing")
    public void yetAnotherThing() {
    }

    @When("I open my eyes")
    public void iOpenMyEyes() {
    }

    @Then("I should see something")
    public void iShouldSeeSomething() {
    }

    @Then("I shouldn't see something else")
    public void iShouldnTSeeSomethingElse() {
    }

    @Given("Java is a programimg lang")
    public void javaIsAProgramimgLang() {
    }

    @Given("php is also programimg lang")
    public void phpIsAlsoProgramimgLang() {
    }

    @When("we write it")
    public void weWriteIt() {
    }

    @Then("it gives the response")
    public void itGivesTheResponse() {
    }

    @Then("we can reuse it in another program")
    public void weCanReuseItInAnotherProgram() {
    }
    @Given("I have one cucumber.")
    public void i_have_one_cucumber() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
