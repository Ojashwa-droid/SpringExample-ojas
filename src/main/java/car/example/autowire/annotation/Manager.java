package car.example.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    // Field Injection

    @Autowired
    @Qualifier("employee")
    // a qualifying being of this name is to be autowired here
    // --> @Qualifier is used when we have multiple beans under
    //     Ioc Container with same type
    private Employee employee;

    /*

    Constructor Injection

    @Autowired
    public Manager(Employee employee) {
        this.employee = employee;
    }

    */

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
