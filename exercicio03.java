package exercicios;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		int idade; 
		
		Scanner leia = new Scanner(System.in);
		

		
		System.out.println("\n Coloque sua idade aqui :"); 
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <=14) {
			System.out.println("\n Você é infantil");
	} else if(idade >=15 && idade <=17) {
		System.out.println("\n Você é adolescente");
	}  else if (idade >= 18 && idade <= 25) {
		System.out.println("\n Você é adulto!!!");
	} else {
		System.out.println("\n Opção inválida!!!");
	}

	}

}
