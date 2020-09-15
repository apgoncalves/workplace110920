package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldoConta;
	
	
	public void creditar(float valor) {
		saldoConta += valor;
	}
	
	public boolean debitar(float valor) {
		if(valor <= saldoConta) {
			this.saldoConta = saldoConta - valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public float getSaldoConta() {
		return this.saldoConta;
	}
	
}
