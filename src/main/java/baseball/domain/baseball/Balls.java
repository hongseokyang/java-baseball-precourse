package baseball.domain.baseball;

import baseball.validator.GameValidator;
import baseball.validator.InputBallsValidator;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    public static final int SIZE = 3;
    private List<Ball> balls;

    public Balls() {
        balls = new ArrayList<>();
        setRandomBalls();
    }

    public Balls(String numbers) {
        balls = new ArrayList<>();
        if(InputBallsValidator.isValidate(numbers)) {
            setPlayerBalls(toCharArray(numbers));
        }
    }

    private void setRandomBalls() {
        while (balls.size() != SIZE) {
            add(new Ball());
        }
    }

    private void setPlayerBalls(char[] numbers) {
        int i = 0;
        while (balls.size() != SIZE) {
            add(new Ball(numbers[i++]));
        }
    }

    private char[] toCharArray(String numbers) {
        return numbers.toCharArray();
    }

    private void add(Ball ball) {
        GameValidator validator = new GameValidator(balls, ball);

        if (!validator.isValidate()) {
            return;
        }

        balls.add(ball);
    }

    public List<Ball> getBalls() {
        return balls;
    }
}
