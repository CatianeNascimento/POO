import java.math.BigDecimal;

public class Engenheiro extends Funcionario {
    private String departamento;
    private String crea;

    public Engenheiro() {

    }

    public Engenheiro(String nome, int codigo, BigDecimal salario, String departamento, String crea) {
        super(nome, codigo, salario);
        this.departamento = departamento;
        this.crea = crea;

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro: " + super.toString() + " Departamento: " + departamento + " CREA: " + crea + " Salário: "
                + super.salario;
    }


    public BigDecimal calculaSalario() {
        return super.salario.multiply(new BigDecimal("1.5"));
    }

    }

 
