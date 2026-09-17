package practica_objetos;

public class Persona {
	String nombre;
	int edad;

	public Persona(String nombre, int edad) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public void mostrarPersona() {
		System.out.println(this.nombre + "," + this.edad);
	}

	public boolean masJovenQue(Persona otro) {
		if (this.edad < otro.edad) {
			return true;
		}
		return false;
	}

	public boolean tocayo(Persona otro) {
		if (this.nombre.equals(otro.nombre)) {
			return true;
		}
		return false;
	}

	public boolean mismaPersona(Persona otro) {
		if (this.edad == otro.edad && this.nombre.equals(otro.nombre)) {
			return true;
		}
		return false;
	}

	static Persona masJoven(Persona[] grupo) {
		Persona masJoven = grupo[0];
		for (int i = 0; i < grupo.length; i++) {
			if (masJoven.edad > grupo[i].edad) {
				masJoven = grupo[i];
			}
		}
		return masJoven;
	}

	static Persona buscar(Persona[] grupo, String nombre) {
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i]!=null && grupo[i].nombre.equals(nombre)) {
				return grupo[i];
			}
		}
		return null;
	}
}
