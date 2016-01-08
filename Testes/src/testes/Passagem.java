package testes;

/**
 *
 * @author Leonardo Pereira Alves 
 * 
 */
public class Passagem {
    public static TantoFaz x = new TantoFaz();
    public static void main (String[] args){
        int[] array = {1,2,3,4,5};
        
        System.out.println(
            "Efeitos da passagem por referencia em um array inteiro: \n" +
            "Os valores originais do array são: "
        );
        
        mostra(array);
        
        modificaArray(array);
        
        System.out.println("\n\n Valores após modificação são: ");
        mostra(array);
        
        System.out.println("Teste de passagem do elemento array[3] em um método: ");
        System.out.println("Valor atual do elemento array[3]: "+array[3]);
        modificaElemento(array[3]);
        System.out.println("Valor após método "+array[3]);
        
        String a = "Valor inicial";
        System.out.println("Antes do método "+a);
        mudaString(a);
        System.out.println("depois do método "+a);
        
        x.setN1(1);
        System.out.println("Antes da mudança: "+x.getN1());
        mudaTantaFaz(x);
        System.out.println("Depois da mudança: "+x.getN1());
        
    }
    
    public static void modificaArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] *= 2;
        }
    }
    
    public static void modificaElemento(int elemento){
        elemento *= 2;
        System.out.printf("Valor do elemento modificado: %d\n",elemento);
    }
    
    public static void mostra(int[] array){
        for(int x : array){
            System.out.print(x+" ");
        }
    }
    
    public static void mudaString(String s){
        s = "String mudada";
        System.out.println("Dentro do método: "+s);
    }
    
    public static void mudaTantaFaz(TantoFaz t){
        t.setN1(0);
        t.setN2(0);
        t.setN3(0);
    }
    
    
}
