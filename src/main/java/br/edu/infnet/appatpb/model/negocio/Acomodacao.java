package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

public class Acomodacao extends Servico{
   private String tipoQuarto;
   private double valorQuarto;
   private String nomeProduto;
   private double valorProduto;



   
    public Acomodacao(String nomeServico, double valorServico, String tipoQuarto, double valorQuarto, String nomeProduto,
		double valorProduto) {
	super(nomeServico, valorServico);
	this.tipoQuarto = tipoQuarto;
	this.valorQuarto = valorQuarto;
	this.nomeProduto = nomeProduto;
	this.valorProduto = valorProduto;
}


	@Override
    public String toString() {
        return super.toString() + " Quarto= " + tipoQuarto +" | valor: "+ valorQuarto + "\nProdutos: " +  nomeProduto + " | Valor: " + valorProduto;
    }
}
