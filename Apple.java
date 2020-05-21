public class Apple {

    // りんごの色を返す関数
    public static String getAppleColor(String[] data) {
        return data[0];
    }

    // りんごの量を返す関数
    public static int getAppleAmount(String[] data) {
        return Integer.parseInt(data[1]);
    }

    // りんごのうまみ具合を返す関数
    public static int getAppleTaste(String[] data) {
        return Integer.parseInt(data[2]);
    }

    // りんごのブランドを返す関数
    public static String getAppleBland(String[] data) {
        return data[3];
    }

}