package meuexe.pkg026;

/**
 * @author Leonardo Pereira Alves.
 * @version 25/03/2015
 */
public class Check {
    
    // Esse metodo recebe uma string e retorna true se ela possuir numero.
    public boolean checkNumber(String s){
        
        boolean x = false;
        
        char[] n = {'0','1','2','3','4','5','6','7','8','9'};
        
        for(int l = 0; l < s.length(); l++){
            for(int c = 0; c < n.length; c++){
                if(s.charAt(l) == n[c]){
                    x = true;
                    break;
                }
            }//Fim do for c.
            if(x == true){break;} //Break's para economia de processamento;
        }//Fim do for l.
        return x; 
    }//Fim do metodo checkNumber
    
    //Esse metodo recebe uma string e retorna true se ela não possuir
    //parenteses ou se tiver todos corretamente.
    public boolean checkParenthesis(String s){
        
        int x = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                x++;
            }else if(s.charAt(i) == ')'){
                x--;
            }
        }
        return x == 0;
    }//Fim do metodo checkParenthesis.
    
}// Fim da classe Check;
