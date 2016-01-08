package jogodavelha1.pkg0;
/**
 * Projeto jogo da velha.
 * @author Leonardo Pereira Alves.
 * @version 1.0 15/06/2015 - 16/06/2015
 */

public class JogadorVirtual extends Jogador{
    
    public JogadorVirtual(String nome, int id) {
        super(nome,id);
    }
    
    private void joga(){
        int maior = 0;
        int x = 0;
        int y = 0;
        for(int l = 0; l < Tabela.posicoes.length; l++){
            for(int c = 0; c < Tabela.posicoes.length; c++){
                if((Tabela.posicoes[l][c] > maior) && (Tabela.vazio(l, c))){
                    maior = Tabela.posicoes[l][c];
                    x = l;
                    y = c;
                }  
            }
        }
        if(Tabela.posicoes[x][y] > 2) Tabela.posicoes[x][y] = this.id;
    } 
    
    private boolean maquinaPodeVencer(){
        int[][] t = Tabela.posicoes;
        int p = 42;
        boolean chance = false;
        
        //Horizontal Superior
        if((t[0][0] == id) && (t[0][1] == id) && (Tabela.vazio(0,2))){t[0][2] += p; chance = true;}
        if((t[0][1] == id) && (t[0][2] == id) && (Tabela.vazio(0,0))){t[0][0] += p; chance = true;}
        if((t[0][0] == id) && (t[0][2] == id) && (Tabela.vazio(0,1))){t[0][1] += p; chance = true;}
        
        //Horizontal Central
        if((t[1][0] == id) && (t[1][1] == id) && (Tabela.vazio(1,2))){t[1][2] += p; chance = true;}
        if((t[1][1] == id) && (t[1][2] == id) && (Tabela.vazio(1,0))){t[1][0] += p; chance = true;}
        if((t[1][0] == id) && (t[1][2] == id) && (Tabela.vazio(1,1))){t[1][1] += p; chance = true;}
        
        //Horizontal Inferior
        if((t[2][0] == id) && (t[2][1] == id) && (Tabela.vazio(2,2))){t[2][2] += p; chance = true;}
        if((t[2][1] == id) && (t[2][2] == id) && (Tabela.vazio(2,0))){t[2][0] += p; chance = true;}
        if((t[2][0] == id) && (t[2][2] == id) && (Tabela.vazio(2,1))){t[2][1] += p; chance = true;}
        
        //Vertical Esquerdo
        if((t[0][0] == id) && (t[1][0] == id) && (Tabela.vazio(2,0))){t[2][0] += p; chance = true;}
        if((t[1][0] == id) && (t[2][0] == id) && (Tabela.vazio(0,0))){t[0][0] += p; chance = true;}
        if((t[0][0] == id) && (t[2][0] == id) && (Tabela.vazio(1,0))){t[1][0] += p; chance = true;}
        
        //Vertical Central
        if((t[0][1] == id) && (t[1][1] == id) && (Tabela.vazio(2,1))){t[2][1] += p; chance = true;}
        if((t[1][1] == id) && (t[2][1] == id) && (Tabela.vazio(0,1))){t[0][1] += p; chance = true;}
        if((t[0][1] == id) && (t[2][1] == id) && (Tabela.vazio(1,1))){t[1][1] += p; chance = true;}
        
        //Vertical Direito
        if((t[0][2] == id) && (t[1][2] == id) && (Tabela.vazio(2,2))){t[2][2] += p; chance = true;}
        if((t[1][2] == id) && (t[2][2] == id) && (Tabela.vazio(0,2))){t[0][2] += p; chance = true;}
        if((t[0][2] == id) && (t[2][2] == id) && (Tabela.vazio(1,2))){t[1][2] += p; chance = true;}
        
        //Diagonais
        if((t[0][0] == id) && (t[1][1] == id) && (Tabela.vazio(2,2))){t[2][2] += p; chance = true;}
        if((t[1][1] == id) && (t[2][2] == id) && (Tabela.vazio(0,0))){t[0][0] += p; chance = true;}
        if((t[0][0] == id) && (t[2][2] == id) && (Tabela.vazio(1,1))){t[1][1] += p; chance = true;}
        if((t[2][0] == id) && (t[1][1] == id) && (Tabela.vazio(0,2))){t[0][2] += p; chance = true;}
        if((t[1][1] == id) && (t[0][2] == id) && (Tabela.vazio(2,0))){t[2][0] += p; chance = true;}
        if((t[2][0] == id) && (t[0][2] == id) && (Tabela.vazio(1,1))){t[1][1] += p; chance = true;}
     
        Tabela.posicoes = t;
        return chance;   
    }
    
    private boolean jogadorPodeVencer(int id){
    int[][] t = Tabela.posicoes;
        int p = 42;
        boolean chance = false;
        
        //Horizontal Superior
        if((t[0][0] == id) && (t[0][1] == id) && (Tabela.vazio(0,2))){t[0][2] += p; chance = true;}
        if((t[0][1] == id) && (t[0][2] == id) && (Tabela.vazio(0,0))){t[0][0] += p; chance = true;}
        if((t[0][0] == id) && (t[0][2] == id) && (Tabela.vazio(0,1))){t[0][1] += p; chance = true;}
        
        //Horizontal Central
        if((t[1][0] == id) && (t[1][1] == id) && (Tabela.vazio(1,2))){t[1][2] += p; chance = true;}
        if((t[1][1] == id) && (t[1][2] == id) && (Tabela.vazio(1,0))){t[1][0] += p; chance = true;}
        if((t[1][0] == id) && (t[1][2] == id) && (Tabela.vazio(1,1))){t[1][1] += p; chance = true;}
        
        //Horizontal Inferior
        if((t[2][0] == id) && (t[2][1] == id) && (Tabela.vazio(2,2))){t[2][2] += p; chance = true;}
        if((t[2][1] == id) && (t[2][2] == id) && (Tabela.vazio(2,0))){t[2][0] += p; chance = true;}
        if((t[2][0] == id) && (t[2][2] == id) && (Tabela.vazio(2,1))){t[2][1] += p; chance = true;}
        
        //Vertical Esquerdo
        if((t[0][0] == id) && (t[1][0] == id) && (Tabela.vazio(2,0))){t[2][0] += p; chance = true;}
        if((t[1][0] == id) && (t[2][0] == id) && (Tabela.vazio(0,0))){t[0][0] += p; chance = true;}
        if((t[0][0] == id) && (t[2][0] == id) && (Tabela.vazio(1,0))){t[1][0] += p; chance = true;}
        
        //Vertical Central
        if((t[0][1] == id) && (t[1][1] == id) && (Tabela.vazio(2,1))){t[2][1] += p; chance = true;}
        if((t[1][1] == id) && (t[2][1] == id) && (Tabela.vazio(0,1))){t[0][1] += p; chance = true;}
        if((t[0][1] == id) && (t[2][1] == id) && (Tabela.vazio(1,1))){t[1][1] += p; chance = true;}
        
        //Vertical Direito
        if((t[0][2] == id) && (t[1][2] == id) && (Tabela.vazio(2,2))){t[2][2] += p; chance = true;}
        if((t[1][2] == id) && (t[2][2] == id) && (Tabela.vazio(0,2))){t[0][2] += p; chance = true;}
        if((t[0][2] == id) && (t[2][2] == id) && (Tabela.vazio(1,2))){t[1][2] += p; chance = true;}
        
        //Diagonais
        if((t[0][0] == id) && (t[1][1] == id) && (Tabela.vazio(2,2))){t[2][2] += p; chance = true;}
        if((t[1][1] == id) && (t[2][2] == id) && (Tabela.vazio(0,0))){t[0][0] += p; chance = true;}
        if((t[0][0] == id) && (t[2][2] == id) && (Tabela.vazio(1,1))){t[1][1] += p; chance = true;}
        if((t[2][0] == id) && (t[1][1] == id) && (Tabela.vazio(0,2))){t[0][2] += p; chance = true;}
        if((t[1][1] == id) && (t[0][2] == id) && (Tabela.vazio(2,0))){t[2][0] += p; chance = true;}
        if((t[2][0] == id) && (t[0][2] == id) && (Tabela.vazio(1,1))){t[1][1] += p; chance = true;}
     
        Tabela.posicoes = t;
        return chance;  
    }
    
    public void analisarEjogar(int id){
        if(maquinaPodeVencer()){ 
            joga();
        }else if(jogadorPodeVencer(id)){
            joga();
        }else{
            joga();
        }
    }
}//Fim da classe JogadorVitual
