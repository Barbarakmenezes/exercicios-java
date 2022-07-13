package orientacaobjeto;

public class Funcioanário {
	
	String nome;
	String turno;
	int salario;
	String cpf;
	
	

	void contratacao() {
		System.out.println("Inserindo funcionário novo no sistema");
	}
	
	public String dados(String nome, String cpf) {
		String novoNome=this.nome;
		String novoCpf=this.cpf;
		return novoNome + novoCpf;
		
		
	}
	
	public int novoSalario (int valorInt) {
		System.out.printf("Salário cheio é de : %d \n", valorInt);
		return valorInt;
	}
	
	
		
	
}
