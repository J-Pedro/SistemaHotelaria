package br.edu.infnet.appatpb.model.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "treserva")
public class Reserva {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idCliente")
    private Cliente cliente;
	@Transient
    private List<Servico> servico;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataReserva;
    private boolean gratuidade;
    private int localHotel;
  
	
	public Reserva() {
		
	}
    
	public Reserva(Cliente cliente, List<Servico> servico, Date dataReserva, boolean gratuidade, int localHotel) {
		super();
		this.cliente = cliente;
		this.servico = servico;
		this.dataReserva = dataReserva;
		this.gratuidade = gratuidade;
		this.localHotel = localHotel;
	}

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

    public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public boolean isGratuidade() {
		return gratuidade;
	}

	public void setGratuidade(boolean gratuidade) {
		this.gratuidade = gratuidade;
	}

	public int getLocalHotel() {
		return localHotel;
	}

	public void setLocalHotel(int localHotel) {
		this.localHotel = localHotel;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
    public String toString() {
        return "  Reserva\nCliente= " + cliente.getNome() +", data= " + dataReserva + " \n\n    servico\n" + servico;
    }
}