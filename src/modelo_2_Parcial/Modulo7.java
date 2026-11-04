package modelo_2_Parcial;

import java.util.LinkedList;

public class Modulo7 {
	Laboratorio[] labos;

	LinkedList<Componente> componentesPorMarca(Marca m) {
		LinkedList<Componente> lista = new LinkedList<Componente>();
		for (Laboratorio lab : labos) {
			for (PC pc : lab.computadoras) {
				for (Componente comp : pc.componentes) {
					if (comp.marca.equals(m) && !lista.contains(comp)) {
						lista.add(comp);
					}
				}
			}
		}
		return lista;
	}

	int contadorPorMarca(Marca m) {
		int contador = 0;
		for (Laboratorio lab : labos) {
			for (PC pc : lab.computadoras) {
				for (Componente comp : pc.componentes) {
					if (comp.marca.equals(m)) {
						contador++;
					}

				}
			}
		}
		return contador;
	}

	LinkedList<Marca> guardarMarcas() {
		LinkedList<Marca> lista = new LinkedList<Marca>();
		for (Laboratorio lab : labos) {
			for (PC pc : lab.computadoras) {
				for (Componente comp : pc.componentes) {
					if (!lista.contains(comp.marca)) {
						lista.add(comp.marca);
					}
				}
			}
		}
		return lista;
	}
	
	 Marca marcaMasUsada() {
		 LinkedList<Marca> listaMarca=guardarMarcas();
		 int max=-1;
		 Marca marca =null;
		 for(Marca m : listaMarca) {
			 if(max<contadorPorMarca(m)) {
				 marca=m;
				 max=contadorPorMarca(m);
			 }
		 }
		 return marca;
	 }
}
