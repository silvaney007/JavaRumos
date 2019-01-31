package Service;

import Domain.Account;

public class AccountApp {


   public double bankTransation(Account account, double transation) {

        account.getDate();
        account.getClient().getCard();
        if (transation <= account.getBalance())
        return (transation + account.getBalance());

        return account.getBalance();
    }




}
