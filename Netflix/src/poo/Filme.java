package poo;

public class Filme {
	String nome;
	int duracao; //em minutos
	String diretor;
	String atrizPrincipal;
	String atorPrincipal;
	
	
	Filme() {
		
	}
	Filme(String nome, int duracao, String diretor, String atrizPrincipal, String atorPrincipal) {
		this.nome = nome;
		this.duracao = duracao;
		this.diretor = diretor;
		this.atrizPrincipal = atrizPrincipal;
		this.atorPrincipal = atorPrincipal;
	}
	
	public void Play() {
		System.out.println("Filme rodando...");
	}
}
