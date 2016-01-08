/**
 * Esse programa simula um jogo da vela para dois jogadores.
 * @author Leonardo Pereira Alves
 * @versio 1.0
 * @date 03.01.2015
 */
import java.io.*;
public class JogoDaVelha {
    // Declaração de uma matriz de 3 linhas e 3 colunas.
    static int[][] jogada = new int [3][3]; 
    // As matrizes e variaveis são estaticas para que serem usadas 
    //pelos dois objetos e tenha o mesmos valores.
    static String [][] tabuleiro = new String [3][3]; 
    InputStreamReader dados = new InputStreamReader(System.in);
    BufferedReader teclado = new BufferedReader(dados);
    static int i; 
    static int j;
    String nome;
    static boolean play;
    int n = 0;
    
    public void carregaPosicoes(){
        // Esse metodo carrega as matrizes do jogo.
        for (int l = 0; l < 3; l++){ // Carregando tabuleiro e posições.
            for (int c = 0; c < 3; c++){
                jogada[l][c] = i;
                tabuleiro [l][c] = "["+i+"]";
                i++;
            }
    	}
    }
    public boolean verificaPosicao(int n){
        // Esse metodo verifi se a posição escolhida é valida
        int x = 0;
        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 3; c++){
                if(jogada[l][c] == n){
        	    x++;
        	}
            }
        }
        if (x != 0){
            return true;
        }else{
            return false;
        }
    }
    public void reescrevePosicoes(int n){
    	// Esse metodo altera os valores da matrizes durante o jogo.
    	for (int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                if (jogada[l][c] == n){ 
                    jogada[l][c] = -1;
    		    tabuleiro[l][c] = this.nome;	
    		}
    	    }
    	}
    }
    public void ImprimiTabela(){
    	for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                System.out.print(tabuleiro[l][c]);
    	    }
            System.out.println();
    	}
    }
    public boolean verificaFimDoJogo(){
    	i = 0;
    	for(int l = 0; l < 3; l++){
    	    for(int c = 0; c < 3; c++){
    		if(jogada[l][c] == -1){i++;}
    	    }
    	}
    	if(i == 9){
    	    System.out.println();
            System.out.println("Fim de jogo");
    	    return true;
    	}else{
    	    return false;
    	}
    }
    public boolean joga(int n){
    	if((verificaPosicao(n) == true) && ((n > -1) && (n < 9))){
    		reescrevePosicoes(n);
    		ImprimiTabela();
    		return true;
    	}else{
    		System.out.println("Jogada invalida jogue novamente");
    		return false;
    	}
    }
    void jogada() throws NumberFormatException, IOException{
    	play = false;
        while(play != true){
            System.out.println();
            System.out.print("Jogador " + this.nome + " Sua vez de jogar: ");
            n = Integer.parseInt(teclado.readLine());
            System.out.println();
            play = this.joga(n);
        }
    }
    public static void main(String[] args){
	try{
            JogoDaVelha jogador1 = new JogoDaVelha();
            JogoDaVelha jogador2 = new JogoDaVelha();
            System.out.println("        Bem vindos ao Jogo da velha          ");
            System.out.println("Para jogar basta escolher um número na tabela");
            System.out.println();
            jogador1.carregaPosicoes();
            jogador1.ImprimiTabela();
            jogador1.nome = "[X]";
            jogador2.nome = "[0]";
            boolean fim = false;
            while(fim != true){
                jogador1.jogada();
                if (jogador1.verificaFimDoJogo() == true){System.exit(0);}
                jogador2.jogada();
                if (jogador2.verificaFimDoJogo() == true){System.exit(0);}
            } 
	}
	catch (Exception erro){
            System.out.print("["+erro+"] Erro durante a entrada de dados");
	}
    }
}
