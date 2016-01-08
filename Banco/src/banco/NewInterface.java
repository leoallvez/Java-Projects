/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Leonardo
 */
public interface NewInterface {

    void deposita(double quantidade);

    void imprimeBanco();

    void mostra();

    void saca(double quantidade);

    void transfere(Banco destino, double valor);
    
}
