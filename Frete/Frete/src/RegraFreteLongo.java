import java.math.BigDecimal;

public class RegraFreteLongo extends RegraFrete{

    @Override
    public BigDecimal calcular(Frete frete) {

       return frete.getValorDoProduto().multiply(new BigDecimal(0.3));
    }

}
