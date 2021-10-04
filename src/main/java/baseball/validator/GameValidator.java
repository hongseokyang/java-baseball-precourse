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
            return true;
        }

        return isNotContains();
    }

    private boolean isEmpty() {
        return (balls.isEmpty() || balls.size() <= 0);
    }

    private boolean isNotContains() {
        boolean notContains = true;

        for (Ball ball : balls) {
            notContains = isNotEquals(ball, notContains);
        }

        return notContains;
    }

    private boolean isNotEquals(Ball ball, boolean notContains) {
        if (!notContains) {
            return false;
        }

        return !ball.equals(newBall);
    }
}
