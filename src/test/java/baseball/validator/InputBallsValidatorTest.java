package baseball.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class InputBallsValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {":false",
            "abc:false",
            "12:false",
            "012:false",
            "111:false",
            "123:true"
    }, delimiter = ':')
    @DisplayName("잘못된 값을 입력한 경우")
    void input_invalid(String input, boolean expected) {
        assertEquals(expected, InputBallsValidator.isValidate(input));
    }
}