public abstract class Elemento {
    protected int posX;
    protected int posY;

    public Elemento(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public abstract void moverDireita();
    public abstract void moverEsquerda();
    public abstract void moverCima();
    public abstract void moverBaixo();
}
