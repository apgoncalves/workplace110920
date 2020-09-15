import java.util.Scanner;
public class QuestaoFront {
	public static void main(String[] args) {
		
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		Questao Lista[] = new Questao[3];

		
		Lista[0] = new Questao("Qual a UF de São Paulo?","SP");
		Lista[1] = new Questao("Qual a UF do Rio de Janeiro?","RJ");
		Lista[2] = new Questao("Qual a UF de Minas Gerais?","MG");
		
		for(Questao e : Lista) {
			System.out.println(e.apresentaQuestao());
			String respAluno = keyboard.nextLine();
			if(e.corrigeQuestao(respAluno)) {
				System.out.println("RESPOSTA CORRETA!");
			}
			else {
				System.out.println("RESPOSTA INCORRETA!");
			}
			
		}
		keyboard.close();	
	}
}
