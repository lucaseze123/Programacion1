package introduccion_a_Java;

public class Clase_String {

	public static boolean soloLetrasE(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)!='e') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean sonIguales(String s1, String s2) {
		if(s1.length()!= s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!= s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	static public boolean esDuódromo(String p) {
		if(p.length()%2!=0) {
			return false;
		}
		for (int i = 0; i < p.length()-1; i=+2) {
			if(p.charAt(i)!=p.charAt(i+1)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		//String p="eEeee".toLowerCase();
		System.out.println(esDuódromo("hhooplaa"));
	}

}
