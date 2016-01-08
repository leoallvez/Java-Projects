package casting;
/**
 * Esse programa mostra como podemos moldar uma váriavel em outra de outro tipo
 * com o uso de casting, porém isso geralmente significa perda de irformação.
 * 
 * @author Leonardo Pereira Alves
 * @version 12.01.2015
 */
public class Casting {
    public static void main(String[] args) {
        double d3 = 3.14;
        int i = (int) d3;
        System.out.println(i);
        char name = 'L';
        String a = String.valueOf(name);
        System.out.println(a);
    }
}
