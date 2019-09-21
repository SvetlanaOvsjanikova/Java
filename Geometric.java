/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric;

/**
 *
 * @author sao_7
 */
public class Geometric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        
        //Прямоугольник 5 звездочек в 3 ряда
        for (int i = 0; i < 3; i++) { //количество рядов
            for (int j = 0; j < 5; j++) { //количество звезд
                System.out.print("* ");
            }
            System.out.println();
        }
        
        int rectangle = 5;
        
        //Прямоугольник с 10 плюсами в 3 ряда
        for (int i = 2; i < rectangle; i++) { //количество рядов
            for (int j = -5; j < rectangle; j++) { //количество плюсов
                System.out.print("+");
            }
            System.out.println("*");
        }
        
        //1-ый вариант Прямоугольного треугольника
        for (int i = 0; i < rectangle; i++) { //количество рядов
            for (int j = i; j < rectangle; j++) { //количество плюсов
                System.out.print("+");
            }
            System.out.println(" *" + i);
        }
        
        //2-ой вариант Прямоугольного треугольника
        for (int i = 0; i < rectangle; i++) {
            for (int j = rectangle; j > i; j--) {
                System.out.print("+");
            }
            System.out.println(" *" + i);
        }
        
        //3-ий вариант Прямоугольного треугольника
        for (int i = rectangle; i >= 0; i--) {
            for (int j = i; j <= rectangle; j++) {
                System.out.print("+");
            }
            System.out.println(" *" + i);
        }
        
        //4-ый вариант Прямоугольного треугольника
        for (int i = rectangle; i >= 0; i--) {
            //левое пустое пространство
            for (int j = i; j <= rectangle; j++) {
                System.out.print("+");
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print("-");
                }
            }
            //левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print(" ");
            }
            System.out.println(" *" + i);
        }
        
        //1-й вариант Треугольника
        for (int i = 0; i <= rectangle; i++) {
            //левое пустое пространство
            for (int j = rectangle; j > i; j--) {
                System.out.print(" ");
            }
            //левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++) { //здесь можно изменить счетчик или поставить равенство
                //с внешним счетчиком чтобы пирамидка была треугольная
                System.out.print("+");
            }
            //правая часть треугольника
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            //правое пустое пространство
            for (int j = rectangle; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("*" + i);
        }
        
        //1-й вариант ромба
        for (int i = 0; i < rectangle; i++) {
            //левое пустое пространство
            for (int j = rectangle; j > 1; j--) {
                System.out.print(" ");
            }
            //левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++) { //здесь можно изменить счетчик или поставить равенство
                //с внешним счетчиком чтобы пирамида была остроугольная
                System.out.print("+");                
            }
            //правая часть треугольника
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            //правое пустое пространство
            for (int j = rectangle; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("*" + i);
        }
        for (int i = rectangle; i >= 0; i--) { //заменили всего одну строку и поменяли знак >= чтобы ромб был острый
            //левое пустое пространство
            for (int j = rectangle; j > 1; j--) {
                System.out.print(" ");
            }
            //левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++) { //здесь можно изменить счетчик или поставить равенство
                //с внешним счетчиком чтобы пирамида была остроугольная
                System.out.print("+");                
            }
            //правая часть треугольника
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            //правое пустое пространство
            for (int j = rectangle; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("*" + i);
        }        
    }
    
}
