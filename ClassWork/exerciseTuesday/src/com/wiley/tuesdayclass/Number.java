package com.wiley.tuesdayclass;

public class Number {
    private int number;
    private int reverseNumber;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getReverseNumber() {
        int num = this.number;
        while (num != 0) {
            int digit = num % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            num /= 10;
        }
        return reverseNumber;
    }
}

