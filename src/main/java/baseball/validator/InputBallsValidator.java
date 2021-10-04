package baseball.validator;

import baseball.domain.baseball.Balls;
import baseball.view.OutputView;

public class InputBallsValidator {

    public static boolean isValidate(String numbers) {

        if (isNotEmpty(numbers) &&
                isValidSize(numbers) &&
                isNumeric(numbers) &&
                isNotContainsZero(numbers)) {

            return true;
        }

        printErrorMessage();
        return false;
    }

    private static void printErrorMessage() {
        OutputView.printError(OutputView.ERROR_MESSAGE);
    }

    private static boolean isNotEmpty(String numbers) {
        return (numbers != null && !numbers.isEmpty());
    }

    private static boolean isValidSize(String numbers) {
        return (numbers.length() == Balls.SIZE);
    }

    private static boolean isNumeric(String numbers) {
        try {
            Integer.parseInt(numbers);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    private static boolean isNotContainsZero(String numbers) {
        return !(numbers.contains("0"));
    }
}
