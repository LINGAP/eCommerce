package onlineShop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("payment.xml"); // container
    }

}
