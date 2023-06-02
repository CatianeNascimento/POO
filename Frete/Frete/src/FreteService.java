import java.math.BigDecimal;

public class FreteService {

    public BigDecimal calcularValor(Frete frete) {
        // ate 100km (Frete = 10% do valor)
        // até 500km (Frete = 20% do valor)
        // mais de 500km (Frete = 30% do valor)

        return new RegraFreteCurto()
        .depois (new RegraFreteMedio())
        .depois (new RegraFreteLongo())
        .calcular(frete);
    }
    
}
