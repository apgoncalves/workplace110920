package userinterface;
import core.Conta;

public class ContaTransacoes {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.setNomeTitular("Adalberto Gonçalves");
		c1.setCpf("222.222.222-89");
		c1.setNumeroConta(1111);
		System.out.println("Nome: "+c1.getNomeTitular()+" / CPF: "+c1.getCpf()+" / Conta: "+c1.getNumeroConta());
		
		c1.creditar(1000);
		System.out.printf("SALDO ATUAL: R$ %.2f\n", c1.getSaldoConta());
		
		if(c1.debitar(1000)) {
			System.out.printf("SALDO ATUAL: R$ %.2f\n", c1.getSaldoConta());
		}
		else {
			System.out.printf("NÃO HÁ SALDO! SALDO DISPONÍVEL: R$ %.2f",c1.getSaldoConta());
		}
	}
}
