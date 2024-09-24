package bank2;

public class UseBank2 {
    public static void main(String[] args) {
        Customer cust1=new Customer(1010, 9999, "Marc", "Marc@");
        Customer cust2=new Customer(1111, 8888, "Javi", "Javi@");
        Customer cust3=new Customer(1212, 7777, "Laura", "Laura@");

        Account ac1=new CheckingAccount(cust1, 200);
        Account ac2=new BonusAccount(cust2, 0);
        Account ac3=new InvestFund(cust3, 1000);
        //Account ac4=new Account(cust3, 1000);

        Bank2 bank2=new Bank2("Bank");

        bank2.addAccount(ac1);
        bank2.addAccount(ac2);
        bank2.addAccount(ac3);

        bank2.addCustomer(cust1);
        bank2.addCustomer(cust2);
        bank2.addCustomer(cust3);

        try{
            ac3.withdrawMoney(200);
        }catch (Exception e){
            e.toString();
        }

        try{
            ac2.withdrawMoney(10);

        }catch (Exception e){
            e.toString();
        }
        
        System.out.println("Balanç ac1: "+ ac1.getbalance());
        ac1.monthRevision();
        System.out.println("Balanç ac1 despres de revisió mensual: "+ ac1.getbalance());

    }
}
