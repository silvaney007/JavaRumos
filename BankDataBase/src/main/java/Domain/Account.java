package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;


@AllArgsConstructor
@Data

public class Account {

    Client client;
    BankCard card;
    String accManager;
    double balance;
    int accNumber;
    static int id = 100;
    LocalDateTime date;

    public Account(Client client) {
        this.client = client;
        this.accNumber= ++id;
        this.date = LocalDateTime.now();
    }

    public Account(){
        this.accNumber= ++id;
        this.date = LocalDateTime.now();

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