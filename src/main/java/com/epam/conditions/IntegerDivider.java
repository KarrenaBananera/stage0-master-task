package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider != 0)
        {
            int res = dividend / divider * divider;
            if (dividend == res)
                System.out.println("can be divided completely");
            else
                System.out.println("cannot be divided completely");
        }
        else
            System.out.println("division by zero");
    }

}
