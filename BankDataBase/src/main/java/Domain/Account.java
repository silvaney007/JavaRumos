package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.smartcardio.Card;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data

public class Account {

    Client client;
    BankCard card;
    String accManager;
    double balance;
    int accNumber;
    static int id = 100;
    Date date=new Date();

    public Account(Client client) {
        this.client = client;
        this.accNumber=id++;
        date.getDate();
    }

    @Override
    public String toString() {
        return "Account{" +
                ", accNumber=" + accNumber +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
}