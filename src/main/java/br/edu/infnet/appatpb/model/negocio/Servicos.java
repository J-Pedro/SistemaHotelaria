package br.edu.infnet.appatpb.model.negocio;

public abstract class Servicos {

    int id;
    String nomeServico;
    double valorServico;

    public void cobrarAdicional(){

    }

    public Servicos(String nomeServico, double valorServico) {
        this.nomeServico = nomeServico;
        this.valorServico = valorServico;
        id++;
    }

    @Override
    public String toString() {
        return  "nome= " + nomeServico + ", valor= " + valorServico + "\n";
    }
}