package ioo.ex.pkg006.eletrodomestico;

public class Principal {

    public static void main(String[] args) {
        Eletrodomestico radio = new Eletrodomestico();
        radio.ligar();
        radio.mudarVelocidade(15);
        radio.mudarTensao();
        radio.mostrar();
        radio.mudarTensao();
        radio.mostrar();
    }
}
