package paquete;

public class Main {

	public static void main(String[] args) {

		int arreglo[] = { 5, 11, 7, 15, 4, 12, 4, 75, 1, 3, 5, 7, 6, 23, 3, 4, 2, 1, 45, 13 };
		/**/

		Ordenar o = new Ordenar();
		o.ordenarQuickSort(arreglo);

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

	}
}
