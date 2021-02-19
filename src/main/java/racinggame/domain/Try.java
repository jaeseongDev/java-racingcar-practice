package racinggame.domain;

public class Try {

    public static final int MIN_TRY_COUNT = 1;
    private final int count;

    public Try(int count) {
        validateTryCount(count);
        this.count = count;
    }

    private void validateTryCount(int count) {
        if (count < MIN_TRY_COUNT) {
            throw new IllegalArgumentException("시도할 횟수는 1회 이상이어야 합니다.");
        }
    }
}
