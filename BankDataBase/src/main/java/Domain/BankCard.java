package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BankCard {

    int cardNumber;
    Client client;
}
