package basicos;
import java.util.Scanner;
public class Saludo {
	
	public static String saludoMetodo(String n, String a) {
		String saludo = "Hola " + n + " " + a;
		
		return saludo;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		String apellido;
		System.out.println("Por favor, escribe tu nombre:");
		nombre = entrada.nextLine().toUpperCase();
		System.out.println("Ahora, dime tu apellido:");
		apellido = entrada.nextLine().toUpperCase();
		System.out.println(saludoMetodo(nombre,apellido));
		entrada.close();
	}

}
