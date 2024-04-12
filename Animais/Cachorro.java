public class Cachorro extends Animal{
    
    private String raca;
    private String porte;

    public void buscarOsso(){
        System.out.println("Ele está procurando o osso...");
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public void setPorte(String porte){
        this.porte = porte;
    }

    public String getRaca(){
        return this.raca;
    }

    public String getPorte(){
        return this.porte;
    }
}
