import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

    public static void tabuleiro(int largura, int altura, List<Personagem> perso) {
        for (int i=0; i<altura; i++){
            for (int j=0; j<largura; j++){
                boolean Tf = false;

                for(Personagem p: perso){
                    if (j == p.getPosX() && i == p.getPosY()) {
                        System.out.print("[" + p.getDesenho() + "]");
                        Tf= true;
                    }
                }
                if(!Tf){
                    System.out.print("[.]");
                }
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        List<Personagem> perso = new ArrayList<>();

        perso.add(new Personagem(1, 2, "x"));
        perso.add(new Personagem(2, 1, "w"));
        perso.add(new Personagem(3, 6, "z"));
    
        tabuleiro(10, 10, perso);

        
    }
}

