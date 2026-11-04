package modelo_2_Parcial;

import java.util.LinkedList;

public class Main_Principal {

	static Marca crearMarca(String nombre, float calidad) {
		Marca m = new Marca();
		m.nombre = nombre;
		m.calidad = calidad;
		return m;
	}

	static Componente crearComponente(String nombre, String tipo, Marca marca) {
		Componente c = new Componente();
		c.nombre = nombre;
		c.tipo = tipo;
		c.marca = marca;
		return c;
	}

	static PC crearPC(String serial, String modelo, String os, Componente[] componentes) {
		PC pc = new PC();
		pc.serial = serial;
		pc.modelo = modelo;
		pc.OS = os;
		pc.componentes = componentes;
		return pc;
	}

	static Laboratorio crearLab(int numero, int capacidad, PC[] pcs) {
		Laboratorio l = new Laboratorio();
		l.numero = numero;
		l.capacidad = capacidad;
		l.computadoras = pcs;
		return l;
	}

	static Modulo7 crearModulo(Laboratorio[] labos) {
		Modulo7 m = new Modulo7();
		m.labos = labos;
		return m;
	}

	public static void main(String[] args) {
		// Marcas
		Marca intel = crearMarca("Intel", 5f);
		Marca amd = crearMarca("AMD", 4.5f);
		Marca kingston = crearMarca("Kingston", 3f);
		Marca generica = crearMarca("Generica", 2f);

		// Componentes
		Componente cpuIntel = crearComponente("Core i7", "CPU", intel);
		Componente cpuAmd = crearComponente("Ryzen 5", "CPU", amd);
		Componente ramKingston = crearComponente("Fury 8GB", "RAM", kingston);
		Componente ramAmd = crearComponente("Radeon RAM 16GB", "RAM", amd);
		Componente discoIntel = crearComponente("Optane 512GB", "Disco", intel);
		Componente discoGenerico = crearComponente("HDD 1TB", "Disco", generica);

		// PCs (pc1 es de alta gama)
		PC pc1 = crearPC("SN001", "Dell Optiplex", "Windows 10", new Componente[] { cpuIntel, ramAmd, discoIntel });
		PC pc2 = crearPC("SN002", "HP ProDesk", "Ubuntu", new Componente[] { cpuAmd, ramKingston, discoGenerico });
		PC pc3 = crearPC("SN003", "Lenovo ThinkCentre", "Windows 11",
				new Componente[] { cpuIntel, ramKingston, discoGenerico });

		// Laboratorios
		Laboratorio lab1 = crearLab(1, 20, new PC[] { pc1, pc2 });
		Laboratorio lab2 = crearLab(2, 15, new PC[] { pc3 });
		Laboratorio lab3 = crearLab(3, 10, new PC[] { pc2, pc3 });

		// Módulos
		Modulo7 modulo = crearModulo(new Laboratorio[] { lab1, lab2 });
		Modulo7 moduloSinAltaGama = crearModulo(new Laboratorio[] { lab3 });

		// Pruebas
		LinkedList<Componente> lista = new LinkedList<>();
		lista = modulo.componentesPorMarca(generica);
		System.out.println(lista.toString());
	}

}
