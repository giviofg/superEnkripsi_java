/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkripsi.dekripsi;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
//import com.jtattoo.plaf.noire.NoireLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author GiePie
 */
public class EnkripsiDekripsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // select Look and Feel
            UIManager.setLookAndFeel(new HiFiLookAndFeel());
        } catch (Exception e){
            
        }
        endecrypt ed = new endecrypt();
        ed.setVisible(true);
    }
    
}
