package recursion;

public class RecursionEjerciciosParcial {
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) { // arranca en la posici�n 1 dejando afuera la posici�n 0
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}

	public static String tomarCaracteresDesde(String s, int desde, int cant) {
		if (s.length() == 0) {
			return s;
		}
		if (desde == 0 && cant == 0) {
			return "";
		}
		if (desde > 0) {
			return tomarCaracteresDesde(resto(s), desde - 1, cant);
		}
		if (desde == 0 && cant > 0) {
			return s.charAt(0) + tomarCaracteresDesde(resto(s), desde, cant - 1);
		}
		return null;

	}

	public static String insertarOrdenado(String s, char a) {
		if (s.length() == 0) {
			return a + "";
		}
		if (s.charAt(0) < a)
			return s.charAt(0) + insertarOrdenado(resto(s), a);
		else
			return a + s;

	}

	public static boolean esVocal(char c) {
		String vocales = "aeiouAEIOU";
		for (int i = 0; i < vocales.length(); i++) {
			if (vocales.charAt(i) == c)
				return true;
		}
		return false;
	}

	public static String eliminarVocalesYRevertir(String s) {
		if (s.length() == 0) {
			return s;
		}
		if(esVocal(s.charAt(0))) {
			return eliminarVocalesYRevertir(resto(s));
		}
		return eliminarVocalesYRevertir(resto(s)) + s.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(eliminarVocalesYRevertir("casa"));

	}

}
