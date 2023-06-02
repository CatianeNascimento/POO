package br.edu.senacsp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.edu.senacsp.model.Pedido;
import br.edu.senacsp.model.Situacao;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void naoDeveDarDescontoParaPedidosBaratos() {
        Pedido pedido = new Pedido(5, Situacao.ABERTO);
        double desconto = pedido.desconto();
        assertTrue(desconto == 0);

    }

    @Test
    public void deveRetornar15() {
        Pedido pedido = new Pedido(1001, Situacao.ABERTO);
        double desconto = pedido.desconto();
        assertTrue(desconto == 0.15);

    }
    @Test
    public void deveRetornar10() {
        Pedido pedido = new Pedido(502, Situacao.ABERTO);
        double desconto = pedido.desconto();
        assertTrue(desconto == 0.1);

    }
    @Test
    public void deveRetornar5() {
        Pedido pedido = new Pedido(101, Situacao.ABERTO);
        double desconto = pedido.desconto();
        assertTrue(desconto == 0.05);

    }
}
