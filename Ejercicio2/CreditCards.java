import java.util.*;

public class CreditCards {
    private Long number;
    private Integer cvv;
    private Date expiryDate;

    public CreditCards( Long number, Integer cvv, Date expiryDate){
        this.number = number;
        this .cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public Long getNumber() {
        return this.number;
    }

    public Integer getCvv() {
        return this.cvv;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }
}
