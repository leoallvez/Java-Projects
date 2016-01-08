package casa;


public class Casa {
    String cor;
    boolean porta1, porta2, porta3;
    void pinta (String s){
        this.cor = s;
    }
    int portasAbertas(){
        int i = 0;
        if (porta1 == true){i++;}
        if (porta2 == true){i++;}
        if (porta3 == true){i++;}
        return i;
    } 
    void mostra(){
        System.out.println("Cor da casa: "+cor);
        if(porta1 == true){
            System.out.println("Porta 1 Aberta");
        }else{
            System.out.println("Porta 1 Fechada");
        }if(porta2 == true){
            System.out.println("Porta 2 Aberta");
        }else{
            System.out.println("Porta 2 Fechada");
        }if(porta3 == true){
            System.out.println("Porta 3 Aberta");
        }else{
            System.out.println("Porta 3 Fechada");
        }
        
    }
    public static void main(String[] args) {
        Casa a = new Casa();
        a.mostra();
        a.porta1 = true;
        a.porta2 = true;
        
        System.out.println(a.portasAbertas());
        a.mostra();
        
    }
    
}
