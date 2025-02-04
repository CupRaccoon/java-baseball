package baseball;


import camp.nextstep.edu.missionutils.*;

import java.util.List;


public class Application {

    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        try {
            while (runGame()) ;
        } catch (IllegalArgumentException e) {
            System.out.println("error : " + e.getMessage());
            throw e;
        }
    }

    public static boolean runGame() {
        BaseballNumber baseballNumber = new BaseballNumber();
        baseballNumber.makeRandomNumber();
        List<String> inputNumber;
        while (true) {
            System.out.println("숫자를 입력해주세요 : ");
            inputNumber = InputReader.readNumber();
            MatchResult matchResult = baseballNumber.match(inputNumber);
            matchResult.print();
            if (matchResult.isCorrect()) {
                System.out.print(BaseballNumber.numberLength + "개의 숫자를 모두 맞히셨습니다! ");
                break;
            }
        }
        System.out.println("게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return InputReader.readGameStatus();
    }
}
