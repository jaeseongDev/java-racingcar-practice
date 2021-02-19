package racinggame.domain.car;

public class Car {
    private final Name name;

    public Car(Name name) {
        this.name = name;
    }

    public static Car from(String name) {
        return new Car(new Name(name));
    }
}
