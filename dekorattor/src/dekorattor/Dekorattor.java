/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorattor;

import dekorattor.DunkleRöstung;
 
public class Dekorattor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DunkleRöstung dR = new DunkleRöstung("dunkle Röstung");
        System.out.println(dR.getBeschreibung());
    }
    
}
