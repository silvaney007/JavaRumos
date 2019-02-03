package Service;

import Domain.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AgencyApp {

    public BankApp bankService = new BankApp();


    public List<Agency> setBankAgencies(Bank bank, Agency agency) {

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
        if (client.getAccount() == null || client.getAccount().isEmpty()) {
            client.setAccount(new ArrayList<Account>());
        }
        if (agency.getAccounts() == null || agency.getAccounts().isEmpty()) {
            agency.setAccounts(new ArrayList<Account>());
        }
        agency.getClient().add(client);                         //assign agency client
        client.setAgency(agency);                               //assign client agency
        Account account = new Account(client);                  //create new account
        agency.getAccounts().add(account);                      //assign agency account
        client.getAccount().add(account);                        //assign client account

        return account;
    }
}
