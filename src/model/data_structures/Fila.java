package model.data_structures;

public class Fila<T> implements IFila<T> {
	/**
	 * Se guarda el tamaño de la fila
	 */
	private int size;

	/**
	 * Se guarda el primer elemento de la fila.
	 */

	private Node<T> primero;
	/**
	 * Se guarda el ultimo elemento de la fila.
	 */
	private Node<T> ultimo;

	public Fila() {
		size = 0;
		primero = null;
	}

	public int size() {

		return size;
	}

	public boolean isEmpty() {
		return primero == null;
	}

	public void enqueue(T dato) {
		Node<T> data = new Node<T>(dato);
		if (isEmpty()) {
			this.primero = data;
			this.ultimo = data;

		} else {
			this.ultimo.setNext(data);
			this.ultimo = data;
		}
	}

	public Node<T> getPrimero() {
		return primero;
	}

	public Node<T> getUltimo() {
		return ultimo;
	}

	public Node<T> dequeue() {
		if (this.primero == null)
			return null;

		Node<T> temp = this.primero;
		this.primero = this.primero.getNext();

		if (this.primero == null)
			this.ultimo = null;
		return temp;
	}

}
