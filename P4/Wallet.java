package P4;

public class Wallet {
    private String user;
    private String key;
    private Integer balance;

    public Wallet(String user, String key, Integer balance) {
        this.user = user;
        this.key = key;
        this.balance = balance;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

}
