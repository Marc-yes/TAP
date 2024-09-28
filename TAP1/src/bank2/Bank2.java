package bank2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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

    public String showAccounts(){
        String text="";
        for(int i=0; i<accounts.size(); i++){
            text= text+accounts.get(i).toString()+"\n";
        }
        return text;
    }

    /**The next method will deposit 300€ to a random account,
     * wich will be chosed by a random generated number.
     * 
     * @pram randAccount is the random generated number
     * 
    */
    public void lotery(){
        Random random = new Random();
        int randAccount=random.nextInt(accounts.size());
        
        accounts.get(randAccount).depositMoney(300);
    }
    
}
