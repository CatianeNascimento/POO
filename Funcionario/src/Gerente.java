import java.math.BigDecimal;

public class Gerente extends Funcionario {
    private String area;
    private BigDecimal bonus;

    public Gerente() {
    }

    public Gerente(String nome, int codigo, BigDecimal salario, String area, BigDecimal bonus) {
        super(nome, codigo, salario);
        this.area = area;
        this.bonus = bonus;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente: " + super.toString() + " Área: " + area + " Salário: " + super.salario;
    }

    
    public BigDecimal calculaSalario() {
        return salario.add(bonus);
    }
}