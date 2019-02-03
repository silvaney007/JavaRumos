package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BankCard {

    static int id;
    int cardNumber;
    Account account;
    double balance;
    double plafond;


    public BankCard(Account account){
        this.cardNumber = id++;
        this.account = account;
        this.balance = account.getBalance();
    }
}
