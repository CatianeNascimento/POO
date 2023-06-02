package br.senac.sp.estado;

import br.senac.sp.model.Maquina;

public abstract class Estado {

    protected Maquina maquina;

    public Estado(Maquina maquina) {
        this.maquina = maquina;
    }

    public void inserirMoeda(double valor) {
    throw new RuntimeException("Não pode mudar para a situação pago");

    }
    public void solicitarCafe(Maquina maquina) {
        throw new RuntimeException("Não pode mudar para a situação pago");

    }

    public void cancelar(Maquina maquina) {
        throw new RuntimeException("Não pode mudar para a situação pago");

    }


        
    }
   

