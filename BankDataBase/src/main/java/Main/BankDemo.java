package Main;

import Domain.*;
import Service.AccountApp;
import Service.AgencyApp;
import com.github.javafaker.Faker;
import java.util.Scanner;

public class BankDemo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;
        Client newClient;
        Faker faker = new Faker();
        AgencyApp agencyService = new AgencyApp();
        AccountApp accountService = new AccountApp();
        int op=0;

        Agency novoBanco = new Agency(faker.address().fullAddress());

        System.out.println("Criar uma conta");

        System.out.print("Nome: ");
                String clientName = sc.nextLine();
        System.out.print(" BI Identificação: ");
                String clientId = sc.nextLine();
        System.out.print("Telefone: ");
                String clientPhone = sc.nextLine();
        System.out.print("Email: ");
                String clientMails = sc.nextLine();
        System.out.print("Trabalho: ");
                String clientJob = sc.nextLine();

                Client novo = new Client(clientName, clientId, clientPhone, clientMails, clientJob);
                newClient = agencyService.registerClient(novoBanco, novo);
                account = accountService.orderAccount(newClient);

        while (op != 7) {

                    System.out.println("***opçoes do cliente***");
                    System.out.println(" 1 - Consultar saldo");
                    System.out.println(" 2 - Fazer deposito");
                    System.out.println(" 3 - Fazer levantamento");
                    System.out.println(" 4 - Fazer transferencia");
                    System.out.println(" 5 - Informação da conta");
                    System.out.println(" 6 - Listar cartoes");
                    System.out.println(" 7 - Sair");
                    System.out.print("O que deseja fazer: ");

                    op = sc.nextInt();

                        switch (op) {
                            case 1:
                                System.out.println("O seu saldo actual é: " + account.getBalance());
                                System.out.println();
                                break;
                            case 2:
                                System.out.print("Valor a depositar: ");
                                double vd = sc.nextDouble();
                                accountService.deposit(account.getCard(), vd);
                                System.out.println();
                                break;
                            case 3:
                                System.out.print("Valor a levantar: ");
                                double vw = sc.nextDouble();
                                accountService.withdraw(account.getCard(), vw);
                                System.out.println();
                                break;
                            case 4:
                                System.out.print("Valor a transferi: ");
                                double vt = sc.nextDouble();
                                Account accountb = new Account();
                                accountService.transfer(account.getCard(), accountb, vt);
                                System.out.println();
                                break;
                            case 5:
                                System.out.println(account.getClient().toString());
                                System.out.println();
                                break;
                            case 6:
                                 for (BankCard cards : account.getClient().getCard()) {
                                System.out.println("Lista de cartoes: " + cards.toString());
                                }
                                break;
                        }
                    }
                }
            }
