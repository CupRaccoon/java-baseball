package baseball;

public class MatchResult {
    int ball;
    int strike;

    public MatchResult(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public void print(){
        if(ball > 0){
            System.out.print(ball + "볼");
        }
        if(ball > 0 && strike > 0){
            System.out.print(" ");
        }
        if(strike > 0){
            System.out.print(strike + "스트라이크");
        }
        System.out.print(System.lineSeparator());
    }
    public boolean isCorrect(){
        return (strike == 3);
    }
}
