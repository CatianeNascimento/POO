import java.math.BigDecimal;

public final class Presidente extends Funcionario {
    private BigDecimal acoes;

    public Presidente(String nome, int codigo, BigDecimal salario, BigDecimal acoes) {
        super(nome, codigo, salario);
        this.acoes = acoes;
    }

    public BigDecimal getAcoes() {
        return acoes;
    }

    public void setAcoes(BigDecimal acoes) {
        this.acoes = acoes;
    }

    @Override
    public String toString() {
        return "Presidente: " + super.toString() + "Salário: " + super.salario + "Valor das ações: " + acoes;
    }

    @Override
    public BigDecimal calculaSalario() {
        return salario.add(acoes);
    }

  
}

