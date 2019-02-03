package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BankCard {

    static int id;
    int cardNumber;
    boolean credCard;
    boolean debCard;

     public BankCard (){
        this.cardNumber = id++;
    }

    public void setCredCard(boolean credCard) {
            this.credCard = credCard;
            this.debCard = false;
    }

    public void setDebCard(boolean debCard) {
        this.debCard = debCard;
        this.credCard =false;
    }
}
