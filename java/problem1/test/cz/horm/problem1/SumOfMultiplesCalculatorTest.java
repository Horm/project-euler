package cz.horm.problem1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by horm on 28.1.17.
 */
public class SumOfMultiplesCalculatorTest {

    @Test
    public void sumAllMultiples() throws Exception {
        int[] multiples = {3, 5, 6, 9};
        assertThat(SumOfMultiplesCalculator.sumAllMultiples(multiples)).isEqualTo(23);
    }

}