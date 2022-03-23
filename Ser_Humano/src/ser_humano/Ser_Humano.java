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
        
        /*
        
        1.O comando apresenta um erro pois o acesso do valor de massa esta privado na classe Corpo_Humano



2. Ao alterar a linha de private float Massa para public float Massa, a variável deixou de ser exclusiva para operação e passou a ser disponível para qualquer momento dentro da classe.



3. O proprio NetBeans aparece um aviso dizendo que o método SetVolume nunca é usado e não é possível utilizar o metodo na main
        
        */
    
    } 
}
