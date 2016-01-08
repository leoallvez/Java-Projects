package jogodavelha1.pkg0;

/**
 * Projeto jogo da velha.
 * @author Leonardo Pereira Alves.
 * @version 1.0 15/06/2015 - 16/06/2015
 */
public class Jogador {
    protected String nome;
    protected int id;
    protected int pontos;

   
    Jogador(String nome, int id){
        this.nome = nome;
        this.id = id;
        this.pontos = 0;
    }
      
    public void joga(int l, int c){
        if(Tabela.vazio(l, c)){Tabela.posicoes[l][c] = id;}
    }
    
    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }
    
    public void marcaPonto(){
        pontos = pontos + 1;
    }
    
    public int getId() {
        return id;
    }
    
    public void zeraPonto(){
        pontos = 0;
    }
    
    public boolean ganhou(){
        int[][] t = Tabela.posicoes;
        return
        //Horizontais
       (((t[0][0] == this.id)&&(t[0][1] == this.id)&&(t[0][2] == this.id)) ||
        ((t[1][0] == this.id)&&(t[1][1] == this.id)&&(t[1][2] == this.id)) ||
        ((t[2][0] == this.id)&&(t[2][1] == this.id)&&(t[2][2] == this.id)) ||
        //Verticais
        ((t[0][0] == this.id)&&(t[1][0] == this.id)&&(t[2][0] == this.id)) ||
        ((t[0][1] == this.id)&&(t[1][1] == this.id)&&(t[2][1] == this.id)) ||
        ((t[0][2] == this.id)&&(t[1][2] == this.id)&&(t[2][2] == this.id)) ||
        //Diagonais
        ((t[0][0] == this.id)&&(t[1][1] == this.id)&&(t[2][2] == this.id)) ||
        ((t[2][0] == this.id)&&(t[1][1] == this.id)&&(t[0][2] == this.id)));
        
    }
} //Fim da classe Jogador
