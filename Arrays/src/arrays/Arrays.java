package arrays;
public class Arrays {
    public static void main(String[] args) {
        int[] idade = new int[10]; //Array de onze posições.
        for (int i = 0; i < 10; i++){
            idade[i] = i * 10;
        }
        for ( int i = 0 ; i < idade.length; i++){ //Comprimento do array idade
            System.out.println(idade[i]);
        }
    }
}
