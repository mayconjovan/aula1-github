/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deivinson
 */
public class Abstract {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1002, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1002, "Ana", 500.0, 500.0));
        
        
        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }
        System.out.printf("Total Balance: %.2fn", sum);
        
        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
        
        
    }
    
}
