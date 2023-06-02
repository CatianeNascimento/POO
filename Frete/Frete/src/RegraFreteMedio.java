import java.math.BigDecimal;

public class RegraFreteMedio extends RegraFrete {

    @Override
    public BigDecimal calcular(Frete frete) {
        if(frete.getDistancia() < 500)
       return frete.getValorDoProduto().multiply(new BigDecimal(0.2));

       return proximo.calcular(frete);
    }

}
