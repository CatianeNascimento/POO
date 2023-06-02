package br.senac.sp.model;

import br.senac.sp.estado.Estado;

public class Maquina {

    private Estado estado;
    private double saldo;
    public static final double PRECO = 3.00;

    public Maquina() {
    }

    public Maquina(Estado estado, double saldo) {
        this.estado = estado;
        this.saldo = saldo;
    }

    public void inserirMoeda(double valor) {
        estado.inserirMoeda(valor);
    }

    public void solicitarCafe() {
        estado.solicitarCafe(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public Estado getEstado() {
        return this.estado;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
