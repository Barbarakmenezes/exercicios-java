package exercicios;

import java.util.Scanner;

public class Exerciciowhile {

	public static void main(String[] args) {
		int idade, menos=0, mais=0; 
		Scanner ler = new Scanner(System.in);
		System.out.println("Coloque sua idade : ");
		idade= ler.nextInt();
		
		while(idade !=- 99) {
			
			if(idade<21) 
				menos++;
				
			
			
			 if (idade >50) 
			    mais++;
			    
			 System.out.println("Coloque sua idade : ");
				idade= ler.nextInt();
			
		
		}
		System.out.println("\n O total de pessoas com mais de 50 é de : " + mais);
		System.out.println("\nO total de pessoas com menos de 21 é de :" + menos);
	}

}
