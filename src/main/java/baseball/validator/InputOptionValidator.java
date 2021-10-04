package baseball.validator;

import baseball.view.OutputView;

public class InputOptionValidator {

    public static boolean isValidate(String number) {

        if (isNotEmpty(number) &&
                isValidSize(number) &&
                isValid(number)) {

            return true;
        }

        printErrorMessage();
        return false;
    }

    private static void printErrorMessage() {
        OutputView.printError(OutputView.RESTART_MESSAGE);
    }

    private static boolean isNotEmpty(String number) {
        return (number != null && !number.isEmpty());
    }

    private static boolean isValidSize(String number) {
        return (number.length() == 1);
    }

    private static boolean isValid(String number) {
        return number.contains("1") || number.contains("2");
    }
}
