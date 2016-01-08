package ioo.ex.pkg001;
/**
 * Implementação orientada a objetos.
 * @author Leonardo Pereira Alves.
 * @version 10.03.15
 */
public class Banco {
    
    public double Credito(double saldoMedio){
        
        double result = 0;
        
        if(saldoMedio >= 0 && saldoMedio <= 200){
            result = 0;
        }else{
            if(saldoMedio > 200 && saldoMedio <= 400){
                result = saldoMedio * 0.20;
            }else{
                if(saldoMedio > 400 && saldoMedio <= 600){
                    result = saldoMedio * 0.30;
                }else{
                    if(saldoMedio > 600){
                        result = saldoMedio * 0.40;
                    }
                }
            }
        }
        return result;
    } 
}
