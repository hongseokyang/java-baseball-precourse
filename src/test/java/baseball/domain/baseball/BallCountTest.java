package baseball.domain.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallCountTest {

    @ParameterizedTest
    @CsvSource(value = {"123,456,0,0",
            "123,136,1,1",
            "123,123,3,0"
    }, delimiter = ',')
    @DisplayName("볼카운트를 계산")
    void counting_ballcount(String randomNumber, String inputNumber, int expectedStrike, int expectedBall) {
        Balls computerBalls = new Balls(randomNumber);
        Balls playerBalls = new Balls(inputNumber);
        BallCount ballCount = new BallCount();

        ballCount.counting(computerBalls, playerBalls);
        int strike = ballCount.getStrike();
        int ball = ballCount.getBall();

        assertEquals(expectedStrike, strike);
        assertEquals(expectedBall, ball);
    }
}