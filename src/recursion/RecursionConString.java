package recursion;

public class RecursionConString {

	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) { // arranca en la posici�n 1 dejando afuera la posici�n 0
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}

	public static void imprimirEspaciado(String s) {
		if (s.length() == 0) {
			System.out.print(s);
		} else {
			System.out.print(s.charAt(0) + " ");
			imprimirEspaciado(resto(s));

		}
	}

	public static String reverso(String s) {
		if (s.length() == 0) {
			return s;
		} else {
			return reverso(resto(s)) + s.charAt(0);
		}

	}

	public static int longitud(String s) {
		if (s.length() == 0) {
			return 0;
		} else {
			return 1 + longitud(resto(s));
		}
	}

	public static boolean esAbecedaria(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return true;
		} else {
			if (s.charAt(0) > s.charAt(1)) {
				return false;
			}
		}
		return esAbecedaria(resto(s));
	}

	public static void main(String[] args) {
		String s = "Juan";
		// imprimirEspaciado(s);
		System.out.println(esAbecedaria("casa"));

	}

}
