package br.edu.infnet.appatpb.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "tservico")
@Inheritance(strategy = InheritanceType.JOINED)
public class Servico {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String nomeServico;
   private double valorServico;
   private double desconto;
    
    
    public Servico(String nomeServico, double valorServico, double desconto) {
	super();
	this.nomeServico = nomeServico;
	this.valorServico = valorServico;
	this.desconto = desconto;
	}
    
    

	public Servico() {
		super();
	}


	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}


	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}




	@Override
    public String toString() {
        return  "nome= " + nomeServico + ", valor= " + valorServico + "\n";
    }
}