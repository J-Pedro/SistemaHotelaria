package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

public class Alimentacao extends Servico{
    private String tipoAlimentacao;
    private double valorAlimentacao;
    private boolean bebidaAlcoolica;
    
    
    
	public Alimentacao(String nomeServico, double valorServico, String tipoAlimentacao, double valorAlimento, boolean bebidaAlcoolica) {
		super(nomeServico, valorServico);
		this.tipoAlimentacao = tipoAlimentacao;
		this.valorAlimentacao = valorAlimento;
		this.bebidaAlcoolica = bebidaAlcoolica;
	}
	
	
}