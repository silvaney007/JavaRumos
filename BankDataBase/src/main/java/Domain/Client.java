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
    int clientId;
    int clientPhone;
    String clientMails;
    String clientJob;

    public Client(String clientName, int clientId, int clientPhone, String clientMails, String clientJob) {
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
                ", account=" + account +
                '}';
    }
}