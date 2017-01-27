package cz.horm.problem1;

/**
 * Created by horm on 28.1.17.
 */
public class SumOfMultiplesCalculator {
    public static int sumAllMultiples(int multiples[]) {
        int sum = 0;
        for (int multiple : multiples) {
            sum += multiple;
        }
        return sum;
    }
}
