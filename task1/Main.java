package task1;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    private static String[] generationWordbook(String message) {
       Function<String, String[] > wordbook = x -> Stream.of(message.split(" ")).sorted().toArray(String[]::new);
       return wordbook.apply(message);
    }

    public static void main(String[] args) {
        final String messageAborigine = "dddd bbbb nnnn aaaaa";
        System.out.println(Arrays.toString(generationWordbook(messageAborigine)));
    }
}
