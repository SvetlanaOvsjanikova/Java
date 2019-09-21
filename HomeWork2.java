/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;
/**
 *
 * @author sao_7
 */
public class HomeWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2
    //Cilveks ievada skaitli, kuru kapinat
    //Cilveks ievada pakapi
    //ar for ciklu kapinam
    
    //TEST-
    //cilveks ievada 2
    //cilveks ievada pakapi = 3
    //2*2*2
    //rezultats ir 8
    
    //hint - lidzigi ka faktorialis
    Scanner sc = new Scanner(System.in);
    System.out.println("Ievadiet skaitli:");
        int number = sc.nextInt();
        
        System.out.println("Ievadiet pakapi:");
        int numberTwo = sc.nextInt();        
        
        for (int i = 0; i <= 0; i++) {
            double result = 1;
            result = Math.pow(number, numberTwo);
            System.out.println("Rezultats ir " + result);
        }
    }
    
}
