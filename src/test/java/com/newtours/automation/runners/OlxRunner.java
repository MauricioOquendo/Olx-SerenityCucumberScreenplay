package com.newtours.automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
// Para correr el runner
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features",
                 glue="com.newtours.automation.stepdefinitions",// tiene este nombre por asi se creo el paquete
                 snippets=SnippetType.CAMELCASE)
public class OlxRunner {

}
