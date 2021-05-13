package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
    int id;
    private Cliente cliente;
    private Date dataReserva;
    private List<Servico> servico;

    
    

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}

	public Reserva(Cliente cliente, Date dataReserva, List<Servico> servico) {
		this.cliente = cliente;
        this.dataReserva = dataReserva;
        this.servico = servico;
        id++;
    }
	
	

    public static void cancelarReserva(){
    }

    @Override
    public String toString() {
        return "  Reserva\nCliente= " + cliente.getNome() +", data= " + dataReserva + " \n\n    servico\n" + servico;
    }
}