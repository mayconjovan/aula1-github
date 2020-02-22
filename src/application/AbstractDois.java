/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Deivinson
 */
public class AbstractDois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes:");

        List<Shape> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("Rectangle or circle? (r/c)");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)");
            Color color = Color.valueOf(sc.next());
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(width, height, color));
            }else{
                System.out.println("radius");
                double radius = sc.nextDouble();
                list.add(new Circle(radius, color));
            }
        }
        
        System.out.println();
        System.out.println("Shape areas: ");
        
        for (Shape shape : list) {
            System.out.printf(String.format("%.2f", shape.area()));
        }

        sc.close();

    }

}
