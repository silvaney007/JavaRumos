package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor

public class Client {

    Agency agency;
    List<Account> account;
    List<BankCard> card;
    String clientName;
    String clientId;
    String clientPhone;
    String clientMails;
    String clientJob;
    int clientAgencyId;


    public Client(String clientName, String clientId, String clientPhone, String clientMails, String clientJob) {
        this.clientName = clientName;
        this.clientId = clientId;
        this.clientPhone = clientPhone;
        this.clientMails = clientMails;
        this.clientJob = clientJob;
    }

    @Override
    public String toString() {
        return "Client{" +
                ", clientName='" + clientName + '\'' +
                ", clientId=" + clientId +
                ", clientPhone=" + clientPhone +
                ", clientMails='" + clientMails + '\'' +
                ", clientJob='" + clientJob + '\'' +
                ", agency=" +  agency +
                ", account=" + account +
                '}';
    }
}