package bank2;

public class InvestFund extends Account{
    public InvestFund(Customer c, double b){
        super(c,b);
        interest = 0.34;
    }

    public void withdrawMoney(double quantity) throws NoMoney{
        throw new NoMoney("No es pot treure diners d'aquest compte");
    }
}
