package paquete;

import java.util.LinkedList;

public class Main {


	/*Métodos a utilizar
	 * offer: añadir un dato
	 * poll: obtener un dato
	 * */
	
	//Cola = FIFO // first in , first out
	
	public static void main(String[] args) {
		LinkedList cola = new LinkedList();

		// llenar Cola
		for (int i = 1; i <= 10; i++) {
			cola.offer(i);
		}

		// Imprimir
		while (cola.peek() != null) {
			System.out.println("" + cola.poll());
			;
		}

	}
}
