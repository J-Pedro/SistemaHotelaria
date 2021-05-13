package br.edu.infnet.appatpb.model.negocio;

public abstract class Servico {

   private int id;
   private String nomeServico;
   private double valorServico;
   private double desconto;
    

 
    
    
    public Servico(String nomeServico, double valorServico, double desconto) {
	super();
	this.nomeServico = nomeServico;
	this.valorServico = valorServico;
	this.desconto = desconto;
	id++;
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