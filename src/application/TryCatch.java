/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Deivinson
 */
public class TryCatch {

    public static void main(String[] args) {
        method1();
        System.out.println("End of programa");
    }
    
    public static void method1(){
        System.out.println("METODO 1");
        method2();
        System.out.println("fim metodo 1");
    }
    
    public static void method2() {
        System.out.println("***METODO 2 STRAT****");
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");
        try {
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("***METHODO 2 END***");
    }

}
