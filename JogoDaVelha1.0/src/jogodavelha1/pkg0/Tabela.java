package jogodavelha1.pkg0;

/**
 * Projeto jogo da velha.
 * @author Leonardo Pereira Alves.
 * @version 1.0 15/06/2015 - 16/06/2015
 */
public final class Tabela {
    
    private final Jogador player1;
    private final Jogador player2;
    public static int[][] posicoes;
    public static final int min = 2;
    
    public Tabela(Jogador player1, Jogador player2){
        this.player1 = player1;
        this.player2 = player2;
        posicoes = new int [3][3];
        inicializaTabela();
    }
    
    public void inicializaTabela(){
        boolean x = true;
        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                if( (l == 1) && (c == 1)){
                    posicoes[l][c] = 4;
                }else if(x == true){
                    posicoes[l][c] = 3;
                }else{
                    posicoes[l][c] = 2;
                }
                x = !x;
            }
        }
    }
    
    public int mostraPosicao(int l, int c){
        return posicoes[l][c];
    }
    
    public boolean tabelaTotalmentePreenchida(){
        int n = 0;
        for (int[] posicoe : posicoes) {
            for (int c = 0; c < posicoes.length; c++) {
                if ((posicoe[c] == player1.getId()) || (posicoe[c] == player2.getId())){
                    n++;
                }
            }
        }
        return n == 9;
    }
    
    public boolean fimDeJogo(){
        if(tabelaTotalmentePreenchida()){return true;}
        if(player1.ganhou()){return true;}
        return player2.ganhou();
    }
    
    public static boolean vazio(int l, int c){
        return posicoes[l][c] >= min;
    }
    
    public void mostrar(){
        System.out.println();
        System.out.println();
        for (int[] posicoe : Tabela.posicoes) {
            for (int c = 0; c < Tabela.posicoes.length; c++) {
                System.out.print(posicoe[c] + " ");
            }
            System.out.println();
        }
    }
}//Fim da classe tabela.
