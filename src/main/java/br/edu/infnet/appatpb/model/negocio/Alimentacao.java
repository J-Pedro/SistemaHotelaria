package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

public class Alimentacao extends Servicos{
    public Alimentacao(String nomeServico, double valorServico, ArrayList<tipoAlimentacao> alimentacoes) {
        super(nomeServico, valorServico);
        this.alimentacoes = alimentacoes;
    }

    ArrayList<tipoAlimentacao> alimentacoes;
}