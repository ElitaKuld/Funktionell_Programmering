package Övning_3_LambdaKator;

import java.util.List;

public class SumElements {
    public static int calculate(List<Integer> numbers) {
        // return numbers.stream().mapToInt(i -> i).sum(); // sätt 1
        return (int)numbers.stream().mapToInt(i -> i).summaryStatistics().getSum(); // sätt 2, mer krångligt
    }
}