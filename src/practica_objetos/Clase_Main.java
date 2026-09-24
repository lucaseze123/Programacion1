package practica_objetos;

public class Clase_Main {

	public static void main(String[] args) {
		// String [] telefonos=new String[5];
		Persona p1 = new Persona("Juan", 30);
		Persona p2 = new Persona("Pepe", 50);
		Persona p3 = new Persona("Diego", 80);
		Persona p4 = new Persona("Marta", 30);
		Persona p5 = new Persona("Juana", 19);
		Persona p6 = new Persona("Ignacio", 59);
		Persona p7 = new Persona("Charly", 59);

		Agenda agenda = new Agenda(3);
		agenda.guardar(p1, "1155772210");
		agenda.guardar(p2, "1155772210");
		agenda.guardar(p3, "1155906217");
		agenda.guardar(p4, "1155772210");
		agenda.guardar(p5, "1155772210");
		agenda.mostrarAgenda();
		agenda.guardar(p6, "1133110087");
		System.out.println();
		agenda.mostrarAgenda();
		agenda.eliminar(p3);
		System.out.println();
		agenda.mostrarAgenda();
		System.out.println();
		agenda.guardar(p7, "22436787");
		agenda.mostrarAgenda();
		System.out.println("El telefono es: "+agenda.dameTelefono(p7));

	}
}
