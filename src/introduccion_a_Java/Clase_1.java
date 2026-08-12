package introduccion_a_Java;

public class Clase_1 {

	public static int cantDivisores(int num) { // Contamos la cantidad de divisores de un numero
		int contDiv = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contDiv++;
			}
		}
		return contDiv;
	}

	public static boolean esPrimo(int num) { // Funcion que evalua si un numero es o no primo
		if (cantDivisores(num) == 2) { // utilizamos la funcio anteriormente creada
			return true;
		}
		return false;
	}

	public static int siguientePrimo(int num) {
		num = num + 1;
		while (!esPrimo(num)) {
			num = num + 1;
		}
		return num;

	}

	public static void main(String[] args) {
		System.out.println(siguientePrimo(17));
	}

}
