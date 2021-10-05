package baseball.domain;

import baseball.domain.baseball.BallCount;
import baseball.domain.baseball.Balls;

public class Game {
    private BallCount ballCount;
    private Balls computerBalls;
    private Balls playerBalls;
    private boolean finished;

    public Game() {
        init();
    }

    private void init() {
        finished = false;
        ballCount = null;
    }

    public void play() {
        if (isEmpty(computerBalls) || isEmpty(playerBalls)) {
            init();
            return;
        }

        ballCount = new BallCount();
        ballCount.counting(computerBalls, playerBalls);

        finished = (Balls.SIZE == ballCount.getStrike());
    }

    private boolean isEmpty(Balls balls) {
        return (balls == null || balls.getBalls().isEmpty());
    }

    public void setComputerBalls(Balls computerBalls) {
        this.computerBalls = computerBalls;
    }

    public void setPlayerBalls(Balls playerBalls) {
        this.playerBalls = playerBalls;
    }

    public boolean isFinished() {
        return finished;
    }

    public BallCount getBallCount() {
        return ballCount;
    }
}
