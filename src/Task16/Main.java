package src.Task16;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(1, "BY01", "BYN", 1000.0);
        Account a2 = new Account(2, "BY02", "BYN", 500.0);
        Account a3 = new Account(3, "BY03", "BYN", 200.0);
        Account a4 = new Account(4, "BY04", "BYN", 1500.0);
        Account a5 = new Account(5, "BY05", "BYN", 300.0);

        Set<Account> accounts = new HashSet<>();
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);
        accounts.add(a4);
        accounts.add(a5);

        Bank bank = new Bank(accounts);

        try {
            bank.transferMoney("BY01", "BY02", 200.0);
            System.out.println("Перевод выполнен успешно.");
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо,что вопользовались услугами банка");
        }

        System.out.println("\nСостояние счетов после операции:");
        for (Account account : bank.getAccounts()) {
            System.out.println(account);
        }
    }
}