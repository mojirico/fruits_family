
public class Jiro extends Family {

    private int hungry = 0;
    private int happy = 0;

    public Jiro(int hungry, int happy) {
        this.hungry = hungry;
        this.happy = happy;
    }

    // 次郎が空腹かどうかを返す
    @Override
    public boolean isHungry() {
        // 次郎のデータは配列になってて、１つ目が満腹度。満腹度８０％を超えると空腹感はなくなる子。
        return this.hungry < (2000 * 0.8);
    }

    // 次郎の幸福度を返す
    @Override
    public int isHappyPercent() {
        // 次郎のデータは配列になってて、２つめが幸福度。
        return this.happy;
    }

    // 次郎が食べる処理
    @Override
    public void eat(String fruit, Fruits fruitData) {
        // りんご
        if (fruit.equals("apple")) {
            String color = fruitData.getColor();
            int amount = fruitData.getAmount();
            int taste = fruitData.getTaste();
            String bland = fruitData.getBland();

            // 効果
            int kouka = 1;
            if (color.equals("red")) {
                kouka = 2;
            }
            if (bland.equals("ourin")) {
                kouka *= 2;
            }

            // 量 * 味 を満腹度に加算する
            this.hungry += amount * taste;

            // 幸福度データを更新する。次郎は味・色・ブランドによって幸福度が上がる
            this.happy += taste * kouka;

            // バナナ
        } else {
            String color = fruitData.getColor();
            int amount = fruitData.getAmount();
            int taste = fruitData.getTaste();

            // 白色のバナナは２倍の効果
            int kouka = 1;
            if (color.equals("white")) {
                kouka = 2;
            }

            // 量 * 味 を満腹度に加算する
            this.hungry += amount * taste * kouka;

            // 幸福度データを更新する。次郎はバナナの時は量によって幸福度が上がる
            this.happy += amount;
        }
    }

    // 二郎は人が食べているのを見ると幸福を感じる
    public void satisfaction() {
        this.happy += 1;
        System.out.println("二郎は人が食べているのを見て幸せを感じた");
    }

}