package car.example.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("carExampleSetterInjection.xml");

        Car car = context.getBean("myCar", Car.class);
        car.displayDetails();
    }
}
