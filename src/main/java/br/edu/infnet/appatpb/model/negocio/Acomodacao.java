package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

public class Acomodacao extends Servico{
   private String tipoQuarto;
   private double valorQuarto;
   private String nomeProduto;
   private double valorProduto;



   
	public Acomodacao(String nomeServico, double valorServico, double desconto, String tipoQuarto, double valorQuarto,
		String nomeProduto, double valorProduto) {
	super(nomeServico, valorServico, desconto);
	this.tipoQuarto = tipoQuarto;
	this.valorQuarto = valorQuarto;
	this.nomeProduto = nomeProduto;
	this.valorProduto = valorProduto;
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



	public String getNomeProduto() {
		return nomeProduto;
	}



	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}



	public double getValorProduto() {
		return valorProduto;
	}



	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}



	@Override
    public String toString() {
        return super.toString() + " Quarto= " + tipoQuarto +" | valor: "+ valorQuarto + "\nProdutos: " +  nomeProduto + " | Valor: " + valorProduto;
    }
}
