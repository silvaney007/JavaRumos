package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
@AllArgsConstructor
@Data

public class Account {

    Client client;
    String accManager;
    double balance;
    int accNumber;
    static int id;
    Date date=new Date();

    public Account(Client client) {
        this.client = client;
        this.accNumber=id++;
        date.getDate();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accManager='" + accManager + '\'' +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
}