package baseball.domain.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class BallTest {

    @Test
    @DisplayName("문자로 볼 생성하기")
    public void create_ball_char() {
        Ball ball = new Ball('7');
        assertThat(ball.getNumber()).isEqualTo(7);
    }

    @Test
    @DisplayName("숫자로 볼 생성하기")
    public void create_ball_int() {
        Ball ball = new Ball(7);
        assertThat(ball.getNumber()).isEqualTo(7);
    }

    @Test
    @DisplayName("범위보다 낮은 숫자로 볼 생성하기")
    public void create_ball_low() {
        assertThatThrownBy(() -> {
            new Ball(0);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력값이 너무 작습니다.");
    }

    @Test
    @DisplayName("범위보다 높은 숫자로 볼 생성하기")
    public void create_ball_high() {
        assertThatThrownBy(() -> {
            new Ball(11);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력값이 너무 큽니다.");
    }
}
