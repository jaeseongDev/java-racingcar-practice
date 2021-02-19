package racinggame.domain.car;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {

    @DisplayName("자동차 이름이 1~5자가 아닐 경우 예외 발생")
    @ParameterizedTest(name = "{index} {displayName} : name={0}")
    @ValueSource(strings = {"", "abcdef", "abcdefg"})
    public void init_validateCarNameLength_ExceptionThrown(String name) {
        assertThatIllegalArgumentException().isThrownBy(() ->
            Car.from(name)
        );
    }
}
