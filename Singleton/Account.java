/*
 * Observer/Observable pattern would be used to implement that aspect of the program.
 * This design pattern makes sure that every time the file is updated, the program
 * is notified.
 */
import java.util.HashMap;

public class Account{
    private volatile static Account uniqueInstance;
    private static HashMap<String, String> hashmap;
    
    private Account(){
        hashmap = new HashMap<String, String>();
    }

    public static Account getInstance(){
        if(uniqueInstance == null){
            synchronized (Account.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Account();
                }
            }
        }
        return uniqueInstance;
    }
    
    public void add(String account, String password){
        if(!hashmap.containsKey(account)){
            hashmap.put(account, password);
        }
        else{
            hashmap.remove(account);
            hashmap.put(account, password);
        }
    }

    public void remove(String account){
        if(hashmap.containsKey(account)){
            hashmap.remove(account);
        }
    }

    public String get(String account){
        if (!hashmap.containsKey(account)){
            return null;
        }
        else return hashmap.get(account);
    }
}
