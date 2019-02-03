package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor

public class Bank {

    String bankName;
    List<Agency> agencies;
    static int id;
    int agencyId;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
        this.agencyId = id++;
    }
}
