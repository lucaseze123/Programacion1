package modelo_2_Parcial;

import java.util.LinkedList;

public class Modulo7 {
	Laboratorio[] labos;

	LinkedList<Componente> componentesPorMarca(Marca m) {
		LinkedList<Componente> lista = new LinkedList<>();
		for (Laboratorio lab: labos) {
			for(PC pc:lab.computadoras ) {
				for(Componente comp: pc.componentes) {
					if(comp.nombre.equals(m) && !lista.contains(comp)) {
						lista.add(comp);
					}
				}
			}
		}
		return lista;
	}
}
