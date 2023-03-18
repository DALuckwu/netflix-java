package poo;

public class Usuario {
	String nome;
	boolean ehInfantil;
	String minhaLista;
	
	Usuario() {
		
	}
	Usuario(String nome, boolean ehInfantil, String minhaLista) {
		this.nome = nome;
		this.ehInfantil = ehInfantil;
		this.minhaLista = minhaLista;
	}
	
	public void Conectado() {
		System.out.println("Usuário está conectado...");
	}
	
	public void Assistindo() {
		System.out.println("Usuário está assistindo...");
	}
}
