package baseball.domain;

import baseball.domain.baseball.BallCount;
import baseball.domain.baseball.Balls;

public class Game {
    private BallCount ballCount;
    private Balls computerBalls;
    private Balls playerBalls;

    public Game() {
        this.ballCount = new BallCount();
    }

    public void play() {
        ballCount.counting(computerBalls, playerBalls);
    }

    public void setComputerBalls(Balls computerBalls) {
        this.computerBalls = computerBalls;
    }

    public void setPlayerBalls(Balls playerBalls) {
        this.playerBalls = playerBalls;
    }

    public boolean isFinished() {
        if (Balls.SIZE == ballCount.getStrike()) {
            return true;
        }

        return false;
    }

    public BallCount getBallCount() {
        return ballCount;
    }
}
