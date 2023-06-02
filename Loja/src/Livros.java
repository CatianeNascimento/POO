public class Livros extends Loja {

    private String autor;

    public Livros(String nomeProduto, double preco, String autor) {
        super(nomeProduto, preco);
        this.autor = autor;
    }

    public Livros() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void mostrarDados() {
        System.out.println(super.getNomeProduto());
        System.out.println(super.getPreco());
        System.out.println(getAutor());
    }
    
    
    
}
