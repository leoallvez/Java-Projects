/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author Leonardo
 */
class Dog {
    int size;
    String breed;
    String name;
    
    void latir(){
        System.out.println("Au Au Au ");
    }
    void uivar(){
        System.out.println("Auuuuuuuuuuuuuuuuuuuu");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog Rex = new Dog();
        Rex.latir();
        Rex.size = 40;
        System.out.println (Rex.size);
        Rex.uivar();
    }
}
