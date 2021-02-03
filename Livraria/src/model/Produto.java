package model;

public class Produto {
	private int codigo;
	private String descricao;
	private String genero;
	private int estoqueDisponivel;
	private double precoCusto;
	private double precoVenda;
	private String origem;
	
	public Produto() {
		this(0,"", "", 0, 0.0, 0.0, "");
	}

	public Produto(int codigo, String descricao, String genero,	int estoqueDisponivel, double precoCusto, double precoVenda, String origem) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.genero = genero;
		this.estoqueDisponivel = estoqueDisponivel;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.origem = origem;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public void setEstoqueDisponivel(int estoqueDisponivel) {
		this.estoqueDisponivel = estoqueDisponivel;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	
	// Funcionalidades
	
	public String estoqueAtual(){	
		double total = this.getEstoqueDisponivel() * this.getPrecoVenda();
		return "Produto: " + this.getDescricao() + "\nEstoque: " + this.getEstoqueDisponivel() + "\nTotal: " + total;
	}
	
	
	public void calcularPrecoVenda(){
		
		this.setPrecoVenda( this.getPrecoCusto() + (this.getPrecoCusto() * 0.2) );
	}
	
	
	public void calcularPrecoVenda(double cotacao){
		
		if(!this.getOrigem().equals("Brasil")){
			this.setPrecoVenda( this.getPrecoCusto() * cotacao);	
		}
		
	}
}
