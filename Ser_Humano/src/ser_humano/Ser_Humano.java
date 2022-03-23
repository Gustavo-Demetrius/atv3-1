/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser_humano;

/**
 *
 * @author alunocmc
 */
class Ser_Humano {
    
    public static void main (String[] args){
    
        Corpo_Humano C1 = new Corpo_Humano(50,90);
        
        System.out.println(C1.GetDensidade());
        
        Corpo_Humano IMC = new Corpo_Humano(70,170);
        
        System.out.println(IMC.GetDensidade());
    
    } 
}
