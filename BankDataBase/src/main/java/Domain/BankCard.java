package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BankCard {

    static int id;
    int cardNumber;
    Account account;
    double plafond;


    public BankCard(Account account){
        this.cardNumber = id++;
        this.account = account;
    }
}
