import Domain.*;
import Service.AgencyApp;
import com.github.javafaker.Faker;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AgencyAppTest {

        @Test
        public void newBank_addSingleAgency_returnSingleAgency(){

            Faker faker = new Faker();
            AgencyApp agencyService = new AgencyApp();
            Bank bank = new Bank(faker.company().name());
            Agency agency = new Agency(faker.address().fullAddress());

            agencyService.setBankAgencies(bank, agency);

            assertThat(bank.getAgencies()).containsExactly(agency);
        }


        @Test
        public void newBank_addMultipleAgency_returnAllAgencies(){

            Faker faker = new Faker();
            AgencyApp agencyService = new AgencyApp();
            Bank bank = new Bank(faker.company().name());
            Agency firstAgency = new Agency(faker.address().fullAddress());
            Agency secondAgency = new Agency(faker.address().fullAddress());

            agencyService.setBankAgencies(bank, firstAgency);
            agencyService.setBankAgencies(bank, secondAgency);

            assertThat(bank.getAgencies())
                    .containsExactly(new Agency[]{firstAgency, secondAgency});
        }


        @Test
        public void clientGoesToBankAgency_toOpenAccount_returnsWithValidAccount() {

            Faker faker = new Faker();

            //behind desk work done by AgencyService
            AgencyApp agencyService = new AgencyApp();

            //Cristiano Ronaldo
            Client cr7 = new Client("Cristiano Ronaldo",22,2589898,
                    "fvfdv@dvsdv","sdvdsf");
            Agency novoBanco = new Agency(faker.address().fullAddress());


            Account account = agencyService.openAccount(novoBanco, cr7);

            //ask Cristiano Ronaldo
            System.out.println("Client:" + cr7.toString());
            //System.out.println("Client Account:" + cr7.getAccount());
            Assertions.assertThat(cr7.getAccount()).containsExactly(account);

            //ask bank agency
            //System.out.println("Agency:" + novoBanco);
            //System.out.println("Agency Clients:" + novoBanco.getClient());
            //System.out.println("Agency Client Accounts:" + novoBanco.getClientAccounts());
        }
    }

