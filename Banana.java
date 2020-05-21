public class Banana implements Fruits {

    private String color;
    private int amount;
    private int taste;
    private int value;

    public Banana(String color, int amount, int taste, int value) {
        this.color = color;
        this.amount = amount;
        this.taste = taste;
        this.value = value;
    }

    // バナナの色を返す関数
    public String getColor() {
        return this.color;
    }

    // バナナの量を返す関数
    public int getAmount() {
        return this.amount;
    }

    // バナナのうまみ具合を返す関数
    public int getTaste() {
        return this.taste;
    }

    public int getValue() {
        return this.value;
    }

    public String getBland() {
        return "--";
    }

}