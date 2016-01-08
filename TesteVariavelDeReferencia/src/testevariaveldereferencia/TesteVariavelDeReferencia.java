package testevariaveldereferencia;
public class TesteVariavelDeReferencia {
    String nome;
    void soma (){
        int a, b, c;
        a = 1;
        b = 2;
        c = a + b;
        a = c;
    }
    public static void main(String[] args) {
        TesteVariavelDeReferencia objeto1 = new TesteVariavelDeReferencia();
        TesteVariavelDeReferencia objeto2 = new TesteVariavelDeReferencia();
        TesteVariavelDeReferencia objeto3 = objeto2;
        
        objeto1.nome = "Leonardo";
        objeto1.soma();
        
        objeto2.nome = "Leonardo";
        objeto2.soma();
        
        if (objeto1 == objeto2){
            System.out.println ("Esses objetos são iguais");
        }else{
            System.out.println ("Esses objetos são diferentes");
        } 
        
        if (objeto2 == objeto3){
            System.out.println ("Esses objetos são iguais");  
        }
    } 
}
