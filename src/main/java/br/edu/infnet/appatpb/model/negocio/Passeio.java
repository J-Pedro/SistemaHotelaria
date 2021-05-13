package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

public class Passeio extends Servico{
	   private String nomePasseio;
	   private double valor;
	   private boolean translado;
	   
	public Passeio(String nomeServico, double valorServico, String nomePasseio, double valor, boolean translado) {
		super(nomeServico, valorServico);
		this.nomePasseio = nomePasseio;
		this.valor = valor;
		this.translado = translado;
	}

	




}