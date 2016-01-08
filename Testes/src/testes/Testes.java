package testes;

public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ArrayLinear teste = new ArrayLinear(10);
        
        int x = teste.pesquisaLinear(10);
        System.out.println(x);
        teste.mostrar()*/
        
        /*PesquisaBinaria teste = new PesquisaBinaria(100);
        
        int x = teste.buscaBinaria(50);
        System.out.println(x);*/
        //teste.mostrar();
        
        /*BuscaBinariaRecursiva teste = new BuscaBinariaRecursiva();
        
        int[] dados;
        dados = new int[100];
        Random gera = new Random();
        for(int i = 0; i < dados.length; i++){
        dados[i] = gera.nextInt(100) + 1;
        }
        
        int x = teste.busca(dados,0,99,1);
        
        System.out.println(x);
        for(int i = 0; i < dados.length; i++){
        System.out.println(dados[i]);
        }*/
        Animal teste = new Cachorro();
        
        Animal[] animal = new Animal[5];
        
        animal[0] = new Cachorro();
        animal[1] = new Galinha();
        animal[2] = new Pato();
        animal[3] = new Humano();
        animal[4] = teste;
        
        for (Animal bicho : animal) {
            bicho.fazSom();
        }
        Mamifero teste2 = new Cachorro();
        
        Mamifero bicho = new Humano();
        
        teste2 = bicho;
        
        bicho.mama();
        
        teste(teste2); 
    }
    public static void teste(Mamifero mamifero){
        mamifero.mama();
    }
    
}
