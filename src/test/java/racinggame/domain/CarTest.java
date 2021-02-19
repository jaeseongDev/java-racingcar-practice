package racinggame.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.domain.car.Car;

public class CarTest {
    @ParameterizedTest(name = "자동차 이름이 1~5자가 아닐 경우 예외 발생")
    @ValueSource(strings = {"", "abcdef", "abcdefg"})
    public void init_validateCarNameLength_ExceptionThrown(String name) {
        assertThatIllegalArgumentException().isThrownBy(() ->
            Car.from(name)
        );
    }
}
