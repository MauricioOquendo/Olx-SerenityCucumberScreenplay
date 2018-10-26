package com.newtours.automation.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.newtours.automation.tasks.Login;
import com.newtours.automation.tasks.OpenTheBrowser;
import com.newtours.automation.userinterfaces.OlxHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class OlxStepDefinition {

	@Managed(driver = "chrome")
	private WebDriver hisbrowser;

	private Actor susan = Actor.named("Susan");

	private OlxHomePage olxHomePage;

	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(hisbrowser));
	}

	@Given("^that susan wants login on newtours$")
	public void that_susan_wants_login_on_newtours() {
		susan.wasAbleTo(OpenTheBrowser.on(olxHomePage));
	}

	@When("^he enter your username and password$")
	public void heEnterYourUsernameAndPassword(List<String> data) {
		susan.attemptsTo(Login.with(data));		
	}

	@Then("^he should see the find flight page$")
	public void heShouldSeeTheFindFlightPage() {
		// susan.should(seeThat(NewtoursResult.displayed(), hasItem("SIGN-ON")));
//		susan.attemptsTo(SeleccionarItem.con(6, OlxComponents.ITEMS));
	}

}
