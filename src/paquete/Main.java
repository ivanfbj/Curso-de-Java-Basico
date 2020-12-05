package paquete;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {


		LinkedList lista = new LinkedList();
		
		lista.add("Primera palabra");
		lista.add(5);
		lista.add(17);
		lista.add("Ivan");
		
		System.out.println("El tamaño de la lista es: " + lista.size());
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		
		
		
		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());
		
		lista.remove(0);
		
		System.out.println(lista.getFirst());
		
	}
}
  