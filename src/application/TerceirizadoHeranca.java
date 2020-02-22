/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Employeer;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Deivinson
 */
public class TerceirizadoHeranca {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employeer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Funcionário é terceirizado? (y/n)");
            char cn = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.nextLine();
            sc.nextLine();            
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(cn == 'y') {
                System.out.println("Additional Charge");
                double  additionalCharge = sc.nextDouble();                
                list.add(new OutsourcedEmployee(additionalCharge, name, hours, valuePerHour));
            }else{
                list.add(new Employeer(name, hours, valuePerHour));
            }
        }
        
        System.out.println();
        System.out.println("Payments: ");
        
        for (Employeer emp : list){
            System.out.println(emp.getName() + " - $ " +String.format("%.2f", emp.payment()));
        }
        
        sc.close();

    }

}
