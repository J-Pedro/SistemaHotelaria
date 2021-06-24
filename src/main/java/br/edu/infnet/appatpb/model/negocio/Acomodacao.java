package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tacomodacao")
@PrimaryKeyJoinColumn(name= "idServico")
public class Acomodacao extends Servico{
   private String tipoQuarto;
   private double valorQuarto;
   private boolean kitHigiene;
   
	public Acomodacao(String nomeServico, double valorServico, double desconto) {
	super(nomeServico, valorServico, desconto);
}
	
	public Acomodacao() {
	
}
	
	

	public Acomodacao(String nomeServico, double valorServico, double desconto, String tipoQuarto, double valorQuarto,
		String nomeProduto, double valorProduto) {
	super(nomeServico, valorServico, desconto);
	this.tipoQuarto = tipoQuarto;
	this.valorQuarto = valorQuarto;
}
	
	

	

	public String getTipoQuarto() {
		return tipoQuarto;
	}



	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}



	public double getValorQuarto() {
		return valorQuarto;
	}



	public void setValorQuarto(double valorQuarto) {
		this.valorQuarto = valorQuarto;
	}


	

	public boolean isKitHigiene() {
		return kitHigiene;
	}

	public void setKitHigiene(boolean kitHigiene) {
		this.kitHigiene = kitHigiene;
	}

	@Override
    public String toString() {
        return super.toString() + " Quarto= " + tipoQuarto +" | valor: "+ valorQuarto + "\nProdutos: " ;
    }
}
