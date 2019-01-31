package Service;
import Domain.Bank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class BankApp {

    List<Bank> bankDatabase = new ArrayList<Bank>();

    public List<Bank> getBankDatabase() {
        return bankDatabase;
    }

    public Bank registerBank (Bank bank){
        this.bankDatabase.add(bank);
        return bank;
    }
}
