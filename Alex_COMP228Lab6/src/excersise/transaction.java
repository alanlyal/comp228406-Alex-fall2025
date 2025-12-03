package excersise;

public class transaction implements Runnable
{
    private account account;
    private String transType;
    private  double amount;
    public transaction(account account, String transType, double amount){
        this.account=account;
        this.transType=transType;
        this.amount = amount;
    }
    @Override
    public void run()
    {
        if(transType.equals("deposit"))
        {
         account.deposit(amount);
        }
        else if (transType.equals("withdraw"))
        {
            account.withdraw(amount);
        }
        else if(transType.equals("endBalance"))
        {
            System.out.println("balance: " + account.getBalance() + "$");
        }
    }

}
