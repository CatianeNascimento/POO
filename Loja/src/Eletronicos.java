public class Eletronicos extends Loja {

    private String marca;
    private String modelo;
    
    public Eletronicos(String nomeProduto, double preco, String marca, String modelo) {
        super(nomeProduto, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public Eletronicos() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void mostrarDados() {
        System.out.println(getMarca());
        System.out.println(getModelo());
    }

    
}
