import java.util.List;

public class Config {

    public static void imprimirTabuleiro(String tabuleiro[][]) {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print("[" + tabuleiro[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static String[][] atualizarTabuleiro(List<Jogador> jogadores) {

        String[][] tabuleiro = new String[10][10];

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ".";
            }
        }

        for (Jogador jogador : jogadores) {
            tabuleiro[jogador.getX()][jogador.getY()] = jogador.getRepresentacao();
        }
        return tabuleiro;
    }
}
