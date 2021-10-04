package baseball.validator;

import baseball.domain.baseball.Ball;

import java.util.List;

public class GameValidator {

    private List<Ball> balls;
    private Ball newBall;

    public GameValidator() {
    }

    public GameValidator(List<Ball> balls, Ball newBall) {
        this.balls = balls;
        this.newBall = newBall;
    }

    public boolean isValidate() {
        if (isEmpty()) {
            return false;
        }

        if (isContains()) {
            return false;
        }

        return true;
    }

    private boolean isEmpty() {
        return (balls.isEmpty() || balls.size() == 0);
    }

    private boolean isContains() {
        boolean contains = false;

        for (Ball ball : balls) {
            contains = isEquals(ball, contains);
        }

        return contains;
    }

    private boolean isEquals(Ball ball, boolean contains) {
        if (contains) {
            return true;
        }

        if (ball.equals(newBall)) {
            return true;
        }

        return false;
    }
}
