public class Loja {

    private String nomeProduto;
    private double preco;

    public Loja(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public Loja() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println(getNomeProduto());
        System.out.println(getPreco());
    }

    

}
