package baseball.validator;

import baseball.domain.baseball.Ball;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class RandomBallsValidatorTest {

    List<Ball> balls = new ArrayList<>();

    @Test
    @DisplayName("리스트가 비어있는지 확인하기")
    void isEmpty() {
        Ball newBall = new Ball(5);
        RandomBallsValidator validator = new RandomBallsValidator(balls, newBall);

        assertThat(validator.isValidate()).isTrue();
    }

    @Test
    @DisplayName("리스트에 중복값이 있는지 확인하기")
    void isContains() {
        balls.add(new Ball(1));
        balls.add(new Ball(2));
        Ball newBall = new Ball(2);

        RandomBallsValidator validator = new RandomBallsValidator(balls, newBall);

        assertThat(validator.isValidate()).isFalse();
    }

    @Test
    @DisplayName("리스트에 중복값이 없는지 확인하기")
    void isNotContains() {
        balls.add(new Ball(1));
        balls.add(new Ball(2));
        Ball newBall = new Ball(5);

        RandomBallsValidator validator = new RandomBallsValidator(balls, newBall);

        assertThat(validator.isValidate()).isTrue();
    }
}