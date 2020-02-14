package entities;


public class Account {
    
    private Integer number;
    private Double holder;
    protected Double balance;
    
    public Account(){
        
    }

    public Account(Integer number, Double holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    
    
    

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getHolder() {
        return holder;
    }

    public void setHolder(Double holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

   public void withdraw(double amount){
       balance -= amount;
   }
   
   public void deposit(double amount){
       balance += amount;
   }
    
    

}
