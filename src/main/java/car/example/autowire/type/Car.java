package car.example.autowire.type;

public class Car {
    private Specification specification;


    // When using autowiring by type, the injection happens via setter injection
    // and the spring Ioc container looks for the type of bean a particular bean requires

    public void setSpecification(Specification specification) {
        System.out.println("Setter being called");
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details: " + specification.toString());
    }
}
