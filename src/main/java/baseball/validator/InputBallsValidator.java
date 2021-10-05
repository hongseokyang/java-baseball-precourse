package baseball.validator;

import baseball.domain.baseball.Balls;
import baseball.view.OutputView;

import java.util.HashSet;
import java.util.Set;

public class InputBallsValidator extends InputValidator {

    public static boolean isValidate(String numbers) {

        if (isNotEmpty(numbers) &&
                isValidSize(numbers, Balls.SIZE) &&
                isNumeric(numbers) &&
                isNotContainsZero(numbers) &&
                isNotDuplicated(numbers)) {

            return true;
        }

        printErrorMessage(OutputView.ERROR_MESSAGE);
        return false;
    }

    private static boolean isNotDuplicated(String numbers) {
        char[] chars = numbers.toCharArray();
        Set<Character> charsSet = new HashSet<>();

        for (char number : chars) {
            charsSet.add(number);
        }

        if (Balls.SIZE != charsSet.size()) {
            return false;
        }

        return true;
    }
}
