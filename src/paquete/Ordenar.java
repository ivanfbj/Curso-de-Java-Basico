package paquete;

public class Ordenar {

	public void ordenarInsercion(int array[]) {

		int aux, cont1, cont2;

		for (cont1 = 1; cont1 < array.length; cont1++) {

			aux = array[cont1];
			
			for (cont2 = cont1 - 1; cont2 >= 0 && array[cont2] > aux; cont2--) {
				array[cont2 + 1] = array[cont2];
				array[cont2] = aux;
			}

		}

	}

	public void ordenarBurbuja(int array[]) {

		int aux;
		boolean cambios = false;

		while (true) {

			cambios = false;
			for (int i = 1; i < array.length; i++) {

				if (array[i] < array[i - 1]) {

					aux = array[i];
					array[i] = array[i - 1];
					array[i - 1] = aux;
					cambios = true;
				}
			}
			if (cambios == false) {
				break;
			}
		}

	}

}
