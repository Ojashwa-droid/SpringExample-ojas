package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // ApplicationContext is a spring container that manages the life-cycle of the beans defined under its configuration file.
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        // It's a three-step process.
        // Step 1: Setting up the ApplicationContext interface (IoC container) to get the bean
        // Step 2: We create an instance of ClassPathXmlApplicationContext that is responsible to manage bean given in the xml file within its class path.
        // Step 3: We retrieved the bean we needed with its defined "id".


        MyBean myBean = applicationContext.getBean("myBean", MyBean.class);
        System.out.println(myBean);
        myBean.showMessage();

    }
}
