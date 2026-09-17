package practica_objetos;

public class Clase_Main {

	public static void main(String[] args) {
		Persona[] grupo = new Persona[5];
		Persona p1 = new Persona("Juan", 30);
		Persona p2 = new Persona("Pepe", 50);
		Persona p3 = new Persona("Diego", 80);
		Persona p4 = new Persona("Marta", 30);
		Persona p5 = new Persona("Juana", 19);
		grupo[0] = p1;
		grupo[1] = p2;
		grupo[2] = p3;
		grupo[3] = p4;
		grupo[4] = p5;


		Persona masChica = Persona.masJoven(grupo);
		masChica.mostrarPersona();
		
}}
