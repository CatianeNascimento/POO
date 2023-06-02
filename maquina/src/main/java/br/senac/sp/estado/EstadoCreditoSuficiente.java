package br.senac.sp.estado;

import br.senac.sp.model.Maquina;

public class EstadoCreditoSuficiente extends Estado {

    public EstadoCreditoSuficiente(Maquina maquina) {
        super(maquina);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void inserirMoeda(double valor) {
        maquina.setSaldo(maquina.getSaldo() + valor);
    }

    @Override
    public void solicitarCafe(Maquina maquina) {
        maquina.setEstado(new EstadoInicial(maquina));
        maquina.setSaldo(maquina.getSaldo() - Maquina.PRECO);
    }

    @Override
    public void cancelar(Maquina maquina) {
        maquina.setEstado(new EstadoInicial(maquina));
        maquina.setSaldo(0);
    }

}
