package entities;


public class BusinessAccount extends Account {
    
    private Double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(Double loanLimit, Integer number, Double holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}
