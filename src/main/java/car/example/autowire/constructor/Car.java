package car.example.autowire.constructor;

public class Car {
    private Specification specification;

    // When using autowiring by constructor, the injection happens via constructor injection
    // and the spring Ioc container looks for the type of bean a particular bean requires
    // We should have only one matching bean of the required type

    public void setSpecification(Specification specification) {
        System.out.println("Setter being called");
        this.specification = specification;
    }

    public Car(Specification specification) {
        System.out.println("Constructor being called");
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details: " + specification.toString());
    }
}
