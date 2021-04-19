package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;

public class Passeio extends Servicos{
    public Passeio(String nomeServico, double valorServico, ArrayList<TipoPasseios> passeios) {
        super(nomeServico, valorServico);
        this.passeios = passeios;
    }

    ArrayList<TipoPasseios> passeios;

}