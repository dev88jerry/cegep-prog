/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontemperature;

import java.util.Scanner;

/**
 *
 * @author Jerry
 */
public class ConversionTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Convertisseur degres celsius et degres fahrenheit");
        System.out.println("-------------------------------------------------");
        System.out.println("Choisissez le mode de conversion : ");
        System.out.println("1 - Convertisseur Celsius - Fahrenheit");
        System.out.println("2 - Convertisseur Fahrenheit - Celsius");
        Scanner inp1 = new Scanner(System.in);        
        int nbl = inp1.nextInt();
        
        System.out.println("Temperature a convertir : ");
        Scanner tIN = new Scanner(System.in);
        double temp = tIN.nextDouble();
        double conv;
        
        if(nbl == 1){
            conv = ((temp * 9.0)/5.0) + 32.0;
            System.out.println(temp + " C correspond a : " + conv + " F.");
            
        }
        else if(nbl == 2){
            conv = (temp - 32.0) * 5.0 / 9.0;
            System.out.println(temp + " F correspond a : " + conv + " C.");
        }
        
        //TODO for lab
        /*
        write do while/while loop to allow additional entries
        Souhaitez-vous convertir une autre tempterature ? (o/n)
        Print only 2 # after decimal
        */
        
       
        
    }
    
}
