package bank2;

public abstract class Account {
    private Customer user;
    private double balance;
    protected double comission=10;
    protected double interest;
    
    public Account (Customer us, double b){
        user=us;
        balance=b;
    }

    public double getbalance(){
        return balance;
    }

    public Customer getOwner() {
        return user;
    }

    public void depositMoney(double dep){
        balance=balance+dep;
    }

    public void withdrawMoney(double quantity) throws NoMoney{
        if (quantity<=balance){
            balance= balance-quantity;
        }
        else throw new NoMoney("No hi ha suficients diners");
    }

    public void changeClient(Customer us){
        user=us;
    }

    public void monthRevision(){
        balance = balance + balance * interest - comission;
    }
}
