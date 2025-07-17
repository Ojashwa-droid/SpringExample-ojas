package car.example.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowireByConstructor.xml");

        Car car = context.getBean("myCar", Car.class);
        car.displayDetails();
    }
}
