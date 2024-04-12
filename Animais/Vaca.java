public class Vaca extends Animal{
    
    private String dieta;
    private String manchas;

    public void setDieta(String dieta){
        this.dieta = dieta;
    }

    public void setManchas(String manchas){
        this.manchas = manchas;
    }

    public String getManchas(){
        return this.dieta;
    }

    public String getDieta(){
        return this.dieta;
    }

    public void pastar(){
        System.out.println("A vaca está pastando!");
    }

    public void produzirLeite(){
        System.out.println("A vaca está produzindo leite!");
    }
}
