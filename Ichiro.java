
public class Ichiro extends Family {

    // 一郎が空腹かどうか
    public boolean isIchiroHungry(String[] data) {
        // 一郎のデータは配列になってて、１つ目が満腹度。満腹度１００％にならないと空腹感はなくならない子。
        return Integer.parseInt(data[0]) < (2000 * 1.0);
    }

    // 一郎の幸福度を返す
    public String isIchiroHappyPercent(String[] data) {
        // 一郎のデータは配列になってて、２つめが幸福度。
        return data[1];
    }

    // 一郎が食べる処理
    public void eatIchiro(String[] personData, String fruit, String[] fruitData) {
        // 一郎はりんごを食べない
        if (fruit.equals("apple")) {
            return;
        }
        String color = Banana.getBananaColor(fruitData);
        int amount = Banana.getBananaAmount(fruitData);
        int taste = Banana.getBananaTaste(fruitData);
        int manpuku = Integer.parseInt(personData[0]);

        // 白色のバナナは２倍の効果
        int kouka = 1;
        if (color.equals("white")) {
            kouka = 2;
        }

        // 量 * 味 を満腹度に加算する
        manpuku += amount * taste * kouka;

        // 満腹度データを更新
        personData[0] = String.valueOf(manpuku);

        // 幸福度データを更新する。一郎は量によって幸福度が上がる
        personData[1] = String.valueOf(Integer.parseInt(personData[1]) + amount);

    }
}