package Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        Question_a q=(Question_a) context.getBean("question");
        System.out.println(q);

        Question_b q1=(Question_b) context.getBean("questionb");
        System.out.println(q1);

        Question_c q2=(Question_c) context.getBean("questionc");
        System.out.println(q2);


    }
}
