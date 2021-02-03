package model;

public class Cd extends Produto{

	private String artista;
	private String gravadora;
	
	public Cd() {
		this(0,"", "", 0, 0.0, 0.0, "", "", "");
	}

	public Cd(int codigo, String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda,	String origem,
			  String artista, String gravadora) {
		super(codigo, descricao, genero, estoqueDisponivel, precoCusto,	precoVenda, origem);

		this.artista = artista;
		this.gravadora = gravadora;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public String apresentarDetalhes(){
		
		return "Produto: " + this.getDescricao() + 
			   "\n - Artista: " + this.getArtista() + 
			   "\n - Gravadora: " + this.getGravadora();
	}

}
