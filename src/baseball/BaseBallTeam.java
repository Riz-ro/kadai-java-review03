package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    // 引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw){
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //　勝率を求めるメソッド「勝ち数/(勝ち数+負け数)」小数値（double）で戻す
    public double getRate() {
        double rate = (double)this.win / (this.win + this.lose);
        return rate;
    }

    public void report() {
        double rate = getRate();
        System.out.println(this.name + "の2022年の成績は　" + this.win + "勝　" + this.lose + "敗　" + this.draw + "分、勝率は　" + rate + "です。");
    }

    public String GetName() {
        return name;
    }
    public void SetName(String name) {
        this.name = name;
    }

    public int GetWin() {
        return win;
    }
    public void SetWin(int win) {
        this.win = win;
    }

    public int GetLose() {
        return lose;
    }
    public void SetLose(int lose) {
        this.lose = lose;
    }

    public int GetDraw() {
        return draw;
    }
    public void SetDraw(int draw) {
        this.draw = draw;
    }
}
