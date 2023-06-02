package br.senac.sp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.senac.sp.estado.Estado;
import br.senac.sp.estado.EstadoCreditoInsuficiente;
import br.senac.sp.estado.EstadoCreditoSuficiente;
import br.senac.sp.estado.EstadoInicial;
import br.senac.sp.model.Maquina;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void deveZerarOSaldoAoCancelar()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00);
        maquina.cancelar();
        double saldo = maquina.getSaldo();
        assertTrue(saldo == 0);
    }

    @Test
    public void deveZerarOSaldoAoSolicitarCafe()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(3.00);
        double saldo = maquina.getSaldo();
        assertTrue(saldo == 0);
    }
    

    @Test
    public void deveRetornarCreditoInsuficiente()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00);
        Estado estado = maquina.getEstado();
        assertTrue(estado == new EstadoCreditoInsuficiente(maquina));
    }

    @Test
    public void deveRetornarCreditoSuficiente()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(3.00);
        Estado estado = maquina.getEstado();
        assertTrue(estado == new EstadoCreditoSuficiente(maquina));
    }

    @Test
    public void deveRetornarInicial()
    {
        Maquina maquina = new Maquina();
        Estado estado = maquina.getEstado();
        assertTrue(estado == new EstadoInicial(maquina));
    }

    @Test
    public void deveRetornarInicialAoCancelar()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00);
        maquina.cancelar();
        Estado estado = maquina.getEstado();
        assertTrue(estado == new EstadoInicial(maquina));
    }
    
}


