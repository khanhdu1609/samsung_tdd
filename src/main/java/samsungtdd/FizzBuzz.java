package samsungtdd;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> solve (int number) {
        if (number<1) {
            throw new IllegalArgumentException("Number must larger or equals to 1");
        }
        List<String> list = new ArrayList<>();
        for (int i = 1; i<= number; i++) {
            if (i%3==0 && i%5==0) {
                list.add("FizzBuzz");
            } else if (i%3==0) {
                list.add("Fizz");
            } else if (i%5==0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
