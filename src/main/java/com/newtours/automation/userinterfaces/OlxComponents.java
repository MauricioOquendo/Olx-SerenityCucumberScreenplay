package com.newtours.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
// Mapeo de las rutas de los componentes de Olx 
public class OlxComponents {

	public static final Target BUSCAR = Target.the("Buscar en olx")
			.located(By.xpath("//input[@placeholder='¿Qué estás buscando?']"));
	public static final Target CLICK_BUSCAR = Target.the("Buscar en olx")
			.located(By.xpath("//li[@data-index='0']"));
	public static final Target UBICACION = Target.the("Ubicacion en olx")
			.locatedBy("//a[contains(text(),'{0}') and contains(@data-location,'olx')]");
	
	public static final Target ITEMS = Target.the("").locatedBy("//div[@class='items-info']//a[@data-qa='list-item']");
}
