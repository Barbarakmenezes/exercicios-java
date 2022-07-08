package exercicios;

import java.util.Scanner;

public class exercicio01 {
	public static void main (String[] args) {
		
		int n1,n2,n3, numero, maiorNumero, x=0;
		
		 Scanner leia=new Scanner(System.in);
		
       System.out.println("\n Entre com o valor :");
			n1= leia.nextInt();
			

		       System.out.println("\n Entre com o valor :");
					n2= leia.nextInt();
					
					

				   System.out.println("\n Entre com o valor :");
							n3= leia.nextInt();
							
							
							if (n1 >n2 ) {
								maiorNumero = n1;
								} else  {  maiorNumero= n2;
									
								}
							
							if (maiorNumero < n3) {
								maiorNumero = n3;
							}
							
							System.out.println ("\n O maior número é :"+ maiorNumero);
		} 
		
	}


