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

    public Client registerClient (Agency agency, Client client){
        //add client to agency
        if (agency.getClient() == null || agency.getClient().isEmpty()) {
            agency.setClient(new ArrayList<Client>());
        }
        agency.getClient().add(client);                         //assign agency client
        agency.addClientAgencyId(client);                       //set client agency ID
        client.setAgency(agency);                               //assign client agency

        return client;
    }
}
