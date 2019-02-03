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
    static int id1, id2;
    int agencyId;

    public Agency(String address) {
        this.address = address;
        this.agencyId = id1++;

    }

    public void setClient(List<Client> client) {
        this.client = client;
        this.clientAgencyId = id2++;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "address='" + address + '\'' +
                ", agencyId=" + agencyId +
                '}';
    }
}
