package cao;
import java.util.Scanner; // Importando uma API?

class Cao {
    String name;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Cria um objeto Dog e o acessa.
        Cao dog1 = new Cao();
        dog1.name = "Sultão";
        // Declarar uma matriz de referencia aos objetos.
        Cao[] myDogs = new Cao[3];
        // Criar os objeto
        for(int a = 0; a < myDogs.length; a++){
            myDogs[a] = new Cao();
        }       
        // Agora acessar os objetos
        // usando a referencia da matriz.
        for(int b = 0; b < myDogs.length; b++){
            System.out.println("Digite um nome para o cachorro "+ b +": ");
            myDogs[b].name = in.next();
        }
        for(int c = 0; c < myDogs.length; c++){ // Comprimento da variavel de referencia.
            System.out.println("O nome do cão número "+ c +" é: "+myDogs[c].name);
        }// Fim do while.
    }// Fim do main.
}// Fim da classe.
