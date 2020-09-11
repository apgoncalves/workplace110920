
public class Empregado {
	String nome;
	String cargo;
	Double salario;
	
	void imprimir( ) {
		System.out.println("=========================================");
		System.out.println("NOME: "+nome);
		System.out.println("CARGO: "+cargo);
		System.out.printf("SALARIO: R$ %.2f\n",salario);
		System.out.println("=========================================");
	}
}
