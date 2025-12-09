package Juegos;

import java.util.Scanner;

public class PiedraPapelTijera {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	 String [] arrayOpciones = {"Piedra", "Papel", "Tijera"};
		// Pedimos al usuario su opción
		String opcion = arrayOpciones[pedirOpcion()-1];
		// elige pc
		String opcionPC = arrayOpciones[eleccionPC()-1];
		
		System.out.println("El jugador ha elegido: " + opcion + " y el PC: " + opcionPC);
		
		if (opcion.equals(opcionPC)) {
			System.out.println("Empate!!");
		}else if((opcion.equals("Papel") && opcionPC.equals("Piedra")) || 
				(opcion.equals("Tijera") && opcionPC.equals("Papel")) ||
				(opcion.equals("Piedra") && opcionPC.equals("Tijera"))) 
		{
				System.out.println("Ganaste!!");
		} else {
			System.out.println("Perdiste!!");
		}
		
		sc.close();
		}
	
	public static int eleccionPC(){
		int eleccion = (int)(Math.random()*3)+1;
		return eleccion; 
	}

	public static int pedirOpcion() {
		int eleccion;
		System.out.println("Por favor, elija una de las siguientes opciones:");
		System.out.println("1-Piedra");
		System.out.println("2-Papel");
		System.out.println("3-Tijera");
		
		do {
			eleccion = sc.nextInt();
			if (eleccion < 1 || eleccion > 3) {
				System.out.println("Revisa tu respuesta");
			}
		} while (eleccion < 1 || eleccion >3);
		
		return eleccion;
	}
}
