package userinterface;

import java.util.Scanner;

import core.QuestaoDica;
import core.QuestaoMultiplaEscolha;
import core.QuestaoSimples;

public class AplicaProva {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String resp;
		int pontos=0;
		
		QuestaoSimples lista[] = new QuestaoSimples[5];
		lista[0] = new QuestaoSimples("Quem � o dono do interior?","XV de Jau");
		lista[1] = new QuestaoDica("Qual a linguagem do curso?","JAVA","Come�a com JA e termina com VA");
		lista[2] = new QuestaoMultiplaEscolha("Quanto vale 2+2", "quatro", "um", "dois", "tres", "quatro");
		lista[3] = new QuestaoSimples("Qual a formula da agua?","h2o");
		lista[4] = new QuestaoDica("Qual a cor do cavalo Branco de Napoleao?","Marrom","Cuidado com o nome");
	
	    for (QuestaoSimples q: lista) {
	    	System.out.println(q.aplicarQuestao());
	    	resp = teclado.nextLine();
	    	if (q.corrigir(resp)) {
	    		pontos++;
	    	}
	    }
	    System.out.println("Voce acertou "+pontos+" de um total de "+lista.length);
	}

}