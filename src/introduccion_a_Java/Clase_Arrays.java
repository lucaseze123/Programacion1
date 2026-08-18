package introduccion_a_Java;

public class Clase_Arrays {

	public static void imprimir(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.print(a[a.length - 1] + " ");
		System.out.print("]");
		System.out.println();
	}

	public static int maximo(int[] a) {
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static double promedio(int[] a) {
		double sumatoria = 0;
		for (int i = 0; i < a.length; i++) {
			sumatoria += a[i];
		}

		return sumatoria / a.length;
	}

	public static int[] agregarAtras(int[] a, int x) {
		int[] aux = new int[a.length + 1];

		for (int i = 0; i < a.length; i++) {
			aux[i] = a[i];
		}
		aux[aux.length - 1] = x;

		return aux;
	}

	public static int[] quitar(int[] a, int pos) {
		int[] aux = new int[a.length - 1];
		int k = 0;

		for (int i = 0; i < pos; i++) {
			aux[k] = a[i];
			k++;
		}
		for (int i = pos + 1; i < a.length; i++) {
			aux[k] = a[i];
			k++;
		}
		return aux;
	}

	public static int[] reverso(int[] a) {
		int[] aux = new int[a.length];
		int j = aux.length - 1; // 5-1 = 4
		for (int i = 0; i < a.length; i++) {
			aux[j] = a[i];
			j--;
		}
		return aux;
	}

	public static void main(String[] args) {
		int []a = {1,7,9,5};
		imprimir(quitar(a, 2));
	}

}
