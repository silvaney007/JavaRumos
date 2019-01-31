package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data

public class Account {

    Agency  agency;
    Client client;
    String accManager;
    int accNumber;
    double balance;
    Date date;

    public Account(Agency agency, Client client) {
        this.agency = agency;
        this.client = client;
    }
}