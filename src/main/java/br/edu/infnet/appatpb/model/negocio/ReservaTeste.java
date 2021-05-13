package br.edu.infnet.appatpb.model.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservaTeste {
    public static void main(String[] args) {


        // Novo Cliente cadastrado
        Cliente clienteUm = new Cliente("Pedro",  "Rua São José",  1083123,  20,  9993394);
        System.out.println(clienteUm + "\n");

        // Itens pedido na hora da reserva do hotel
   

        // Servicos do cliente
        List<Servico> listaServicos = new ArrayList<Servico>();
        Acomodacao acomodacaoClienteUm = new Acomodacao("Acomodacao",202,"Solteiro", 200 , "Coca-cola, água", 2);
        listaServicos.add(acomodacaoClienteUm);

        // Inicia reserva do cliente
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date dataOperacao = new Date();
        String dataFormatada = sdf.format(dataOperacao);

        try {
            dataOperacao = sdf.parse(dataFormatada);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Reserva reservaClienteUm = new Reserva(clienteUm, dataOperacao, listaServicos);

        System.out.println(reservaClienteUm);

    }

}
