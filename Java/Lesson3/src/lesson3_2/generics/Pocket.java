package lesson3_2.generics;

public class Pocket<E> {
	
	private E data;

	public Pocket(E data) {
		this.data = data;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
}
