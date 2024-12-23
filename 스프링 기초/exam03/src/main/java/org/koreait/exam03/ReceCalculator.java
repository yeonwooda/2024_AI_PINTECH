package org.koreait.exam03;

public class ReceCalculator implements Calculator {

    @Override
    public long factorial(long num) {
        if (num < 1) {
            return 1L;
        }
        return num * factorial(num - 1);
    }
}
