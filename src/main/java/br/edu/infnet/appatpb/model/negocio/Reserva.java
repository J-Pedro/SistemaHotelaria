package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    int id;
    private Cliente cliente;
    private String nomeCliente;
    private Date dataReserva;
    private ArrayList<Servicos> servico;

    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Servicos> getServico() {
		return servico;
	}

	public void setServico(ArrayList<Servicos> servico) {
		this.servico = servico;
	}

	public Reserva(String nomeCliente, Date dataReserva, ArrayList<Servicos> servico) {
        this.nomeCliente = nomeCliente;
        this.dataReserva = dataReserva;
        this.servico = servico;
        id++;
    }
	
	

    public static void cancelarReserva(){
    }

    @Override
    public String toString() {
        return "    Reserva\nCliente= " + nomeCliente +", data= " + dataReserva + " \n\n    servico\n" + servico;
    }
}