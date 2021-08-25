package Question3;


import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;

public class BankAccount {
    String accountHolderName,AccountType;
    double accountBalance;
    long accountID;
    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = (long)(Math.random()*100000);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = "cust1"+(int)(Math.random()*1000000000);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", AccountType='" + AccountType + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountID=" + accountID +
                "}\n";
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
