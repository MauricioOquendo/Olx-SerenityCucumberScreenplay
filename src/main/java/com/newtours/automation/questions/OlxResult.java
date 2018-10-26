package com.newtours.automation.questions;

import java.util.List;

import com.newtours.automation.userinterfaces.OlxComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class OlxResult implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		//return OlxHomePage.RESULT_TEXT.resolveFor(actor).getText();
		return Text.of(OlxComponents.BUSCAR).viewedBy(actor).asList();
	}
	
	public static OlxResult displayed() {
		return new OlxResult();
	}

}
