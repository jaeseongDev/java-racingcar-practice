package racinggame.domain.car;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    @DisplayName("경주할 자동차가 1대 이하일 경우 예외 발생")
    public void init_validateCarsSize_ExceptionThrown() {
        List<Car> cars = new ArrayList<>(Arrays.asList(
            Car.from("json")
        ));

        assertThatIllegalArgumentException().isThrownBy(() ->
            Cars.of(cars)
        );
    }
}
