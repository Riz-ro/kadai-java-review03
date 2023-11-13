package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam yak = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        yak.report();

        BaseBallTeam bei = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        bei.report();

        BaseBallTeam tai = new BaseBallTeam("阪神タイガース",68,71,4);
        tai.report();

        BaseBallTeam yom = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        yom.report();

        BaseBallTeam hir = new BaseBallTeam("広島東洋カープ",66,74,3);
        hir.report();

        BaseBallTeam dor = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        dor.report();

    }

}
