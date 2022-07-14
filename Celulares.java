package orientacaobjeto;

public class Celulares {

	public static void main(String[] args) {
		 Celular c1= new Celular();
		 c1.cor="Branco";
		 c1.memoria=256;
		 c1.modelo="IphoneX";
		 c1.preço=5000;
		 c1.ligar=false;
		 
		
		 c1.status();
		 
		 c1.setBateria(50);
		 System.out.println("" + c1.getBateria() +"%");
	
		
		
		 c1.carregado();
		 
		 
		 
	}

}
