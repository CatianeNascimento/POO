import java.math.BigDecimal;

public class Frete {
    private String nomeDoCliente;
    private BigDecimal valorDoProduto;
    private double peso;
    private int distancia;

    public Frete(String nomeDoCliente, BigDecimal valorDoProduto, double peso, int distancia) {
        this.nomeDoCliente = nomeDoCliente;
        this.valorDoProduto = valorDoProduto;
        this.peso = peso;
        this.distancia = distancia;
    }

    public static FreteBuider buider(){
        return new FreteBuider();
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public BigDecimal getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(BigDecimal valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Frete [nomeDoCliente=" + nomeDoCliente + ", valorDoProduto=" + valorDoProduto + ", peso=" + peso
                + ", distancia=" + distancia + "]";
    }

    

    
}