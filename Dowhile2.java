package exercicios;

import java.util.Scanner;

public class Dowhile2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		

		int x,  soma=0, t=0;
		
		do {
			System.out.println("Coloque um número :");
			x=leia.nextInt();
			
			if(x%3 == 0 & n1!=0) {
				soma=soma + x;
				t++;
			}
			
		} while(x != 0);
		
		
		
		System.out.println(" Minha média de números é de :" + soma/t);

	}

}
