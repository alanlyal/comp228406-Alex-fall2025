package excersise;

public class account {
    private double balance;
    public account(double balance){
        this.balance = balance;
    }
    public synchronized void deposit(double amount){
        balance += amount;
        System.out.println("deposit: "+ amount +"$" +"|balance " + balance +"$");
    }
    public synchronized void withdraw(double amount){
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println("withdraw: "+ amount +"$" +"|balance " + balance +"$");
        }else {
            System.out.println("widthdraw of "+ amount +"$ failed as you dont have the funds");
        }
    }
    public synchronized double getBalance()
    {
        return balance;
    }
}
