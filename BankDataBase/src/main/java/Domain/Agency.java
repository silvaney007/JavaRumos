package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Agency{

    static int id;
    int agencyId;
    String address;
    List<Client> client;
    List<Account> clientAccounts;
    int clientAccId;

    public Agency(String address) {
        this.agencyId = id++;
        this.address = address;
    }
}
