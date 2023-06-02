import java.math.BigDecimal;

public class Teste {

public static void main(String[] args) throws Exception {
    Engenheiro engenheiro1 = new Engenheiro("Maurício", 22, 10.000, "Tecnologia", "Acv234");
    System.out.println(engenheiro1.toString());
    System.out.println("Adicional de: " + engenheiro1.ganha());

    Gerente gerente1 = new Gerente("Jose", 2, salario.;
    System.out.println(gerente1.toString());
    System.out.println("Salário com bônus: " + gerente1.calculaSalario();

    Presidente presidente = new Presidente("Alfredo", 10, 25000, 3000);
    System.out.println(presidente.toString());
    System.out.println(presidente.ganha());

    FolhaPagamento folhaPagamento = new FolhaPagamento();
    folhaPagamento.registrar(engenheiro1);
}

}

