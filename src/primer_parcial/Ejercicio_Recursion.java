package primer_parcial;

public class Ejercicio_Recursion {

	public static String intercalarDesde(String s1, String s2, int pos) {
		if (s1.length() == 0) {
			return s2;
		}
		if (s2.length() == 0) {
			return s1;
		}
		if (pos > 0) {
			return intercalarDesde(s1.substring(1), s2.substring(1), pos - 1);
		}
		return s1.charAt(0) + "" + s2.charAt(0) + intercalarDesde(s1.substring(1), s2.substring(1), pos);
	}

	public static void main(String[] args) {
		// 1. Inicialización de Socios
		Socio socio1 = new Socio("Carlos Pérez", "SOC0000001", true, null);
		Socio socio2 = new Socio("Ana Gómez", "SOC0000002", true, null);
		Socio socio3 = new Socio("Luis Martínez", "SOC0000003", false, new Fecha(15, 8, 2025));
		Socio socio4 = new Socio("María López", "SOC0000004", true, null);

		// 2. Inicialización de Libros con sus respectivos arrays internos

		// Libro 1: "Cien años de soledad" (Tiene 2 copias en inventario, prestado a
		// Carlos y Ana)
		int[] invLibro1 = { 10001, 10002 };
		Socio[] prestamosLibro1 = { socio1, socio2 };
		Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Sucursal Centro", "EST00001",
				invLibro1, prestamosLibro1);

		// Libro 2: "1984" (Tiene 3 copias en inventario, prestado a María)
		int[] invLibro2 = { 20001, 20002, 20003 };
		Socio[] prestamosLibro2 = { socio4 };
		Libro libro2 = new Libro("1984", "George Orwell", "Sucursal Norte", "EST00002", invLibro2, prestamosLibro2);

		// Libro 3: "El Principito" (Tiene 1 copia, no está prestado a nadie
		// actualmente)
		int[] invLibro3 = { 30001 };
		Socio[] prestamosLibro3 = {}; // Array vacío
		Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "Sucursal Centro", "EST00003", invLibro3,
				prestamosLibro3);

		// 3. Inicialización de la Biblioteca con el array de libros
		Libro[] catalogoCompleto = { libro1, libro2, libro3 };
		Biblioteca miBiblioteca = new Biblioteca(catalogoCompleto);
//        System.out.println(libro2.registrarPrestamo(socio4));
//        System.out.println(libro2.registrarPrestamo(socio4));
//        System.out.println(libro2.registrarPrestamo(socio4));
//        System.out.println(libro2.registrarPrestamo(socio4));
//        System.out.println(libro2.registrarPrestamo(socio4));
//        System.out.println(libro2.registrarPrestamo(socio4));
//        System.out.println(libro2.registrarPrestamo(socio4));
//        
//        System.out.println();
//        System.out.println(miBiblioteca.cantPrestamos(socio1));

		System.out.println(intercalarDesde("hola", "abc", 2));

	}
}
