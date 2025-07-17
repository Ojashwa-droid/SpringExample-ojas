package car.example.autowire.name;

public class Car {
    private Specification specification;


    // When using autowiring by name, the injection happens via setter injection

    public void setSpecification(Specification specification) {
        System.out.println("Setter being called");
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details: " + specification.toString());
    }
}
