package paquete;

public class Ordenar {

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
			if(cambios==false) {
				break;
			}
		}

	}

}
