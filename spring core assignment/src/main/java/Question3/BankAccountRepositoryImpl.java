package Question3;

import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository{

    @Override
    public double getBalance(long accountId) {

        for(var account:accounts){
            if(accountId==account.accountID){
                return account.getAccountBalance();
            }
        }
        return -1;
    }

    @Override
    public double updateBalance(long accountId, double newBalance) {
        return 0;
    }
    List<BankAccount> accounts;

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }
}
