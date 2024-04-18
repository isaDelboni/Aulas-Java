public class Config {

    public static void imprimirTabuleiro(String tabuleiro[][]){
        for(int i=0; i<tabuleiro.length; i++){
            for(int j=0; j<tabuleiro[i].length; j++){
                System.out.print("["+ tabuleiro[i][j]+"]");
            }
            System.out.println();
        }
    }

    public static void moverDireita(String tabuleiro[][]){
        for(int i=0; i<tabuleiro.length; i++){
            for(int j=0; j<tabuleiro[i].length; j++){
                if(tabuleiro[i][j].equals("O")){
                    tabuleiro[i][j] = "X";
                    tabuleiro[i+1][j] = "O";
                }
            }
        }
    }

    public static void moverEsquerda(String tabuleiro[][]){
        for(int i=0; i<tabuleiro.length; i++){
            for(int j=0; j<tabuleiro[i].length; j++){
                if(tabuleiro[i][j].equals("O")){
                    tabuleiro[i][j] = "X";
                    tabuleiro[i-1][j] = "O";
                }
            }
        }
    }

    public static void moverCima(String tabuleiro[][]){
        for(int i=0; i<tabuleiro.length; i++){
            for(int j=0; j<tabuleiro[i].length; j++){
                if(tabuleiro[i][j].equals("O")){
                    tabuleiro[i][j] = "X";
                    tabuleiro[i][j-1] = "O";
                }
            }
        }
    }

    public static void moverBaixo(String tabuleiro[][]){
        for(int i=0; i<tabuleiro.length; i++){
            for(int j=0; j<tabuleiro[i].length; j++){
                if(tabuleiro[i][j].equals("O")){
                    tabuleiro[i][j] = tabuleiro[i][j+1];
                }
            }
        }
    }

}

