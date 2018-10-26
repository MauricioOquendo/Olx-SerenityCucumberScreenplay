package com.newtours.automation.tasks;

import static com.newtours.automation.userinterfaces.OlxComponents.BUSCAR;
import static com.newtours.automation.userinterfaces.OlxComponents.CLICK_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.newtours.automation.userinterfaces.OlxComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;;

//Recibimos una lista para enviar los datos al mapeo
//Se hacen tareas como ingresar datos y hacer click

public class Login implements Task {

	private List<String> lista;
	
	
	public Login(List<String> lista) {
		super();
		this.lista = lista;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(lista.get(3)).into(BUSCAR),
				Click.on(CLICK_BUSCAR),
				Click.on(OlxComponents.UBICACION.of(lista.get(4))),
				SeleccionarItem.con(Integer.parseInt(lista.get(5)), OlxComponents.ITEMS));						
	}

	public static Login with(List<String> lista) {
		return instrumented(Login.class, lista);
	}

}
