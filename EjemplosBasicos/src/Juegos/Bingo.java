package Juegos;

import Ejercicios.Recursos;
import java.util.Scanner;
public class Bingo {
	
	final static int NUMERO_BOLAS = 90;
	final static int FILAS_CARTON = 3;
	final static int COLUMNAS_CARTON = 9;
	static int [][] tableroBingo = new int [9][10];
	
	public static void mostrarTablero() {
		for (int i = 0 ;i<tableroBingo.length; i ++) {
			for (int j = 0;j<tableroBingo[0].length; j++) {
				if(tableroBingo[i][j]==0) {
					System.out.print("X\t");
				}else {
					System.out.print(tableroBingo[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void generarCarton() {
		int [][] carton = new int[FILAS_CARTON][COLUMNAS_CARTON];
				
	}
	
	
	public static void sacarBola() {
		boolean bolaNueva = false;
		int bola;
		do {
			bola = Recursos.numAleatorio(NUMERO_BOLAS);
			int fila = bola/10;
			int columna= bola%10; 
			if (columna == 0) {
				if(tableroBingo[fila-1][tableroBingo[0].length -1]==0)
				tableroBingo[fila-1][tableroBingo[0].length -1]=bola;
				bolaNueva=true;
			} else if (tableroBingo[fila][columna-1]==0){
				tableroBingo[fila][columna-1]=bola;
				bolaNueva=true;
			}
			
		}while(bolaNueva==false);
		
		
		
		
		System.out.println("Eeeeeeeeeel..." + bola);
	}
	
	public static void main(String[] args) {
		String hayBingo;
		Scanner sc = new Scanner (System.in);
	do {	sacarBola();
		mostrarTablero();
		hayBingo=sc.nextLine().toLowerCase();
	} while (!hayBingo.equals("s"));
	
}

}
