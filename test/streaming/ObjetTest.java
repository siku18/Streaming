/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import streaming.enumerations.TypeUtil;
import streaming.interfaces.Ensemble;
import streaming.interfaces.Liste;

/**
 *
 * @author admin
 */
public class ObjetTest {
    
    @Test
    public void testPoisson(){
        
       TypeUtil tu = TypeUtil.MODERATEUR;
       
       if(tu==TypeUtil.MODERATEUR){
           System.out.println("Moderateur");
       }

    }
    
}
