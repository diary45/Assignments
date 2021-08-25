package Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BankAccountRepositoryImpl ac1=(BankAccountRepositoryImpl) context.getBean("repository");
        System.out.println(ac1.accounts);
        long b= ac1.accounts.get(2).accountID();
        System.out.println(ac1.getBalance(b));
    }
}
