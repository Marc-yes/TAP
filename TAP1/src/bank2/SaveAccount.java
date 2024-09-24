package bank2;

public class SaveAccount extends Account {
    public SaveAccount(Customer c, double b){
        super(c,b);
        interest=0.2;
    }
    
}
