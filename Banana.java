public class Banana {

    // バナナの色を返す関数
    public static String getBananaColor(String[] data) {
        return data[0];
    }

    // バナナの量を返す関数
    public static int getBananaAmount(String[] data) {
        return Integer.parseInt(data[1]) * Integer.parseInt(data[3]);
    }

    // バナナのうまみ具合を返す関数
    public static int getBananaTaste(String[] data) {
        return Integer.parseInt(data[2]);
    }

}