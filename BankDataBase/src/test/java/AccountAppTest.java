import Domain.*;
import Service.AccountApp;
import Service.AgencyApp;
import com.github.javafaker.Faker;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AccountAppTest {

    @Test
    public void openOrderAccount_returnsWithValidOrderAccount() {
 Faker faker = new Faker();

 //behind desk work done by AgencyApp and AccountApp
 AgencyApp agencyService = new AgencyApp();
 AccountApp accountService = new AccountApp();

        //Cristiano Ronaldo
        Client cr7 = new Client("Cristiano Ronaldo",faker.idNumber().ssnValid(),faker.phoneNumber().cellPhone(),
                faker.internet().emailAddress(),faker.job().title());
        Agency novoBanco = new Agency(faker.address().fullAddress());

// register client to agency
 Client cr7client = agencyService.registerClient(novoBanco, cr7);

 // create new order account
 Account account = accountService.orderAccount(cr7client);
 assertThat(cr7client.getAccount()).containsExactly(account);
 assertThat(cr7client.getAgency()).isEqualTo(novoBanco);
   BankCard card = account.getCard();

   //deposit 800 to account and withdraw 250
   accountService.deposit(card, 800.0);
   System.out.println("Deposit 800 "+ " Balance=" + account.getBalance());
   accountService.withdraw(card, 250.0);
   System.out.println("Withdraw 250"+ " balance= " + account.getBalance());
   System.out.println("Client Account "+ cr7client.toString());
    }
    }