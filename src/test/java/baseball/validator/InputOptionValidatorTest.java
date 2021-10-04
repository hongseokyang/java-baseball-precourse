package baseball.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class InputOptionValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {":false",
            "a:false",
            "12:false",
            "0:false",
            "1:true",
            "2:true"
    }, delimiter = ':')
    @DisplayName("잘못된 값을 입력한 경우")
    void input_invalid(String input, boolean expected) {
        assertEquals(expected, InputOptionValidator.isValidate(input));
    }
}