package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

public class Passeio extends Servico{
	   private String nomePasseio;
	   private double valor;
	   private boolean translado;
	   
	   
	  
	public Passeio(String nomeServico, double valorServico, double desconto, String nomePasseio, double valor,
			boolean translado) {
		super(nomeServico, valorServico, desconto);
		this.nomePasseio = nomePasseio;
		this.valor = valor;
		this.translado = translado;
	}

	public String getNomePasseio() {
		return nomePasseio;
	}

	public void setNomePasseio(String nomePasseio) {
		this.nomePasseio = nomePasseio;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isTranslado() {
		return translado;
	}

	public void setTranslado(boolean translado) {
		this.translado = translado;
	}
	
}