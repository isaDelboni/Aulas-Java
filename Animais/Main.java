public class Main {
    public static void main(String[] args) {
        
        Animal animal =new Animal();
        Cachorro cachorro = new Cachorro();

        animal.setNome("Chico");

        cachorro.setRaca("Boxer");
        cachorro.setNome("Rex");


        System.out.println(animal);
        System.out.println(cachorro);
    }
}
