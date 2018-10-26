package com.newtours.automation.tasks;

import static net.serenitybdd.core.steps.Instrumented.instanceOf;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarItem implements Task{

	private int index;
	private Target target;
	
	

	public SeleccionarItem(int index, Target target) {
		super();
		this.index = index;
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> items = target.resolveAllFor(actor);
		actor.attemptsTo(Click.on(items.get(index)));		
	}

	public static SeleccionarItem con(int index, Target target)
	{
		return instanceOf(SeleccionarItem.class).withProperties(index,target);
	}
}
