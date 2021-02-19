package racinggame.domain;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TryTest {

    @DisplayName("시도 횟수가 1이상일 경우 Try 객체 정상 생성")
    @ParameterizedTest(name = "{index} {displayName} : num = {arguments}")
    @ValueSource(ints = {1, 2, 3, 4})
    public void init_validateTryRange_NotThrownException(int num) {
        assertThatCode(() ->
            new Try(num)
        ).doesNotThrowAnyException();
    }


    @DisplayName("시도 횟수가 1 미만일 경우 예외 발생")
    @ParameterizedTest(name = "{index} {displayName} : num = {arguments}")
    @ValueSource(ints = {-2, -1, 0})
    public void init_validateTryRange_TrueOrFalse(int num) {
        assertThatIllegalArgumentException().isThrownBy(() ->
            new Try(num)
        );
    }
}
