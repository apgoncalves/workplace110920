
public class Questao {
	private String enunciado;
	private String resposta;
	
	public Questao(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String apresentaQuestao() {
		return enunciado;
	}
	
	public boolean corrigeQuestao(String resposta) {
		if(this.resposta.equals(resposta)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
}
