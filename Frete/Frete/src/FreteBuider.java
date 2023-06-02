import java.math.BigDecimal;

public class FreteBuider {
    
    private String nomeDoCliente;
    private BigDecimal valorDoProduto;
    private double peso;
    private int distancia;

    public FreteBuider nomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
        return this;
    }
    
    public FreteBuider valorDoProduto(BigDecimal valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
        return this;
    }

    public FreteBuider peso(double peso) {
        this.peso =peso;
        return this;
    }

    public FreteBuider distancia(int distancia) {
        this.distancia = distancia;
        return this;
    }

    public Frete build() {
        return new Frete(nomeDoCliente, valorDoProduto, peso, distancia);
    }
}

