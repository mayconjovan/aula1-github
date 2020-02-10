package application;

import java.util.Locale;
import java.util.Scanner;
import utils.Calculadora;



public class FourthProgram {
    
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor do raio: ");
        double raio = sc.nextDouble();
        double c = Calculadora.circunferencia(raio);
        
        double v = Calculadora.volume(raio);
        
        System.out.printf("Circunferencia: %.2f%n", c );
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculadora.PI);       
        
        
        sc.close();
        
    }
    
   
}
