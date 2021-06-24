package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "tpasseio")
@PrimaryKeyJoinColumn(name= "idServico")
public class Passeio extends Servico{
	   private String nomePasseio;
	   private double valorPasseio;
	   private boolean translado;
	   
	   
	  
	public Passeio() {
		
	}

	public Passeio(String nomeServico, double valorServico, double desconto, String nomePasseio, double valorPasseio,
			boolean translado) {
		super(nomeServico, valorServico, desconto);
		this.nomePasseio = nomePasseio;
		this.valorPasseio = valorPasseio;
		this.translado = translado;
	}

	public String getNomePasseio() {
		return nomePasseio;
	}

	public void setNomePasseio(String nomePasseio) {
		this.nomePasseio = nomePasseio;
	}

	public double getValorPasseio() {
		return valorPasseio;
	}

	public void setValorPasseio(double valorPasseio) {
		this.valorPasseio = valorPasseio;
	}

	public boolean isTranslado() {
		return translado;
	}

	public void setTranslado(boolean translado) {
		this.translado = translado;
	}
	
}