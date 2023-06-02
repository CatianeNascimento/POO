import java.math.BigDecimal;

public abstract class Funcionario {
    protected String nome;
    protected int codigo;
    protected BigDecimal salario;

    public Funcionario() {

    }

    public Funcionario(String nome, int codigo, BigDecimal salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }


    public BigDecimal calculaSalario() {
        return salario;
    }
}