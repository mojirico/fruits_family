
public class Saburo extends Family {

    // 三郎が空腹かどうかを返す
    public boolean isSaburoHungry(int[] data) {
        // 三郎のデータは配列になってて、１つ目がりんごの量、２つ目がりんごの味、３つ目がバナナの量、４つ目がバナナの味
        return (data[0] * data[1] + data[2] * data[3]) < (2000 * 0.95);
    }

    // 三郎の幸福度を返す
    public int isSaburoHappyPercent(int[] data) {
        // 三郎のデータは配列になってて、１つ目がりんごの量、２つ目がりんごの味、３つ目がバナナの量、４つ目がバナナの味
        // 三郎の幸福度は味重視
        return (data[1] * 2 + data[3] * 3);
    }

    // 三郎が食べる処理
    public void eatSaburo(int[] personData, String fruit, String[] fruitData) {
        // りんご
        if (fruit.equals("apple")) {
            personData[0] += Apple.getAppleAmount(fruitData); // 量
            personData[1] += Apple.getAppleTaste(fruitData); // 味

            // バナナ
        } else {
            personData[2] += Banana.getBananaAmount(fruitData); // 量
            personData[3] += Banana.getBananaTaste(fruitData); // 味
        }

    }

}