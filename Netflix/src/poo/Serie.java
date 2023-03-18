package poo;

public class Serie {
	String nome;
	int temporadas;
	int episodios;
	int duracaoEpisodio;
	String diretor;
	String atrizPrincipal;
	String atorPrincipal;
	
	Serie() {
		
	}
	Serie(String nome, int temporadas, int episodios, int duracaoEpisodio, String diretor, String atrizPrincipal, String atorPrincipal) {
		this.nome = nome;
		this.temporadas = temporadas;
		this.episodios = episodios;
		this.duracaoEpisodio = duracaoEpisodio;
		this.diretor = diretor;
		this.atrizPrincipal = atrizPrincipal;
		this.atorPrincipal = atorPrincipal;
	}
	
	public void Play() {
		System.out.println("Série rodando...");
	}
}
