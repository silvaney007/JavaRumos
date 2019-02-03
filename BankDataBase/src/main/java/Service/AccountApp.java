package Service;

import Domain.Account;
import Domain.BankCard;
import Domain.Client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class AccountApp {

    Date date = new Date();

    public void transfer(BankCard card, Account accountB, double transation) {

        double balance = card.getBalance();
        if (card.getAccount() != accountB && balance >= transation) {
            card.setBalance(balance-transation);
            card.getAccount().setBalance(card.getBalance());
            accountB.setBalance((accountB.getBalance() + transation));
        } else {
            System.out.println("Invalid Operation\n");
        }
    }

    public void deposit(BankCard card, double trasation) {
        double balance = card.getBalance();
        card.setBalance(balance);
        card.getAccount().setBalance(card.getBalance());
    }

    public double withdraw(BankCard card, double transation) {
        double balance = card.getBalance();
        if (balance >= transation) {
            card.setBalance(balance-transation);
            card.getAccount().setBalance(card.getBalance());
            return transation;
        } else {
            return -1.0;
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

    public void CardTransation(BankCard card, double transation){
        Scanner sc  = new Scanner(System.in);
        int op = sc.nextInt();
        switch (op){
            case 1 : deposit(card,transation);
            break;
            case 2 : withdraw(card,transation);
            break;
            default: System.exit(0);
        }
    }
}
