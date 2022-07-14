package orientacaobjeto;

public class Celular {
	
	String modelo; 
	String cor;
	int memoria; 
	double preço;
	int bateria;
	boolean ligar;
	
	void status() {
		System.out.println("Modelo : " + this.modelo);
		System.out.println("A cor é : " + this.cor);
		System.out.println("A memória é de :" + this.memoria + "GB");
		System.out.println("O preço dele é de : R$"+ this.preço);
	}
	
	void carregado() {
		if (this.bateria >20) {
			System.out.println("Carregado");
		}
		
		if(this.bateria< 20) {
			System.out.println("Está descarregando...Conecte no carregador!!!");
		} else {
			System.out.println("Celular desligando....");
		}
	}
       
	
	void ligado () {
		this.ligar=true;
	}
	
	void desligado () {
		this.ligar = false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public boolean isLigar() {
		return ligar;
	}

	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}
}
