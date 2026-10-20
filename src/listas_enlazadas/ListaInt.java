package listas_enlazadas;

public class ListaInt {
	NodoInt primero;

	public void imprimir() {
		System.out.print("[");
		NodoInt actual = this.primero;
		while (actual != null) {
			System.out.print(actual.elemento + " ");
			actual = actual.siguiente;
		}
		System.out.println("]");
	}

	public boolean pertenece(int e) {
		if (primero != null) {
			if (primero.elemento == e) {
				return true;
			}
		}
		NodoInt actual = primero;
		while (actual != null) {
			if (actual.elemento == e) {
				return true;
			}
			actual = actual.siguiente;
		}
		return false;
	}

	public void quitar(int elem) {
		if (this.primero == null) {
			return;
		}
		if (this.primero.elemento == elem) {
			this.primero = this.primero.siguiente;
		}

		NodoInt actual = this.primero;

		while (actual.siguiente != null && actual.siguiente.elemento != elem) {
			actual = actual.siguiente;
		}

		if (actual.siguiente != null && actual.siguiente.elemento == elem) {
			actual.siguiente = actual.siguiente.siguiente;
		}
	}

	public static void main(String[] args) {
		ListaInt lista = new ListaInt();
		NodoInt nodo1 = new NodoInt();
		NodoInt nodo2 = new NodoInt();
		NodoInt nodo3 = new NodoInt();
		NodoInt nodo4 = new NodoInt();
		NodoInt nodo5 = new NodoInt();
		NodoInt nodo6 = new NodoInt();
		lista.primero = nodo1;
		lista.primero.siguiente = nodo2;
		nodo1.elemento = 7;
		nodo2.elemento = 77;
		nodo2.siguiente = nodo3;
		nodo3.elemento = 8;
		nodo3.siguiente = nodo4;
		nodo4.elemento = 9;
		nodo4.siguiente = nodo5;
		nodo5.elemento = 10;
		nodo5.siguiente = nodo6;
		nodo6.elemento = 27;
		nodo6.siguiente = null;
		lista.imprimir();
		lista.quitar(10);
		lista.imprimir();
		// System.out.println(lista.pertenece(17));
	}

}
