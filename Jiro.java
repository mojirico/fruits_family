
public class Jiro extends Family {

    // 次郎が空腹かどうかを返す
    public boolean isJiroHungry(int[] data) {
        // 次郎のデータは配列になってて、１つ目が満腹度。満腹度８０％を超えると空腹感はなくなる子。
        return data[0] < (2000 * 0.8);
    }

    // 次郎の幸福度を返す
    public int isJiroHappyPercent(int[] data) {
        // 次郎のデータは配列になってて、２つめが幸福度。
        return data[1];
    }

    // 次郎が食べる処理
    public void eatJiro(int[] personData, String fruit, String[] fruitData) {
        // りんご
        if (fruit.equals("apple")) {
            String color = Apple.getAppleColor(fruitData);
            int amount = Apple.getAppleAmount(fruitData);
            int taste = Apple.getAppleTaste(fruitData);
            String bland = Apple.getAppleBland(fruitData);

            // 効果
            int kouka = 1;
            if (color.equals("red")) {
                kouka = 2;
            }
            if (bland.equals("ourin")) {
                kouka *= 2;
            }

            // 量 * 味 を満腹度に加算する
            personData[0] += amount * taste;

            // 幸福度データを更新する。次郎は味・色・ブランドによって幸福度が上がる
            personData[1] += taste * kouka;

            // バナナ
        } else {
            String color = Banana.getBananaColor(fruitData);
            int amount = Banana.getBananaAmount(fruitData);
            int taste = Banana.getBananaTaste(fruitData);

            // 白色のバナナは２倍の効果
            int kouka = 1;
            if (color.equals("white")) {
                kouka = 2;
            }

            // 量 * 味 を満腹度に加算する
            personData[0] += amount * taste * kouka;

            // 幸福度データを更新する。次郎はバナナの時は量によって幸福度が上がる
            personData[1] += amount;
        }

    }

}