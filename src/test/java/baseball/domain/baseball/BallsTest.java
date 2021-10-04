package baseball.domain.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BallsTest {

    List<Integer> list;

    @BeforeEach
    void setUp() {
        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    @DisplayName("랜덤 Balls 생성하기")
    void create_balls_random(int index) {

        Balls balls = new Balls();
        List<Ball> ballList = balls.getBalls();

        assertThat(ballList.size()).isEqualTo(3);
        assertThat(list.contains(ballList.get(index).getNumber())).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    @DisplayName("플레이어 Balls 생성하기")
    void create_balls_player(int index) {

        Balls balls = new Balls("123");
        List<Ball> ballList = balls.getBalls();

        assertThat(ballList.size()).isEqualTo(3);
        assertThat(list.contains(ballList.get(index).getNumber())).isTrue();
    }
}