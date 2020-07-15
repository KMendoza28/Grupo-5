/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infomacion;

import helpers.Deportista;
import helpers.Doctor;

/**
 *
 * @author Dimas Guzman
 */
public class Informacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
           Doctor dr=new Doctor ();
           Deportista da=new Deportista();
           
          System.out.println();
          dr.imprimir();
           System.out.println();
           da.imprimir();
           
    }

}
