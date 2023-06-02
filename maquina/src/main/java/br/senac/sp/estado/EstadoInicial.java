package br.senac.sp.estado;

import br.senac.sp.model.Maquina;

public class EstadoInicial extends Estado{

    public EstadoInicial(Maquina maquina) {
        super(maquina);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void inserirMoeda(double valor) {
        maquina.setSaldo(maquina.getSaldo() + valor);
        if(maquina.getSaldo() >= Maquina.PRECO) {
            maquina.setEstado(new EstadoCreditoSuficiente(maquina));
        } else {
            maquina.setEstado(new EstadoCreditoInsuficiente(maquina));
        }
    }

    @Override
    public void solicitarCafe(Maquina maquina) {
        // TODO Auto-generated method stub
    }

    @Override
    public void cancelar(Maquina maquina) {
        // TODO Auto-generated method stub
    }
    
}
