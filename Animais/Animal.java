public class Animal {
    
    private String nome;
    private String sexo;
    private int idade;

    public void envelhecer(){
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String toString(){
        return "Cachorro - [Nome =" + this.getNome() +"] - [Sexo = " + this.getSexo() + "] - [Idade =" + this.getIdade() + "]";
    }

    public void emitirSom(){
        System.out.println("O animal está fazendo barulho...");
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public void setIdade(int idade){
        this.idade= idade;
    }
    public void setSexo(String Sexo){
        this.sexo= Sexo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSexo(){
        return this.sexo;
    }

    public int getIdade(){
        return this.idade;
    }
}
