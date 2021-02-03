package model;

public class Dvd extends Produto {
	
	private String diretor;
	
	public Dvd() {
		this(0,"", "", 0, 0.0, 0.0, "", "");
	}

	public Dvd(int codigo, String descricao, String genero,	int estoqueDisponivel, double precoCusto, double precoVenda, String origem,
			String diretor) {
		super(codigo, descricao, genero, estoqueDisponivel, precoCusto,	precoVenda, origem);

		this.diretor = diretor;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String apresentarDetalhes(){
		
		return "Produto: " + this.getDescricao() + 
			   "\n - Diretor: " + this.getDiretor();
	}
}
