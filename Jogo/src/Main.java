public class Main {

    public static void main(String[] args) {
        
        Jogador jogador = new Jogador("Valeska");
        jogador.receberDano(10);
        System.out.println(jogador.getNome());
        System.out.println(jogador.getHp());
    }
    
}
