package Service;

import Domain.Account;
import Domain.BankCard;
import Domain.Client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class AccountApp {

    Date date = new Date();

    public boolean transfer(BankCard card, Account accountB, double transation) {

        double balance = card.getAccount().getBalance();
        if (card.getAccount() != accountB && balance >= transation) {
            card.getAccount().setBalance(balance-transation);
            accountB.setBalance((accountB.getBalance() + transation));
            return true;
        } else {
            return false;        }
    }

    public void deposit(BankCard card, double trasation) {
        double balance = card.getAccount().getBalance();
        card.getAccount().setBalance(balance+trasation);
    }

    public boolean withdraw(BankCard card, double transation) {
        double balance = card.getAccount().getBalance();
        if (balance >= transation) {
            card.getAccount().setBalance(balance-transation);
            return true;
        } else {
            return false;
        }
    }

    public Account orderAccount(Client client, List<BankCard> plusCards) {

        Account account = new Account(client);                  //create new account
        BankCard card = debCard(account);                      //create and assign card to account
        account.setCard(card);

        if (client.getAccount() == null || client.getAccount().isEmpty()) {
            client.setAccount(new ArrayList<Account>());
        }
        if (client.getCard() == null || client.getCard().isEmpty()) {
            client.setCard(new ArrayList<BankCard>());
        }
        client.getAccount().add(account);                       //assign client account
        client.getCard().add(card);                             //assign client card
        for (BankCard plusCard : plusCards) {                   //add more cards to client
            client.getCard().add(plusCard);
        }
        return account;
    }

    public Account orderAccount(Client client) {

        Account account = new Account(client);                  //create new account
        BankCard card = debCard(account);                      //create and assign card to account
        account.setCard(card);

        if (client.getAccount() == null || client.getAccount().isEmpty()) {
            client.setAccount(new ArrayList<Account>());
        }
        if (client.getCard() == null || client.getCard().isEmpty()) {
            client.setCard(new ArrayList<BankCard>());
        }
        client.getAccount().add(account);                       //assign client account
        client.getCard().add(card);                             //assign client card
        return account;
    }


    public BankCard credCard(Account account) {
        BankCard card = new BankCard(account);
        card.setPlafond(500);
        return card;
    }

    public BankCard debCard(Account account) {
        BankCard card = new BankCard(account);
        card.setPlafond(0.0);
        return card;
    }
}
