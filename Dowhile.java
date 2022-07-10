package exercicios;

import java.util.Scanner;

public class Dowhile {

	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int x, soman=0;
		
		do {
			System.out.println("Escreva um número :");
			x=leia.nextInt();
			
			if(x !=0)
			soman= soman + x;
			
			
		} while(x != 0 );
		System.out.println("A soma dos números é de :"+ soman );

	} 

	}


