public class Jogador extends Elemento {

    private String representacao;

    public Jogador(int X, int Y, String representacao) {
        super(X, Y);
        this.representacao = representacao;
    }

    @Override
    public void moverDireita() {
        this.posX++;
    }

    @Override
    public void moverEsquerda() {
        this.posX--;
    }

    @Override
    public void moverCima() {
        this.posY--;
    }

    @Override
    public void moverBaixo() {
        this.posY++;
    }

    public String getRepresentacao() {
        return representacao;
    }
}
