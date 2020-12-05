package paquete;

import java.util.Stack;

public class Main {


	/*
	 * push: insertar un dato en la pila
	 * pop: retirar el ultimo dato ingresado
	 * peek: para ver el ultimo dato de la pila
	 * empty: para saber si hay o no datos en la pila
	 * */
	
	//Pial = FILO fisrt-in , last-out
	
	public static void main(String[] args) {

		Stack pila = new Stack();
		pila.push(50); // indice de 0
		pila.push("Ivan"); // indice 1
		pila.push(27);
		pila.push("fernando");
		System.out.println("El ultimo elemento en la pila es: " + pila.peek());

		while (pila.empty() == false) {
			System.out.println(pila.pop());
		}

	}
}
