package bank2;

public class NoMoney extends Exception {
    public NoMoney(String message){
        System.out.println(message);
    }
}
