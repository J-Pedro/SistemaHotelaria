package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

public class Alimentacao extends Servico{
    private String tipoAlimentacao;
    private double valorAlimentacao;
    private boolean bebidaAlcoolica;
    


	public Alimentacao(String nomeServico, double valorServico, double desconto, String tipoAlimentacao,
			double valorAlimentacao, boolean bebidaAlcoolica) {
		super(nomeServico, valorServico, desconto);
		this.tipoAlimentacao = tipoAlimentacao;
		this.valorAlimentacao = valorAlimentacao;
		this.bebidaAlcoolica = bebidaAlcoolica;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public double getValorAlimentacao() {
		return valorAlimentacao;
	}

	public void setValorAlimentacao(double valorAlimentacao) {
		this.valorAlimentacao = valorAlimentacao;
	}

	public boolean isBebidaAlcoolica() {
		return bebidaAlcoolica;
	}

	public void setBebidaAlcoolica(boolean bebidaAlcoolica) {
		this.bebidaAlcoolica = bebidaAlcoolica;
	}
	
	
	
}