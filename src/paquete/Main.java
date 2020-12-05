package paquete;

public class Main {
	
	public static void main(String[] args) {
		
		int arreglo[]= {5,3,4,2,1,9,8,7,21,254,78,56,32,14,58,78,9541,6,10,11,12,13};
		/*
		 * 5,3,4,2
		 * 3,4,2,5
		 * 3,2,4,5
		 * 2,3,4,5
		 * */
		
		Ordenar o = new Ordenar();
		o.ordenarBurbuja(arreglo);
		
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
	}
}
