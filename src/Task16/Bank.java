package src.Task16;

import java.util.Optional;
import java.util.Set;

public class Bank {
    private Set<Account> accounts;

    public Bank(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account from = findAccountByNumber(accountNumberFrom);
        Account to = findAccountByNumber(accountNumberTo);

        if (from == null || to == null) {
            throw new AccountNotFoundException("not.found.account");
        }

        if (from.getAmount() < amount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }

        from.setAmount(from.getAmount() - amount);
        to.setAmount(to.getAmount() + amount);
    }

    private Account findAccountByNumber(String accountNumber) {
        Optional<Account> account = accounts.stream()
                .filter(a -> a.getAccountNumber().equals(accountNumber))
                .findFirst();
        return account.orElse(null);
    }
}