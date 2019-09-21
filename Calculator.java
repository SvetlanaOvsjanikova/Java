/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author sao_7
 */
public class Calculator {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int number1 = getInt();
    int number2 = getInt();
    char operation = getOperation();
    int result = calc(number1, number2, operation);
    System.out.println("Rezultats ir: " + result);
    }
    
    public static int calc (int number1, int number2, char operation){
        int result;
        switch (operation){
            case '+':
                result = number1 + number2;
            break;
            case '-':
                result = number1 - number2;
            break;
            case '*':
                result = number1 * number2;
            break;
            case '/':
                result = number1 / number2;
            break;
            default:
                System.out.println("Nepareizi ievaditi dati, pameginiet velreiz!");
                result = calc(number1, number2, getOperation());
        }
        return result;
    }

    public static int getInt() {
        System.out.println("Ievadiet skaitli: ");
        int number;
        if (sc.hasNextInt()){
            number = sc.nextInt();          
        }
        else{ 
            System.out.println("Nepareizi ievaditi dati, pameginiet velreiz!");
            sc.next();
            number = getInt();
        }
        return number;
    }
    
    public static char getOperation(){
        System.out.println("Ievadiet darbibu: ");
        char operation;
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);            
        }
        else    
        {
            System.out.println("Nepareizi ievaditi dati, pameginiet velreiz!");
            sc.next();
            operation = getOperation();
        }
        return operation;
    }
    
        
    
}
