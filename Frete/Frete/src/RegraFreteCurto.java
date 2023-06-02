import java.math.BigDecimal;

public class RegraFreteCurto extends RegraFrete {

    @Override
    public BigDecimal calcular(Frete frete) {
        if(frete.getDistancia() < 100)
       return frete.getValorDoProduto().multiply(new BigDecimal(0.1));

       return proximo.calcular(frete);
    }
    
}
