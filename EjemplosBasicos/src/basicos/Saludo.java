package basicos;
import java.util.Scanner;
public class Saludo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		String apellido;
		
		System.out.println("Por favor, escribe tu nombre");
		 
		nombre = entrada.nextLine();
		
		 System.out.println("Hola, " + nombre);
		
		System.out.println("Ahora, dime tu apellido.");
		
		apellido = entrada.nextLine();
		System.out.println("Bienvenido a Java " + nombre + " "+ apellido );
		
		entrada.close();
		

	}

}
