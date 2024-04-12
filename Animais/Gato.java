public class Gato extends Animal{
    private String pelagem;
    private boolean cacando;

    public void setPelagem(String pelagem){
        this.pelagem = pelagem;
    }

    public void setCacando(boolean cacando){
        this.cacando = cacando;
    }

    public String getPelagem(){
        return this.pelagem;
    }

    public boolean getCacando(){
        return  this.cacando;
    }

    public void mudarCacando(boolean cacando){
        if(cacando == true){
            cacando = false;
        } else {
            cacando = true;
        }
    }
}
