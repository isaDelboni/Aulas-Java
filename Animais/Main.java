public class Main {
    public static void main(String[] args) {
        
        Animal animal =new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        System.out.println("--Cachorro: ");
        cachorro.setNome("Chico");
        cachorro.setRaca("Boxer");
        cachorro.setNome("Rex");
        cachorro.setPorte("Grande");
        cachorro.setIdade(11);
        cachorro.setSexo("Masculino");

        System.out.println("--Gato:");
        gato.setNome("Luna");
        gato.setIdade(4);
        gato.setSexo("Femêa");
        gato.setPelagem("Laranja");
        gato.setCacando(false);
        gato.mudarCacando(false);

        System.out.println("--Vaca: ");
        vaca.setNome("Mimosa");
        vaca.setIdade(13);
        vaca.setSexo("Femêa");
        vaca.setDieta("Pasto");
        vaca.setManchas("Marrons");

        System.out.println(animal);
        System.out.println(cachorro);
    }
}
