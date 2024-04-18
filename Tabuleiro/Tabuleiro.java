import java.util.Scanner;

public class Tabuleiro {

    public static final String RED = "\033[0;31m";
    public static final String BLUE = "\033[0;34m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) throws Exception {
        
        String[][] tabuleiro = new String[10][10];
        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<tabuleiro.length; i++){
            for(int j=0; j<tabuleiro[i].length; j++){
                tabuleiro[i][j] = ".";
            }
        }

        tabuleiro[0][0] = RED + "X"+ RESET;
        tabuleiro[2][2] = BLUE + "W" + RESET;

        Config.imprimirTabuleiro(tabuleiro);

            System.out.println("O que deseja fazer? ");
            System.out.println("1- Mover para a direita");
            System.out.println("2- Mover para a esquerda");
            System.out.println("3- Mover para baixo");
            System.out.println("4- Mover para cima");
            int opcao = leitor.nextInt();

            switch(opcao){
                case 1: 
                Config.moverDireita(tabuleiro);
                    break;
                case 2:
                    Config.moverEsquerda(tabuleiro);
                    break;
                case 3:
                    Config.moverBaixo(tabuleiro);
                    break;
                case 4: 
                    Config.moverCima(tabuleiro);
                    break; 
                default:
                    System.out.println("Número inválido");
            }
    }

    
}

