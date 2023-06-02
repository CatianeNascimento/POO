package br.edu.senacsp.model;

public class Pedido {
    
    private double valor;
    private Situacao situacao;


    public Pedido(double valor, Situacao situacao) {
        this.valor = valor;
        this.situacao = situacao;
    }

    public double desconto() {
        if(valor > 1000) {
            return 0.15;
        }
        if(valor > 500) {
            return 0.1;
            
        }
        if (valor > 100) {
            return 0.5;
        }

        return 0;
    }
    
}
