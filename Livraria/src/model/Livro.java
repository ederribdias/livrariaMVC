package model;

public class Livro extends Produto{
	private String autor;
	private String editora;
	private String edicao;
	
	
	public Livro() {
		this(0,"", "", 0, 0.0, 0.0, "", "", "", "");
	}

	public Livro(int codigo, String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda, String origem,
			     String autor, String editora, String edicao) {
		super(codigo, descricao, genero, estoqueDisponivel, precoCusto,	precoVenda, origem);
		
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	
	public String apresentarDetalhes(){
		
		return "Produto: " + this.getDescricao() + 
			   "\n - Autor: " + this.getAutor() + 
			   "\n - Editora: " + this.getEditora() + 
			   "\n - Edição: " + this.getEdicao();
	}

	
	public void calcularPrecoVenda(boolean didatico){
		
		if(didatico){
			this.setPrecoVenda( this.getPrecoCusto() + (this.getPrecoCusto() * 0.1) );
		}
		
	}
}
