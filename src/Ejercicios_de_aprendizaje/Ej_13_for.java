package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:*/

public class Ej_13_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de * que desee por lado");
		lado = leer.nextInt();
		
		for(int i = 0 ; i < lado ; i++) {
			for(int j = 0 ; j < lado ; j++) {
				if((i==0)||(j==0)||(j==(lado-1))||(i==(lado-1))) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
	}

}
