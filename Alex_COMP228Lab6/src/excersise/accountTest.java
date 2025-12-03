package excersise;
import java.util.*;
import java.util.concurrent.*;

public class accountTest {
    public static void main(String[] args){
        account account = new account(500);
        ArrayList<transaction> list = new ArrayList<>();
        list.add(new transaction(account, "deposit",100));
        list.add(new transaction(account, "deposit",120));
        list.add(new transaction(account, "withdraw",200));
        list.add(new transaction(account, "withdraw",900));
        list.add(new transaction(account, "endBalance", 0));
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (transaction t: list){
            executor.execute(t);
        }
        executor.shutdown();

    }
}
