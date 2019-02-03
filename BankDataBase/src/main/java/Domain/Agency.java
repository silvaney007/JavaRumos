package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Agency{

    String address;
    List<Client> client;
    List<Account> accounts;
    int clientAgencyId;
    static int id1;
    public Agency(String address) {
        this.address = address;
    }

    public void setClient(List<Client> client) {
        this.client = client;
        this.clientAgencyId = id1++;
    }

    @Override
    public String toString() {
        return "Agency{" +
                ", address='" + address + '\'' +
                ", clients=" + client+
                '}';
    }

}
