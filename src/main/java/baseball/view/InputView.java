package baseball.view;

import nextstep.utils.Console;

public class InputView {
    public static final String RESTART_OPTION = "1";
    public static final String TERMINATED_OPTION = "2";

    public InputView() {
    }

    public static String readLine() {
        return Console.readLine();
    }
}
