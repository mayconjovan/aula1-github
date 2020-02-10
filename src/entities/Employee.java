package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    
    
    public void netSalary(){
        
    }
    
    public double increaseSalary(double percent){
        return grossSalary = grossSalary * percent / 100;
        
    }
    
    
}
