import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tabuleiro {

    // Atribuição de cor aos personagens
    public static final String RED = "\033[0;31m";
    public static final String BLUE = "\033[0;34m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) throws Exception {
        
        String[][] tabuleiro = new String[10][10];
        Scanner leitor = new Scanner(System.in);

        List<Jogador> jogadores = new ArrayList<>();

        //Inicialização do tabuleiro com "."
        for(int i=0; i<tabuleiro.length; i++){
            for(int j=0; j<tabuleiro[i].length; j++){
                tabuleiro[i][j] = ".";
            }
        }        

        //Adicionando os personagens
        Jogador jogador1 = new Jogador(0, 0, RED + "X" + RESET);
        Jogador jogador2 = new Jogador(9, 9, BLUE + "W" + RESET);
        jogadores.add(jogador1);
        jogadores.add(jogador2);

        //adicionando os personagens antes de imprimir o tabuleiro
        tabuleiro[jogador1.getX()][jogador1.getY()] = jogador1.getRepresentacao();
        tabuleiro[jogador2.getX()][jogador2.getY()] = jogador2.getRepresentacao();
        
        //Loop para opções
        do {
            Config.imprimirTabuleiro(tabuleiro);

            System.out.println("Escolha o jogador que deseja mover:");
            System.out.println("1- Jogador 1 (X)");
            System.out.println("2- Jogador 2 (W)");
            

            int opcaoJogador = leitor.nextInt();

            Jogador jogadorSelecionado = null;

            switch (opcaoJogador) {
                case 1:
                    jogadorSelecionado = jogadores.get(0);
                    break;
                case 2:
                    jogadorSelecionado = jogadores.get(1);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            if (jogadorSelecionado != null) {
                System.out.println("O que deseja fazer? ");
                System.out.println("1- Mover para a direita");
                System.out.println("2- Mover para a esquerda");
                System.out.println("3- Mover para baixo");
                System.out.println("4- Mover para cima");

                int opcaoMovimento = leitor.nextInt();

                switch(opcaoMovimento) {
                    case 1: 
                        jogadorSelecionado.moverDireita();
                        break;
                    case 2:
                        jogadorSelecionado.moverEsquerda();
                        break;
                    case 3:
                        jogadorSelecionado.moverBaixo();
                        break;
                    case 4: 
                        jogadorSelecionado.moverCima();
                        break; 
                    default:
                        System.out.println("Número inválido");
                }

                //Atualiza o tabuleiro
                tabuleiro = Config.atualizarTabuleiro(jogadores);
            }

        } while(true);
    }
}
