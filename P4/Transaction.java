package P4;

import java.util.*;


public class Transaction {
    private static int i = 1;
    private final int id;
    private String key1;
    private String key2;
    private Integer value;

    public Transaction(Wallet w1, Wallet w2, Integer value) {
        this.id = i++;
        this.key1 = w1.getKey();
        this.key2 = w2.getKey();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getKey1() {
        return key1;
    }
    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }
    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }

    
}