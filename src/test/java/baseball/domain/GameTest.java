package baseball.domain;

import baseball.domain.baseball.Balls;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    Game game = new Game();

    @BeforeEach
    void setUp() {
        Balls computerBalls = new Balls("123");
        game.setComputerBalls(computerBalls);
    }

    @ParameterizedTest
    @CsvSource(value = {"456:false",
            "124:false",
            "123:true"
    }, delimiter = ':')
    @DisplayName("게임 종료 여부 확인")
    void isFinished(String numbers, Boolean expected) {
        Balls playerBalls = new Balls(numbers);
        game.setPlayerBalls(playerBalls);
        game.play();

        assertEquals(expected, game.isFinished());
    }
}
