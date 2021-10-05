package baseball.validator;

import baseball.view.InputView;
import baseball.view.OutputView;

public class InputOptionValidator extends InputValidator {

    public static boolean isValidate(String number) {

        if (isNotEmpty(number) &&
                isValidSize(number, 1) &&
                isValid(number)) {

            return true;
        }

        printErrorMessage(OutputView.RESTART_MESSAGE);
        return false;
    }

    private static boolean isValid(String number) {
        return number.contains(InputView.RESTART_OPTION)
                || number.contains(InputView.RESTART_OPTION);
    }
}
