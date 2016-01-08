package hobbits;
public class Hobbits {
    String name;
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3]; // Declaração de matriz de referencia a objeto.
        int z = 0;
        while (z < 3){
            h[z] = new Hobbits(); // associando um objeto a uma variavel de referencia.
            h[z].name = "Bilbo";
            if (z == 1){
                h[z].name = "Frodo";
            }
            if (z == 2){
                h[z].name = "Sam";
            }
            System.out.println(h[z].name+ " é um bom nome de Hobbit");
            z++;
        }
    } 
}