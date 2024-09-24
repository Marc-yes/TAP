package bank2;

import java.util.LinkedList;
import java.util.List;

public class Bank2 {
    private String name;
    private List<Customer> customers = new LinkedList<Customer>();
    private List<Account> accounts = new LinkedList<Account>();

    public Bank2(String bankName){
        name=bankName;
    }

    public String getName(){
        return name;
    }

    public void addCustomer(Customer newCust){
        customers.add(newCust);
    }

    public void  addAccount(Account newAcount){
        accounts.add(newAcount);
    }

    public void monthRevision(){
        for(int i=0; i<accounts.size(); i++){
            accounts.get(i).monthRevision();
        }
    }
    
}
