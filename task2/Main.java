package task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static LangPlot[] generationDeal() {
        final int QUANTITYDUAL = 10;
        Random random = new Random();
        LangPlot[] langPlots = new LangPlot[QUANTITYDUAL];
        for (int i = 0; i < QUANTITYDUAL; i++) {
            int length = random.nextInt(50000);
            int width = random.nextInt(50000);
            int price = random.nextInt(1000000);
            langPlots[i] = new LangPlot(length, width, price);
        }
        return langPlots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите цену участка: ");
        int price = scanner.nextInt();
        LangPlot[] langPlots = generationDeal();
        Arrays.stream(langPlots).filter(x -> x.getPrice() > price).forEach(System.out::println);
    }
}
