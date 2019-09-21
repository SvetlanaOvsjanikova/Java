/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sao_7
 */
public class tasks {
    
    private ArrayList<String> nameList = new ArrayList<String>();
    
    public void menu(){
        
        String choice = "";
        Scanner sc = new Scanner(System.in);
        
        while(!choice.equals("exit")){
            System.out.println("1: izvadit sarakstu");
            System.out.println("2: pievienot jaunu elementu");
            System.out.println("3: dzest elementu");
            System.out.println("4: rediget elementu");
            System.out.println("exit: iziet");
            
            System.out.println("Ievadiet izvelni-");
            choice = sc.next();
            
            switch(choice){
                case "1":
                    printList();
                    break;
                case "2":
                    addToList();
                    break;
                case "3":
                    deleteFromList();
                    break;
                case "4":
                    editList();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Ievade nepareiza!");
            }
        }
    }
    //1) izvadit sarakstu
    private void printList(){
        if (nameList.isEmpty()) {
            System.out.println("Saraksts ir tukss");
        }
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println("Indekss: " + i + ", elements: " + nameList.get(i));
        }
        System.out.println("");
    }
    
    //2) pievienot jaunu elementu
    private void addToList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet elementu, ko velaties pievienot");
        String element = sc.next();
        
        nameList.add(element);
    }
    
    //3) dzest elementu
    private void deleteFromList(){
        int index = inputListIndex();
        
        if (index > -1 && index < nameList.size()) {
            nameList.remove(index);
        }else{
            System.out.println("Nepareizi ievade!");
        }
    }
    
    //4) rediget elementi (pec indeksa)
    private void editList(){
        int index = inputListIndex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet jaunu vertibu");
        String changed = sc.next();
        
        if (index > -1 && index < nameList.size()) {
            nameList.set(index, changed);
        }else{
            System.out.println("Nepareizi ievade!");
        }
    }
    //5) iziet no programmas
    
    private int inputListIndex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet saraksta elementu-");
        int index = sc.nextInt();
        
        return index;
    }

    //String list
    //Validacija - .isEmptty() metode
}
