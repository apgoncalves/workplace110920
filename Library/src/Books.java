
public class Books {
	private String titulo;
	private String autor;
	private int anoPub;
	private String categoria;
	private int posicao;
	private boolean disponivel;
	
	
	public Books(String titulo, String autor, int anoPub, String categoria, int posicao, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPub = anoPub;
		this.categoria = categoria;
		this.posicao = posicao;
		this.disponivel = disponivel;
		
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getAnoPub() {
		return anoPub;
	}


	public void setAnoPub(int anoPub) {
		this.anoPub = anoPub;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public int getPosicao() {
		return posicao;
	}


	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public void imprimir() {
		System.out.println("Título   : " + titulo);
		System.out.println("Autor  : " + autor);
		System.out.println("Ano : " + anoPub);
		System.out.println("Categoria : " + categoria);
		System.out.println("Prateleira : " + posicao);
		if(disponivel) {
			System.out.println("Emprestado : SIM");
		}
		else {
			System.out.println("Emprestado : NÃO");
		}
		
	}
	
	public void emprestar() {
		this.disponivel = true;
	}
	
	public void devolver() {
		this.disponivel = false;
	}
	
	
	
}
