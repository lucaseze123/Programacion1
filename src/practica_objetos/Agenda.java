package practica_objetos;

public class Agenda {
	Persona[] contactos;
	String[] telefonos;

	Agenda(int tamanio) {
		this.contactos = new Persona[tamanio];
		this.telefonos = new String[tamanio];
	}

	public void mostrarAgenda() {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null) {
				System.out.println(this.contactos[i].nombre + " - " + this.contactos[i].edad + " - " + telefonos[i]);
			} else {
				System.out.println("Null");
			}
		}
	}

	public void guardar(Persona contacto, String telefono) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				contactos[i] = contacto;
				telefonos[i] = telefono;
				return;
			}
		}
		int nuevoTamanio = contactos.length * 2 + 1;
		Persona nueva[] = new Persona[nuevoTamanio];
		String nuevoTelefono[] = new String[nuevoTamanio];
		for (int i = 0; i < contactos.length; i++) {
			nueva[i] = contactos[i];
			nuevoTelefono[i] = telefonos[i];
		}
		nueva[contactos.length] = contacto;
		nuevoTelefono[contactos.length] = telefono;
		contactos = nueva;
		telefonos = nuevoTelefono;
	}

	public void eliminar(Persona contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null && contactos[i].mismaPersona(contacto)) {
				contactos[i] = null;
				telefonos[i] = null;
				return;
			}
		}
	}

	public boolean pertenece(Persona contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null && contactos[i].mismaPersona(contacto)) {

				return true;
			}
		}
		return false;
	}

	public String dameTelefono(Persona contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null && contactos[i].mismaPersona(contacto)) {
				return telefonos[i];
			}
		}
		return null;
	}
}
