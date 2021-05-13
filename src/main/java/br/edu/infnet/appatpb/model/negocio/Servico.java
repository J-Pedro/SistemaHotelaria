package br.edu.infnet.appatpb.model.negocio;

public abstract class Servico {

    int id;
    String nomeServico;
    double valorServico;

    public void cobrarAdicional(){

    }

    public Servico(String nomeServico, double valorServico) {
        this.nomeServico = nomeServico;
        this.valorServico = valorServico;
        id++;
    }

    @Override
    public String toString() {
        return  "nome= " + nomeServico + ", valor= " + valorServico + "\n";
    }
}