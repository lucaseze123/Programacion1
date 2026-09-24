package resolucion_Modelo_Parcial;

public class Recursion_Parcial {

	public static boolean esVocal(char a) {
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			return true;
		}
		return false;
	}

	public static String eliminarVocalesYRevertir(String s) {
		if (s.length() == 0) {
			return s;
		}
		if (esVocal(s.charAt(0))) {
			return eliminarVocalesYRevertir(s.substring(1));
		}
		return eliminarVocalesYRevertir(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(eliminarVocalesYRevertir("fadap"));

	}

}
