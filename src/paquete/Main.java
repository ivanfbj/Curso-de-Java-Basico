package paquete;

public class Main {
	
	public static void main(String[] args) {
		
		int arreglo[]= {5,15,7,11,4,12,23,3,2,1,45,13,64,51,31,29,6};
		/**/
		
		Ordenar o = new Ordenar();
		o.ordenarInsercion(arreglo);
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
	}
}
