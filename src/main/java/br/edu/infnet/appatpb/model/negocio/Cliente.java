package br.edu.infnet.appatpb.model.negocio;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private int cpf;
    private int idade;
    private int numeroTelefone;

    public Cliente() {
        id++;
    }

    public Cliente(String nome, String endereco, int cpf, int idade, int numeroTelefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
        this.numeroTelefone = numeroTelefone;
        id++;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}