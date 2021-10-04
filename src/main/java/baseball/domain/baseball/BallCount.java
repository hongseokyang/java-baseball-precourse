package baseball.domain.baseball;

import java.util.List;

public class BallCount {

    private int strike;
    private int ball;

    public BallCount() {
        this.strike = 0;
        this.ball = 0;
    }

    public void counting(Balls computerBalls, Balls playerBalls) {
        List<Ball> computerBallList = computerBalls.getBalls();
        List<Ball> playerBallList = playerBalls.getBalls();

        for (int i = 0; i < Balls.SIZE; i++) {
            Ball computerBall = computerBallList.get(i);
            Ball playerBall = playerBallList.get(i);

            countStrike(computerBall, playerBall);
            countBall(computerBall, playerBallList);
        }

        if (ball >= strike) {
            ball -= strike;
        }
    }

    private void countStrike(Ball computerBall, Ball playerBall) {
        if (computerBall.equals(playerBall)) {
            strike++;
        }
    }

    private void countBall(Ball computerBall, List<Ball> playerBallList) {
        for (Ball playerBall : playerBallList) {
            checkBall(computerBall, playerBall);
        }
    }

    private void checkBall(Ball computerBall, Ball playerBall) {
        if (computerBall.equals(playerBall)) {
            ball++;
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
