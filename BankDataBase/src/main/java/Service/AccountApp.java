package Service;

import Domain.Account;
import Domain.BankCard;
import Domain.Client;


public class AccountApp {


    public double bankTransation(Client client, double transation) {
        return 2.0;
    }

    public Account orderAccount(Client client){

        BankCard card = new BankCard();
        card.setDebCard(true);
        client.getCard().add(card);
        Account account = new Account(client);
        client.getAccount().add(account);
        return account;
    }



}
