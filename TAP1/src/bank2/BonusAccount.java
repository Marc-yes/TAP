package bank2;

public class BonusAccount extends Account {
    public BonusAccount(Customer c, double b){
        super(c,b);
        interest = 0.6;
    }
}
