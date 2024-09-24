package bank2;

public class Customer {
    private int ID,phoneNumber;
    private String name, adress;

    public Customer (int id, int pn, String n, String ad){
        ID=id;
        phoneNumber=pn;
        name=n;
        adress=ad;    
    }

    public int getID (){
        return ID;
    }

    public int getPhone (){
        return phoneNumber;
    }

    public String getName (){
        return name;
    }

    public String getadress (){
        return adress;
    }
}