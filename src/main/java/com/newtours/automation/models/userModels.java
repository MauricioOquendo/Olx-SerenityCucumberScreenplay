package com.newtours.automation.models;

public class userModels {

	String buscar;
	String ubicacion;

	public userModels(String buscar, String ubicacion) {
		this.buscar = buscar;
		this.ubicacion = ubicacion;

	}

	public String getBuscar() {
		return buscar;
	}

	public void setBuscar(String buscar) {
		this.buscar = buscar;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}
