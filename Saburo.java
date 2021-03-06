
public class Saburo extends Family {
    private int appleAmount = 0;
    private int appleTaste = 0;
    private int bananaAmount = 0;
    private int bananaTaste = 0;

    public Saburo(int appleAmount, int appleTaste, int bananaAmount, int bananaTaste) {
        this.appleAmount = appleAmount;
        this.appleTaste = appleTaste;
        this.bananaAmount = bananaAmount;
        this.bananaTaste = bananaTaste;
    }

    // 三郎が空腹かどうかを返す
    @Override
    public boolean isHungry() {
        // 三郎のデータは配列になってて、１つ目がりんごの量、２つ目がりんごの味、３つ目がバナナの量、４つ目がバナナの味
        return (this.appleAmount * this.appleTaste + this.bananaAmount * this.bananaTaste) < (2000 * 0.95);
    }

    // 三郎の幸福度を返す
    @Override
    public int isHappyPercent() {
        // 三郎のデータは配列になってて、１つ目がりんごの量、２つ目がりんごの味、３つ目がバナナの量、４つ目がバナナの味
        // 三郎の幸福度は味重視
        return (this.appleTaste * 2 + this.bananaTaste * 3);
    }

    // 三郎が食べる処理
    @Override
    public void eat(String fruit, Fruits fruitData) {
        // りんご
        if (fruit.equals("apple")) {
            this.appleAmount += fruitData.getAmount(); // 量
            this.appleTaste += fruitData.getTaste(); // 味

            // バナナ
        } else {
            this.bananaAmount += fruitData.getAmount(); // 量
            this.bananaTaste += fruitData.getTaste(); // 味
        }

    }

}