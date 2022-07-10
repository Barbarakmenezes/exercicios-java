package exercicios;

import java.util.Scanner;

public class exerciciofor {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
      int x, num,  numpar=0, numim=0;
      
      
       for(x=1; x<=10; x++) {
       System.out.println("\n Entre com um número :");
       num=ler.nextInt();
          if (num % 2 == 0)
        	  numpar++;
          
          else 
        	  numim++;
        	  
          
     }
          
          System.out.println("os números pares são " + numpar);
          System.out.println("Os número impares são" + numim);
        	  
       
         
          
	}  
    

}
