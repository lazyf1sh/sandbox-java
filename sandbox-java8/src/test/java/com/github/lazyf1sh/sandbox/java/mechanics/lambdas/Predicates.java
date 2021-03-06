package com.github.lazyf1sh.sandbox.java.mechanics.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Ivan Kopylov
 */
public class Predicates
{
    @Test
    public void main()
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        sumAll(numbers, jkljlkj -> true);
    }

    public int sumAll(List<Integer> numbers, Predicate<Integer> p)
    {
        int total = 0;
        for (int number : numbers)
        {
            if (p.test(number))
            {
                total += number;
            }
        }
        return total;
    }
}
