package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.data_structures.Fila;
import model.data_structures.Stack;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */

	private Fila<Multa> fila;
	private Stack<Multa> pila;
	private final static String path = "/T2_202010/data/comparendos_dei_2018_small.geojson";

	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo() {
		Gson gson = new Gson();
		Reader reader;
		try {
			reader = new FileReader(path);
			PrimeraClase pc = gson.fromJson(reader, PrimeraClase.class);
			System.out.println(pc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo
	 * 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamanoPila() {
		return pila.getSize();
	}

	public int darTamanoFila() {
		return fila.size();
	}

	/**
	 * Requerimiento de agregar dato
	 * 
	 * @param dato
	 */

	public void agregarFila(Multa dato) {

		fila.enqueue(dato);
	}

	public void agregarPila(Multa dato) {

		pila.push(dato);
	}

	/**
	 * Requerimiento eliminar dato
	 * 
	 * @param dato
	 *            Dato a eliminar
	 * @return dato eliminado
	 */

	public void eliminarFila(Multa dato) {
		fila.dequeue();
	}

	public void eliminarPila(Multa dato) {
		pila.pop();
	}

	public Fila<Multa> reqFuncional2() {
		Fila<Multa> temp = new Fila<Multa>();
		Fila<Multa> resp = new Fila<Multa>();
		Multa x = null;

		while (!fila.isEmpty()) {
			x = fila.dequeue().getData();
			if (temp.getPrimero().equals(null)) {
				temp.enqueue(x);
			} else if (temp.getUltimo().getData().getCaracteristicas().getInfraccion()
					.equals(x.getCaracteristicas().getInfraccion())) {
				temp.enqueue(x);
			} else {

				if (temp.size() > resp.size()) {
					resp = temp;
				}
				temp = new Fila<Multa>();
				temp.enqueue(x);
			}
		}
		return resp;

	}

	public Stack<Multa> reqFuncional3(int pTamano, String codInfr) {
		int size = pila.getSize();
		Stack<Multa> resp = new Stack<Multa>();
		Multa x = null;
		int i = 0;

		while (i < size && resp.getSize() <= pTamano) {
			x = pila.pop();

			if (x.getCaracteristicas().getInfraccion().equals(codInfr)) {
				resp.push(x);
			}

		}
		return resp;
	}

}
