package Question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext context;
    public static void main(String[] args) {
        ApplicationContext factory=new ClassPathXmlApplicationContext("bean.xml");

        Customer c1=(Customer) factory.getBean("cus1");
        Address a1=(Address)factory.getBean("address1");
        System.out.println(c1);


    }
}
