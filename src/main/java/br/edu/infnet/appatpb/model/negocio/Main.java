package br.edu.infnet.appatpb.model.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Lista de itens mocado, irá ter no banco já essa lista
        ArrayList<TipoItem> arrayItens = new ArrayList<TipoItem>();
        TipoItem itemUm = new TipoItem("Coca Cola", 4);
        TipoItem itemDois = new TipoItem("Guarana", 4);
        TipoItem itemTres = new TipoItem("Agua", 2);
        arrayItens.add(itemUm);
        arrayItens.add(itemDois);
        arrayItens.add(itemTres);

        // Novo Cliente cadastrado
        Cliente clienteUm = new Cliente("Pedro",  "Rua São José",  1083123,  20,  9993394);
        System.out.println(clienteUm + "\n");

        // Itens pedido na hora da reserva do hotel
        ArrayList<TipoItem> arrayItensPedidos = new ArrayList<TipoItem>();
        arrayItensPedidos.add(arrayItens.get(0)); //Adiciona a coca cola
        arrayItensPedidos.add(arrayItens.get(2)); //Adiciona agua

        // Servicos do cliente
        ArrayList<Servicos> arrayServicos = new ArrayList<Servicos>();
        Acomodacao acomodacaoClienteUm = new Acomodacao("Acomodacao",606,"Solteiro", arrayItensPedidos);
        arrayServicos.add(acomodacaoClienteUm);

        // Inicia reserva do cliente
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date dataOperacao = new Date();
        String dataFormatada = sdf.format(dataOperacao);

        try {
            dataOperacao = sdf.parse(dataFormatada);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Reserva reservaClienteUm = new Reserva(clienteUm.getNome(), dataOperacao, arrayServicos);

        System.out.println(reservaClienteUm);

    }

}
