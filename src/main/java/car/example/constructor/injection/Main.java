package car.example.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("carExampleConstructorInjection.xml");

        Car car = context.getBean("myCar",Car.class);
        car.displayDetails();
    }
}
