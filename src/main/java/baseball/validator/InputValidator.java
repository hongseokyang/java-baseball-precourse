package baseball.validator;

import baseball.view.OutputView;

public class InputValidator {

    protected static void printErrorMessage(String message) {
        OutputView.printError(message);
    }

    protected static boolean isNotEmpty(String numbers) {
        return (numbers != null && !numbers.isEmpty());
    }

    protected static boolean isValidSize(String numbers, int size) {
        return (numbers.length() == size);
    }

    protected static boolean isNumeric(String numbers) {
        try {
            Integer.parseInt(numbers);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    protected static boolean isNotContainsZero(String numbers) {
        return !(numbers.contains("0"));
    }

}
