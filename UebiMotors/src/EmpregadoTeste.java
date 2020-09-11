
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado emp1,emp2,emp3;
		
		emp1 = new Empregado();
		emp2 = new Empregado();
		emp3 = new Empregado();
		
		emp1.nome = "Adalberto Gonçalves";
		emp1.cargo = "Analista de TI";
		emp1.salario = 1000.00;
		
		emp2.nome = "Fulano de Almeida";
		emp2.cargo = "Supervisor";
		emp2.salario = 3000.00;
		
		emp3.nome = "Jose Aldo";
		emp3.cargo = "Lutador";
		emp3.salario = 10000.00;
		
		emp1.imprimir();
		emp2.imprimir();
		emp3.imprimir();
	}
}
