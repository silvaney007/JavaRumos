package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@Data
public class Agency{

    String address;
    List<Client> client;
    static int id1, id2=10;
    int agencyId;

    public Agency(String address) {
        this.address = address;
        this.agencyId = ++id1;

    }

    public void addClientAgencyId(Client client){
       client.clientAgencyId = ++id2;
    }



    @Override
    public String toString() {
        return "Agency{" +
                "address='" + address + '\'' +
                ", agencyId=" + agencyId +
                '}';
    }
}
