package model.logic;

import model.data_structures.Fila;
import model.data_structures.Stack;

public class PrimeraClase {
	private String type;
	private Fila<Multa> features;
	private String nombre;
	private String crs;

	public PrimeraClase(String pType, Fila<Multa> features, String pNombre, String pCrs) {
		type = pType;
		features = new Fila<Multa>();
		nombre = pNombre;
		crs = pCrs;
	}

	public PrimeraClase(String pType, Stack<Multa> features, String pNombre, String pCrs) {
		type = pType;
		features = new Stack<Multa>();
		nombre = pNombre;
		crs = pCrs;
	}

	public Fila<Multa> getLista() {
		return features;
	}

	public String getType() {
		return type;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCrs() {
		return crs;
	}
}
