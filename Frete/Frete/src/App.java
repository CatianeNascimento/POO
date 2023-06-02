import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {

        var frete = Frete.buider()
        .nomeDoCliente("João")
        .valorDoProduto(new BigDecimal(100))
        .build();

        System.out.println(frete);

    }
}
