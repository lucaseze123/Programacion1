package recursion;

public class RecursionConArreglos {
	public static int[] resto(int a[]) {
		int nuevo[] = new int[a.length - 1];
		for (int i = 1; i < a.length; i++) {
			nuevo[i - 1] = a[i];
		}
		return nuevo;
	}

	public static void imprimir(int[] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}

	public static int suma(int[] a) {
		if (a.length == 0) {
			return 0;
		}
		return a[0] + suma(resto(a));
	}

	public static int cantidadApariciones(int[] a, int n) {
		if (a.length == 0) {
			return 0;
		}
		if (a[0] == n) {
			return 1 + cantidadApariciones(resto(a), n);
		}
		return cantidadApariciones(resto(a), n);
	}

	public static boolean estaOrdenado(int[] a) {
		if (a.length == 0 || a.length == 1) {
			return true;
		}
		if (a[0] > a[1]) {
			return false;
		}
		return estaOrdenado(resto(a));
	}

	public static void main(String[] args) {
		int[] a = { 7, 6, 9, 22, 6 };
		int[]b=new int[5];
//		imprimir(a);
//		imprimir(resto(a));
		System.out.println(suma(a));
	}

}
