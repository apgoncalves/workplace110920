
public class FolhaDePagamento {
	public static void main(String[] args) {

		Empregado array[];
		array = new Empregado[10];

		array[0] = new Empregado("Professor Isidro", "Professor", 3500.0);
		array[1] = new Empregado("Deosdedite Ferreira", "Diretora", 5000.0);
		array[2] = new Empregado("Margareth Pires da Fonseca", "Supervisora", 4000.0);

		
		for (int posicao = 0; posicao < 3; posicao++) {
			System.out.println("----------------------------------------------");

			array[posicao].imprimir();
		}
	}

}
