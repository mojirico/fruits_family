public class Apple implements Fruits {

    private String color;
    private int amount;
    private int taste;
    private String bland;

    public Apple(String color, int amount, int taste, String bland) {
        this.color = color;
        this.amount = amount;
        this.taste = taste;
        this.bland = bland;
    }

    // りんごの色を返す関数
    public String getColor() {
        return this.color;
    }

    // りんごの量を返す関数
    public int getAmount() {
        return this.amount;
    }

    // りんごのうまみ具合を返す関数
    public int getTaste() {
        return this.taste;
    }

    // りんごのブランドを返す関数
    public String getBland() {
        return this.bland;
    }

}