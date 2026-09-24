package resolucion_Modelo_Parcial;

public class Main_Principal {

	public static void main(String[] args) {
		// 1. Instanciamos las Marcas
		Marca marcaIntel = new Marca();
		marcaIntel.nombre = "Intel";
		marcaIntel.calidad = 4.8f;

		Marca marcaAsus = new Marca();
		marcaAsus.nombre = "ASUS";
		marcaAsus.calidad = 4.5f;

		Marca marcaKingston = new Marca();
		marcaKingston.nombre = "Kingston";
		marcaKingston.calidad = 4.2f;

		Marca marcaNvidia = new Marca();
		marcaNvidia.nombre = "NVIDIA";
		marcaNvidia.calidad = 4.9f;


		// 2. Instanciamos los Componentes
		Componente cpu1 = new Componente();
		cpu1.nombre = "Core i7-13700K";
		cpu1.tipo = "Procesador";
		cpu1.marca = marcaIntel;

		Componente ram1 = new Componente();
		ram1.nombre = "Fury Beast DDR5 16GB";
		ram1.tipo = "Memoria RAM";
		ram1.marca = marcaKingston;

		Componente gpu1 = new Componente();
		gpu1.nombre = "RTX 4070 Ti";
		gpu1.tipo = "Tarjeta Gráfica";
		gpu1.marca = marcaNvidia;

		Componente motherboard1 = new Componente();
		motherboard1.nombre = "ROG Strix Z790";
		motherboard1.tipo = "Placa Madre";
		motherboard1.marca = marcaAsus;


		// 3. Instanciamos las Computadoras (PC)
		PC pc1 = new PC();
		pc1.serial = "SN-2026-XF89";
		pc1.modelo = "ProArt Studio";
		pc1.OS = "Windows 11 Pro";
		pc1.componentes = new Componente[]{cpu1, ram1, gpu1, motherboard1};

		PC pc2 = new PC();
		pc2.serial = "SN-2026-LK44";
		pc2.modelo = "ThinkCentre Custom";
		pc2.OS = "Ubuntu 24.04 LTS";
		pc2.componentes = new Componente[]{cpu1, ram1}; // Configuración más simple


		// 4. Instanciamos los Laboratorios
		Laboratorio labo1 = new Laboratorio();
		labo1.numero = 101;
		labo1.capacidad = 20;
		labo1.computadoras = new PC[]{pc1, pc2};

		Laboratorio labo2 = new Laboratorio();
		labo2.numero = 102;
		labo2.capacidad = 15;
		labo2.computadoras = new PC[]{pc1}; 


		// 5. Instanciamos la clase contenedora principal Modulo7
		Modulo7 modulo7 = new Modulo7();
		modulo7.labos = new Laboratorio[]{labo1, labo2};
		System.out.println(modulo7.pcGamaAlta());

	}

}
