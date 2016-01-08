package meuexe.pkg028.gui.pkg07;

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

    // metodo recebe uma string e retorna true se ela possuir letra maiuscula
    public boolean checkLetter(String s){

        boolean x = false;

        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')){
                x = true;
                break;
            }
        }
        return x;
    }
    // Sobrecaga do metodo para receber char
    public boolean checkLetter(char s){
        return ((s  >= 'A') && (s <= 'Z'));
    }


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

    // Esse metodo verifica se uma string possui alguma operação.
    public boolean checkOperations(String s){

        boolean x = false;
        char[] o = {'*','/','+','-'};

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < o.length; j++){
                if(s.charAt(i) == o[j]){
                    x = true;
                    break;
                }
                if( x == true){break;}
            }

        }
        return x;
    }
    // Sobrecagar do metodo para receber char.
    public boolean checkOperations(char s){

        boolean x = false;
        char[] o = {'*','/','+','-'};

        for(int i = 0; i < o.length; i++){
            if(s == o[i]){
                x = true;
                break;
            }
        }
        return x;
    }

    // Esse metodo checa tudo.
    public boolean checkEveryone(String s){

        boolean a = checkNumber(s);
        boolean b = checkLetter(s);
        boolean c = checkParenthesis(s);
        boolean d = checkOperations(s);

        return ((a == false) && (b == true) && (c == true) && (d == true));
    }
}// Fim da classe Check;
