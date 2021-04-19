package br.edu.infnet.appatpb.model.negocio;

public class TipoItem {
    String itemFrigobar;
    double valor;

    public TipoItem(String itemFrigobar, double valor) {
        this.itemFrigobar = itemFrigobar;
        this.valor = valor;
    }

    public TipoItem() {
    }

    @Override
    public String toString() {
        return  " item: " + itemFrigobar + ", valor= " + valor;
    }
}
