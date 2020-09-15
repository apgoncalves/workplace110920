package core;

public class QuestaoDica extends QuestaoSimples{
	private String dica;

	public QuestaoDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	
	public String aplicarQuestao() {
		return super.enunciado+"\n  Dica:"+dica;
	}
	
	

}