public class Personagem {
    
    private int posX; 
    private int posY;
    private String desenho;

    Personagem (int posX, int posY, String desenho){
        this.posX=posX;
        this.posY=posY;
        this.desenho= desenho;
    }

    public String getDesenho() {
        return desenho;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

       
}


