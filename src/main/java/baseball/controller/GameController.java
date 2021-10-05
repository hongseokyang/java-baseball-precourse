package baseball.controller;

import baseball.domain.Game;
import baseball.domain.baseball.BallCount;
import baseball.domain.baseball.Balls;
import baseball.validator.InputOptionValidator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    private Game game;

    public GameController() {
        this.game = new Game();
    }

    public void run() {
        do {
            start();
            OutputView.printNextLine();
            OutputView.printOutput(OutputView.RESTART_MESSAGE);
            OutputView.printNextLine();
        } while (!isTerminated());
    }

    public void start() {
        game.setComputerBalls(new Balls());

        do {
            OutputView.printOutput(OutputView.GUIDE_MESSAGE);

            game.setPlayerBalls(new Balls(InputView.readLine()));
            game.play();

            printBallCount();
        } while (!game.isFinished());

        OutputView.printOutput(OutputView.END_MESSAGE);
    }

    public void printBallCount() {
        BallCount ballCount = game.getBallCount();
        if (ballCount == null) {
            return;
        }

        OutputView.printBallcount(ballCount.getStrike(), ballCount.getBall());
    }

    private boolean isTerminated() {
        String option;

        do {
            option = InputView.readLine();
        } while (!InputOptionValidator.isValidate(option));

        return InputView.TERMINATED_OPTION.equals(option);
    }

}
