package baseball.view;

public class OutputView {
    public static final String GUIDE_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String ERROR_MESSAGE = "1~9 사이의 중복 없는 세자리 숫자를 입력하세요.";
    public static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";
    public static final String RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printOutput(String message) {
        System.out.print(message);
    }

    public static void printNextLine() {
        System.out.println();
    }

    public static void printError(String message) {
        printOutput(String.format("[ERROR] %s", message));
        printNextLine();
    }

    public static void printBallcount(int strike, int ball) {
        printOutput(makeBallCountMessage(strike, ball).toString());
        printNextLine();
    }

    private static StringBuilder makeBallCountMessage(int strike, int ball) {
        StringBuilder message = new StringBuilder();

        if (strike > 0) {
            message.append(String.format("%d스트라이크", strike));
        }

        if (ball > 0) {
            message.append(String.format("%d볼", ball));
        }

        if (strike <= 0 && ball <= 0) {
            message.append("낫싱");
        }

        return message;
    }
}
