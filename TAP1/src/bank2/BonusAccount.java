package bank2;

public class BonusAccount extends Account {
    public BonusAccount(Customer c, double b){
        super(c,b);
        interest = 0.6;
    }

    /*
    public String toString(){
        String text=super.toString()+"\nTipo: BA\n\n";
        return text;
    }
    */
}
