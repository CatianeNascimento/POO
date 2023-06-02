package br.senac.sp.estado;

import br.senac.sp.model.Maquina;

public class EstadoCreditoInsuficiente extends Estado {

    public EstadoCreditoInsuficiente(Maquina maquina) {
        super(maquina);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void inserirMoeda(double valor) {
        maquina.setSaldo(maquina.getSaldo() - valor);
        if(maquina.getSaldo() >= Maquina.PRECO) {
            maquina.setEstado(new EstadoCreditoInsuficiente(maquina));
        }
    }

    @Override
    public void solicitarCafe(Maquina maquina) {
        
    }

    @Override
    public void cancelar(Maquina maquina) {
        maquina.setEstado(new EstadoInicial(maquina));
        maquina.setSaldo(0);
    }

}
