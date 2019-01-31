package Service;

import Domain.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AgencyApp {

    public BankApp bankService = new BankApp();


    public List<Agency> setBankAgencies(Bank bank, Agency agency){

        if (bank.getAgencies() == null || bank.getAgencies().isEmpty()) {
            bank.setAgencies(new ArrayList<Agency>());
        }

        bank.getAgencies().add(agency);

        bankService.registerBank(bank);
        return bank.getAgencies();
    }

    public Account openAccount(Agency agency, Client client) {

        //add client to agency
        if (agency.getClient() == null || agency.getClient().isEmpty()) {
            agency.setClient(new ArrayList<Client>());
        }
        agency.getClient().add(client);
        client.setAgency(agency);
        Account account = new Account(agency, client);
        if (client.getAccount() == null || client.getAccount().isEmpty()) {
            client.setAccount(new ArrayList<Account>());
        }
            client.getAccount().add(account);

        return account;
    }

    public void setNormalAccount(Account account, BankCard card){
        account.getClient().getCard().add(card);
    }

    public void setVipAccount(Account account, BankCard card, String manager){
        account.setAccManager(manager);
        account.getClient().getCard().add(card);
    }

}
