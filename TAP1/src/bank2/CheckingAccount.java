package bank2;

public class CheckingAccount extends Account {
    public CheckingAccount(Customer c, double b){
        super (c, b);
        interest=0.1;
        comission=0;
    }
    
}
