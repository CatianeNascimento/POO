public class Jogador {

    private String nome;
    private int xp = 0;
    private int hp = 100;
    private boolean envenenado = false;

    public Jogador() {

    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    public void receberDano(int pontos) {
        this.hp -= pontos;
    }

    public void receberCura(int pontos) {
        this.hp += pontos;
    }

    public void ganharExperiencia(int pontos) {
        this.xp += pontos;
    }

    public void recerAntidoto() {
        envenenado =! envenenado;
    }

}
