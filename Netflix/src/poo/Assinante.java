package poo;

public class Assinante {
	String nomeCompleto;
	String cpf;
	String email;
	String senha;
	String metodoPagamento;
	int plano;
	double valor;
	String dataAssinatura;
	
	Assinante() {
		
	}
	Assinante(String nomeCompleto, String cpf, String email, String senha, String metodoPagamento, int plano, double valor, String dataAssinatura ) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.metodoPagamento = metodoPagamento;
		this.plano = plano;
		this.valor = valor;
		this.dataAssinatura = dataAssinatura;
	}
	
	public void Assinatura() {
		System.out.println("Assinatura realizada!");
	}
}
