package baseball.domain.baseball;

import nextstep.utils.Randoms;

public class Ball {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;
    private final int number;

    public Ball() {
        this.number = Randoms.pickNumberInRange(MIN_VALUE, MAX_VALUE);
    }

    public Ball(char number) {
        this(Character.getNumericValue(number));
    }

    public Ball(int number) {
        validate(number);
        this.number = number;
    }

    private void validate(int number) {
        validateRange(number);
    }

    private void validateRange(int number) {
        if (number < MIN_VALUE) {
            throw new IllegalArgumentException("입력값이 너무 작습니다.");
        }

        if (number > MAX_VALUE) {
            throw new IllegalArgumentException("입력값이 너무 큽니다.");
        }
    }

    public int getNumber() {
        return number;
    }
}
