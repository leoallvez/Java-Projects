package cachorro;

public class Cachorro {
    class Dog {
        int size; // variáveis de instância
        String breed;
        String name;
        
        void latir(){
            System.out.println("Au Au Au");
        }
    }
    class TestDriver{
        public static void main (String[] args){
            Dog Rex = new Dog();
          
            Rex.size = 40;
          
            Rex.latir();
        }
    }  
}
