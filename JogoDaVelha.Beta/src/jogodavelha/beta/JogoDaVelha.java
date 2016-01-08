package jogodavelha.beta;

/**
 * Projeto jogo da velha.
 * @author Leonardo Pereira Alves.
 * @version Beta 28/04/2015 - 
 */
public class JogoDaVelha {
    private final int O; //Maquina.
    private final int X; //Homem.
    private final int[][] tab; //Tabuleiro.
    public JogoDaVelha(){
        O = 0;
        X = 1;
        tab = new int [3][3];
    }
    
    public void inicializaTabuleiro(){
        boolean x = true;
        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                if( (l == 1) && (c == 1)){
                    tab[l][c] = 4;
                }else if(x == true){
                    tab[l][c] = 3;
                }else{
                    tab[l][c] = 2;
                }
                x = !x;
            }
        }
    }
     
    public int[][] getTabuleiro(){
        return tab;
    }
    
    public int getLacuna(int l, int c){
        return tab[l][c];
    }
    
    public void maquinaJoga(){
        int maior = 0;
        int li = 0, co = 0;
        for(int l = 0; l < tab.length; l++){
            for(int c = 0; c < tab.length; c++){
                if((tab[l][c] > maior) && (tab[l][c] > X)){
                    maior = tab[l][c];
                    li = l;
                    co = c;
                }  
            }
        }
        if(tab[li][co] > X) tab[li][co] = O;
    } 
    
    public void jogadorJoga(int l, int c){
        if((l == 0) && (c == 0)){
            tab[0][0] = X;
            //Horizontal superior
            if(tab[0][1] > X) tab[0][1] += 2;
            if(tab[0][2] > X) tab[0][2] += 2;
            //Vertical esquerdo
            if(tab[1][0] > X) tab[1][0] += 2;
            if(tab[2][0] > X) tab[2][0] += 2;
            //Diagonal
            if(tab[1][1] > X) tab[1][1] += 2;
            if(tab[2][2] > X) tab[2][2] += 2;
        }else if((l == 0) && (c == 1)){
            tab[0][1] = X;
            //Horizontal superior
            if(tab[0][0] > X) tab[0][0] += 2;
            if(tab[0][2] > X) tab[0][2] += 2;
            //Coluna central
            if(tab[1][1] > X) tab[1][1] += 2;
            if(tab[2][1] > X) tab[2][1] += 2;
        }else if((l == 0) && (c == 2)){
            tab[0][2] = X;
            //Horizontal superior
            if(tab[0][1] > X) tab[0][1] += 2;
            if(tab[0][0] > X) tab[0][0] += 2;
            //Vertical direito
            if(tab[1][2] > X) tab[1][2] += 2;
            if(tab[2][2] > X) tab[2][2] += 2;
            //Diagonal
            if(tab[1][1] > X) tab[1][1] += 2;
            if(tab[2][0] > X) tab[2][0] += 2;
        }else if((l == 1) && (c == 0)){
            tab[1][0] = X;
            //Diagonal esquerdo
            if(tab[0][0] > X) tab[0][0] += 2;
            if(tab[2][0] > X) tab[2][0] += 2;
            //Horizontal central
            if(tab[1][1] > X) tab[1][1] += 2;
            if(tab[1][2] > X) tab[1][2] += 2;
        }else if((l == 1) && (c == 1)){
            tab[1][1] = X;
            //Hozontal superior
            if(tab[0][0] > X) tab[0][0] += 2;
            if(tab[0][1] > X) tab[0][1] += 2;
            if(tab[0][2] > X) tab[0][2] += 2;
            //Horizontal central
            if(tab[1][0] > X) tab[1][0] += 2; 
            if(tab[1][2] > X) tab[1][2] += 2;
            //Horizontal superior
            if(tab[2][0] > X) tab[2][0] += 2;
            if(tab[2][1] > X) tab[2][1] += 2;
            if(tab[2][2] > X) tab[2][2] += 2;
        }else if((l == 1) && (c == 2)){
            tab[1][2] = X;
            //Diagonal direito
            if(tab[0][2] > X) tab[0][2] += 2;
            if(tab[2][2] > X) tab[2][2] += 2;
            //Horizontal central
            if(tab[1][1] > X) tab[1][1] += 2;
            if(tab[1][0] > X) tab[1][0] += 2;
        }else if((l == 2) && (c == 0)){
            tab[2][0] = X;
            //Horizontal inferior
            if(tab[2][1] > X) tab[2][1] += 2;
            if(tab[2][2] > X) tab[2][2] += 2;
            //Vertical esquerdo
            if(tab[1][0] > X) tab[1][0] += 2;
            if(tab[0][0] > X) tab[0][0] += 2;
            //Diagonal
            if(tab[1][1] > X) tab[1][1] += 2;
            if(tab[0][2] > X) tab[0][2] += 2;
        }else if((l == 2) && (c == 1)){
            tab[2][1] = X;
            //Horizontal inferior
            if(tab[2][0] > X) tab[2][0] += 2;
            if(tab[2][2] > X) tab[2][2] += 2;
            //Coluna central
            if(tab[1][1] > X) tab[1][1] += 2;
            if(tab[0][1] > X) tab[0][1] += 2;
        }else if((l == 2) && (c == 2)){
            tab[2][2] = X;
            //Horizontal inferior
            if(tab[2][1] > X) tab[2][1] += 2;
            if(tab[2][0] > X) tab[2][0] += 2;
            //Vertical direito
            if(tab[1][2] > X) tab[1][2] += 2;
            if(tab[0][2] > X) tab[0][2] += 2;
            //Diagonal
            if(tab[1][1] > X) tab[1][1] += 2;
            if(tab[0][0] > X) tab[0][0] += 2;
        }
    }
    public boolean verificaFimDoJogo(){
        int n = 0;
        for(int l = 0; l < tab.length; l++){
            for(int c = 0; c < tab.length; c++){
                if((tab[l][c] == O)|| (tab[l][c] == X)){ n++; }
            }
        }
        return n == 9;
    }
    
    public boolean jogadorGanhou(){
        boolean x = false;
        //Horizontais
        if((tab[0][0] == X)&&(tab[0][1] == X)&&(tab[0][2] == X)) {return true;}
        if((tab[1][0] == X)&&(tab[1][1] == X)&&(tab[1][2] == X)) {return true;}
        if((tab[2][0] == X)&&(tab[2][1] == X)&&(tab[2][2] == X)) {return true;}
        //Verticais
        if((tab[0][0] == X)&&(tab[1][0] == X)&&(tab[2][0] == X)) {return true;}
        if((tab[0][1] == X)&&(tab[1][1] == X)&&(tab[2][1] == X)) {return true;}
        if((tab[0][2] == X)&&(tab[1][2] == X)&&(tab[2][2] == X)) {return true;}
        //Diaginal
        if((tab[0][0] == X)&&(tab[1][1] == X)&&(tab[2][2] == X)) {return true;}
        if((tab[2][0] == X)&&(tab[1][1] == X)&&(tab[0][2] == X)) {return true;}
        return x;
    }
    
    public boolean maquinaGanhou(){
        boolean x = false;
        //Horizontais
        if((tab[0][0] == O)&&(tab[0][1] == O)&&(tab[0][2] == O)) {return true;}
        if((tab[1][0] == O)&&(tab[1][1] == O)&&(tab[1][2] == O)) {return true;}
        if((tab[2][0] == O)&&(tab[2][1] == O)&&(tab[2][2] == O)) {return true;}
        //Verticais
        if((tab[0][0] == O)&&(tab[1][0] == O)&&(tab[2][0] == O)) {return true;}
        if((tab[0][1] == O)&&(tab[1][1] == O)&&(tab[2][1] == O)) {return true;}
        if((tab[0][2] == O)&&(tab[1][2] == O)&&(tab[2][2] == O)) {return true;}
        //Diaginal
        if((tab[0][0] == O)&&(tab[1][1] == O)&&(tab[2][2] == O)) {return true;}
        if((tab[2][0] == O)&&(tab[1][1] == O)&&(tab[0][2] == O)) {return true;}
        return x;
    }
    
    private boolean maquinaPodeVencer(){
        boolean chance = false;
        //Horizontal Superior
        if((tab[0][0] == O) && (tab[0][1] == O) && (tab[0][2] > X)){tab[0][2] = 100; chance = true;}
        if((tab[0][1] == O) && (tab[0][2] == O) && (tab[0][0] > X)){tab[0][0] = 100; chance = true;}
        if((tab[0][0] == O) && (tab[0][2] == O) && (tab[0][1] > X)){tab[0][1] = 100; chance = true;}
        
        //Horizontal Central
        if((tab[1][0] == O) && (tab[1][1] == O) && (tab[1][2] > X)){tab[1][2] = 100; chance = true;}
        if((tab[1][1] == O) && (tab[1][2] == O) && (tab[1][0] > X)){tab[1][0] = 100; chance = true;}
        if((tab[1][0] == O) && (tab[1][2] == O) && (tab[1][1] > X)){tab[1][1] = 100; chance = true;}
        
        //Horizontal Inferior
        if((tab[2][0] == O) && (tab[2][1] == O) && (tab[2][2] > X)){tab[2][2] = 100; chance = true;}
        if((tab[2][1] == O) && (tab[2][2] == O) && (tab[2][0] > X)){tab[2][0] = 100; chance = true;}
        if((tab[2][0] == O) && (tab[2][2] == O) && (tab[2][1] > X)){tab[2][1] = 100; chance = true;}
        
        //Vertical Esquerdo
        if((tab[0][0] == O) && (tab[1][0] == O) && (tab[2][0] > X)){tab[2][0] = 100; chance = true;}
        if((tab[1][0] == O) && (tab[2][0] == O) && (tab[0][0] > X)){tab[0][0] = 100; chance = true;}
        if((tab[0][0] == O) && (tab[2][0] == O) && (tab[1][0] > X)){tab[1][0] = 100; chance = true;}
        
        //Vertical Central
        if((tab[0][1] == O) && (tab[1][1] == O) && (tab[2][1] > X)){tab[2][1] = 100; chance = true;}
        if((tab[1][1] == O) && (tab[2][1] == O) && (tab[0][1] > X)){tab[0][1] = 100; chance = true;}
        if((tab[0][1] == O) && (tab[2][1] == O) && (tab[1][1] > X)){tab[1][1] = 100; chance = true;}
        
        //Vertical Direito
        if((tab[0][2] == O) && (tab[1][2] == O) && (tab[2][2] > X)){tab[2][2] = 100; chance = true;}
        if((tab[1][2] == O) && (tab[2][2] == O) && (tab[0][2] > X)){tab[0][2] = 100; chance = true;}
        if((tab[0][2] == O) && (tab[2][2] == O) && (tab[1][2] > X)){tab[1][2] = 100; chance = true;}
        
        //Diagonais
        if((tab[0][0] == O) && (tab[1][1] == O) && (tab[2][2] > X)){tab[2][2] = 100; chance = true;}
        if((tab[1][1] == O) && (tab[2][2] == O) && (tab[0][0] > X)){tab[0][0] = 100; chance = true;}
        if((tab[0][0] == O) && (tab[2][2] == O) && (tab[1][1] > X)){tab[1][1] = 100; chance = true;}
        if((tab[2][0] == O) && (tab[1][1] == O) && (tab[0][2] > X)){tab[0][2] = 100; chance = true;}
        if((tab[1][1] == O) && (tab[0][2] == O) && (tab[2][0] > X)){tab[2][0] = 100; chance = true;}
        if((tab[2][0] == O) && (tab[0][2] == O) && (tab[1][1] > X)){tab[1][1] = 100; chance = true;}
        
        return chance;
    }
    
    
    
    private boolean jogadorPodeVencer(){
        boolean chance = false;
        //Horizontal Superior
        if((tab[0][0] == X) && (tab[0][1] == X) && (tab[0][2] > X)){tab[0][2] = 100; chance = true;}
        if((tab[0][1] == X) && (tab[0][2] == X) && (tab[0][0] > X)){tab[0][0] = 100; chance = true;}
        if((tab[0][0] == X) && (tab[0][2] == X) && (tab[0][1] > X)){tab[0][1] = 100; chance = true;}
        
        //Horizontal Central
        if((tab[1][0] == X) && (tab[1][1] == X) && (tab[1][2] > X)){tab[1][2] = 100; chance = true;}
        if((tab[1][1] == X) && (tab[1][2] == X) && (tab[1][0] > X)){tab[1][0] = 100; chance = true;}
        if((tab[1][0] == X) && (tab[1][2] == X) && (tab[1][1] > X)){tab[1][1] = 100; chance = true;}
        
        //Horizontal Inferior
        if((tab[2][0] == X) && (tab[2][1] == X) && (tab[2][2] > X)){tab[2][2] = 100; chance = true;}
        if((tab[2][1] == X) && (tab[2][2] == X) && (tab[2][0] > X)){tab[2][0] = 100; chance = true;}
        if((tab[2][0] == X) && (tab[2][2] == X) && (tab[2][1] > X)){tab[2][1] = 100; chance = true;}
        
        //Vertical Esquerdo
        if((tab[0][0] == X) && (tab[1][0] == X) && (tab[2][0] > X)){tab[2][0] = 100; chance = true;}
        if((tab[1][0] == X) && (tab[2][0] == X) && (tab[0][0] > X)){tab[0][0] = 100; chance = true;}
        if((tab[0][0] == X) && (tab[2][0] == X) && (tab[1][0] > X)){tab[1][0] = 100; chance = true;}
        
        //Vertical Central
        if((tab[0][1] == X) && (tab[1][1] == X) && (tab[2][1] > X)){tab[2][1] = 100; chance = true;}
        if((tab[1][1] == X) && (tab[2][1] == X) && (tab[0][1] > X)){tab[0][1] = 100; chance = true;}
        if((tab[0][1] == X) && (tab[2][1] == X) && (tab[1][1] > X)){tab[1][1] = 100; chance = true;}
        
        //Vertical Direito
        if((tab[0][2] == X) && (tab[1][2] == X) && (tab[2][2] > X)){tab[2][2] = 100; chance = true;}
        if((tab[1][2] == X) && (tab[2][2] == X) && (tab[0][2] > X)){tab[0][2] = 100; chance = true;}
        if((tab[0][2] == X) && (tab[2][2] == X) && (tab[1][2] > X)){tab[1][2] = 100; chance = true;}
        
        //Diagonais
        if((tab[0][0] == X) && (tab[1][1] == X) && (tab[2][2] > X)){tab[2][2] = 100; chance = true;}
        if((tab[1][1] == X) && (tab[2][2] == X) && (tab[0][0] > X)){tab[0][0] = 100; chance = true;}
        if((tab[0][0] == X) && (tab[2][2] == X) && (tab[1][1] > X)){tab[1][1] = 100; chance = true;}
        if((tab[2][0] == X) && (tab[1][1] == X) && (tab[0][2] > X)){tab[0][2] = 100; chance = true;}
        if((tab[1][1] == X) && (tab[0][2] == X) && (tab[2][0] > X)){tab[2][0] = 100; chance = true;}
        if((tab[2][0] == X) && (tab[0][2] == X) && (tab[1][1] > X)){tab[1][1] = 100; chance = true;}
        
        return chance;
    }
        
    
    public void maquinaAnalisarEjogar(){
        if(maquinaPodeVencer()){ 
    	maquinaJoga();
        }else if(jogadorPodeVencer()){
    	maquinaJoga();
        }else{maquinaJoga();}
    }

    
    public boolean jogoAcabou(){
        if(verificaFimDoJogo()){return true;}
        if(jogadorGanhou()){return true;}
        return maquinaGanhou();
    }
    
    public void mostrar(){
        System.out.println();
        System.out.println();
        for(int l = 0; l < tab.length; l++){
            for(int c = 0; c < tab.length; c++){
                System.out.print(tab[l][c]+" ");
            }
            System.out.println();
        }
    }
}
