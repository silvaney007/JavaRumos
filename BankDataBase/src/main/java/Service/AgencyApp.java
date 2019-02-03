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

    public Account openAccount(Client client, Account  account) {


        if (client.getAccount() == null || client.getAccount().isEmpty()) {
            client.setAccount(new ArrayList<Account>());
        }
        //Account account = new Account(client);                  //create new account
        client.getAgency().getAccounts().add(account);          //assign agency account
        client.getAccount().add(account);                       //assign client account

        return account;
    }

    public Client registerClient (Agency agency, Client client){
        //add client to agency
        if (agency.getClient() == null || agency.getClient().isEmpty()) {
            agency.setClient(new ArrayList<Client>());
        }
        agency.getClient().add(client);                         //assign agency client
        client.setAgency(agency);                               //assign client agency

        return client;
    }
}
