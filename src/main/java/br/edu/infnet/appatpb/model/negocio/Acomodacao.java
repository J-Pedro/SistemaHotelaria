package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

public class Acomodacao extends Servicos{
    String tipoQuarto;
    ArrayList<TipoItem> itensFrigobar;


    public Acomodacao(String nomeServico, double valorServico, String tipoQuarto, ArrayList<TipoItem> itensFrigobar) {
        super(nomeServico, valorServico);
        this.tipoQuarto = tipoQuarto;
        this.itensFrigobar = itensFrigobar;
    }

    public void cobrarAdicional(){

    }

    @Override
    public String toString() {
        return super.toString() + "   Quarto= " + tipoQuarto + ", itens= " + itensFrigobar ;
    }
}
