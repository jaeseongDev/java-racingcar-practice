package racinggame.domain.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    public static final int MIN_CARS_SIZE = 2;
    private final List<Car> cars;

    private Cars(List<Car> cars) {
        validateCarsSize(cars);
        this.cars = new ArrayList<>(cars);
    }

    public static Cars of(List<Car> cars) {
        return new Cars(cars);
    }

    private void validateCarsSize(List<Car> cars) {
        if (cars.size() < MIN_CARS_SIZE) {
            throw new IllegalArgumentException("경주할 자동차는 2대 이상이어야 한다.");
        }
    }
}
