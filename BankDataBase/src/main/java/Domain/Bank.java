package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor

public class Bank {

    String bankName;
    List<Agency> agencies;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

}
