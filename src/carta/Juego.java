package carta;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mazo m = new Mazo();
		m.mezclar();
		
		Jugador jugador = new Jugador();
		Jugador banca = new Jugador();
		
		Scanner sc = new Scanner(System.in);
		boolean sePlanto = false;
		
		jugador.pedirCarta(m.repartir()); //recibe la primer carta para jugar
		jugador.pedirCarta(m.repartir()); //recibe la primer segunda para jugar
		//está listo para comenzar el juego
		
		jugador.imprimir();//mostramos las cartas que le tocó
		System.out.println("Puntaje jugador: " + jugador.puntos());
		
		//arranca a pedir más cartas para jugar JUGADOR
		while(sePlanto == false && jugador.puntos() <= 7.5) {
			//preguntamos con las cartas originales si quiere plantarse o no
			System.out.println("¿Desea una carta más? Ingrese S o N");
			String respuesta = sc.nextLine();
			if(respuesta.toUpperCase().charAt(0) == 'N')
				sePlanto = true;
			
			if(sePlanto != true) {
				jugador.pedirCarta(m.repartir()); //pedimos una carta
				jugador.imprimir();//mostramos las cartas que le tocó
				System.out.println("Puntaje jugador: " + jugador.puntos());
			}
		}
		
		//ARRANCA A JUGAR LA BANCA
		if(jugador.puntos() > 7.5)
			System.out.println("JUGADOR Ha PERDIDO el juego.");
		else {
			System.out.println("Arranca a jugar la BANCA.");
			while(banca.puntos() < jugador.puntos()) {
				banca.pedirCarta(m.repartir()); //la banca pide una carta
				banca.imprimir();//mostramos las cartas que le tocó
				System.out.println("Puntaje banca: " + banca.puntos());
			}
			if(banca.puntos() > 7.5)
				System.out.print("JUGADOR Ha GANADO el juego.");
			else
				System.out.println("JUGADOR Ha PERDIDO el juego.");
		}
			
		sc.close();
		
		//Carta c = m.repartir();
		
		/*m.repartir().mostrar();
		m.repartir().mostrar();
		m.repartir().mostrar();
		m.mezclar();
		System.out.println("------------");
		m.mostrar();*/
		
		
	}

}