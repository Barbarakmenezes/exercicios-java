package orientacaobjeto;

public class Funcioanários {

	public static void main(String[] args) {
		Funcioanário funcionario1=new Funcioanário();
		Funcioanário funcionario2=new Funcioanário();
		funcionario1.nome="José carlos";
		funcionario1.cpf= "178.239.335-01";
		funcionario1.contratacao();
		
		funcionario1.salario= 850;
  
		
		funcionario1.turno= "manhã";
		
		System.out.println("Dados do novo empregado : " +funcionario1.dados("José carlos", "178.239.335-01"));
        System.out.println("trabalha no turno da:" + funcionario1.turno );
        System.out.println("O salário á pagar é de : R$" + funcionario1.salario);
	} 

}
