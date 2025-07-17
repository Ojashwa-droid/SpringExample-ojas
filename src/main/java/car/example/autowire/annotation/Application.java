package car.example.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Transitioning from xml configuration to annotation configuration

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee =
                context.getBean("employee", Employee.class);
        System.out.println(employee.toString());

        Manager manager =
                context.getBean("manager", Manager.class);
        System.out.println(manager.toString());
    }
}
