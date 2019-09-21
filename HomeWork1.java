/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Scanner;
/**
 *
 * @author sao_7
 */
public class HomeWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1
    //Cilveks ievada 5 skaitlus
    //mes atrodam lielako skaitli
    //ievade notiek for cikla
    //hint- skaitli, kur mums glabajas lielakais
    //ieksa cikla bus ari if, kas parbauda, vai tikko ievaditais
    //ir lielaks par pedejo lielako ievadito skaitli
    //special case- ja visi skaitli ir negativi
    
        
        
        Scanner sc = new Scanner(System.in);       
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ievadiet skaitli: ");
            int a = sc.nextInt();
            System.out.println("Ievadiet skaitli: ");
            int b = sc.nextInt();
            System.out.println("Ievadiet skaitli: ");
            int c = sc.nextInt();
            System.out.println("Ievadiet skaitli: ");
            int d = sc.nextInt();
            System.out.println("Ievadiet skaitli: ");
            int e = sc.nextInt();            
            
                if ((a > b && a > c && a > d && a > e)) {
                    System.out.println(a + " ir lielakais skaitlis ");
                }
                else if ((b > a && b > c && b > d && b > e)){
                    System.out.println(b + " ir lielakais skaitlis ");
                }
                else if ((c > a & c > b & c > d && c > e)){
                    System.out.println(c + " ir lielakais skaitlis ");
                }
                else if ((d > a & d > b & d > c && d > e)){
                    System.out.println(d + " ir lielakais skaitlis ");
                }
                else if ((e > a && e > b && e > c && e > d))
                    System.out.println((e + " ir lielakais skaitlis "));                                      
                    
                }
            }
//1 zadanie    
//public static void biggestNumber(){
        //Scanner sc = new Scanner(System.in);
        //int biggest = Integer.MIN.VALUE;
        //for(int i = 0; i<5; i++){
            //System.out.println("Ievadiet skaitli");
            //int number = sc.nextInt();
            //if(number > biggest){
                //biggest = number;
            //}
        //}
    //}
    //System.out.println("Lielakais skaitlis ir" + biggest);

    
    //2 zadanie
    //public static void kapinasana(){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Ievadiet skaitli, kuru kapinat");
        //int base = sc.nextInt();
        //System.out.println("Ievadiet pakapi");
        //int pow = sc.next.Int();
        //int result = 1;
        //for(int i = 0; i < pow; i++){
            //result = result * base;
        //}
        //System.out.println("Rezultats ir " + result);
    }
    
    
        
    
    
    
