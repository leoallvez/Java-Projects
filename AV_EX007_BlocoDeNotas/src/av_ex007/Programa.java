/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av_ex007;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author marcoaurelio
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }   
        
        UmcPad um = new UmcPad();
    }
    
}
