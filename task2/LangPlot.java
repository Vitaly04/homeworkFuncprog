package task2;

public class LangPlot {
    private final int length;
    private final int width;
    private final int price;

    public LangPlot(int length, int width, int price) {
        this.length = length;
        this.width = width;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LangPlot{" +
                "length=" + length +
                ", width=" + width +
                ", price=" + price +
                '}' ;
    }
}
