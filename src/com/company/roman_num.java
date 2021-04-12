package com.company;

public class roman_num {
    public static int toInt(String number) {
        int lengthNum = number.length();
        int[] value = new int[lengthNum];


        for (int i = lengthNum; i> 0; i--) {
            if (number.charAt(i - 1) == ('I'))
                value[i - 1] = 1;
            else if (number.charAt(i - 1) == ('V'))
                value[i - 1] = 5;
            else if (number.charAt(i - 1) == ('X'))
                value[i - 1] = 10;
            else
                return -1;
        }

        int total = value [lengthNum-1];
        for (int i = lengthNum; i > 1; i--) {
            if (value[i - 1] <= value[i - 2]) {
                total += value[i - 2];
            }
            if (value[i - 1] > value[i - 2]) {
                total -= value[i - 2];
            }

        }
        return total;
    }



    public static String toRom(int number) {
        String romanNum = "";
        if (number > 0){
            while (number >= 100) {
                romanNum = romanNum + "C";
                number -= 100;
            }
            while (number >= 90) {
                romanNum = romanNum + "XC";
                number -= 90;
            }
            while (number >= 50) {
                romanNum = romanNum + "L";
                number -= 50;
            }
            while (number >= 40) {
                romanNum = romanNum + "XL";
                number -= 40;
            }
            while (number >= 10) {
                romanNum = romanNum + "X";
                number -= 10;
            }
            while (number >= 9) {
                romanNum = romanNum + "IX";
                number -= 9;
            }
            while (number >= 5) {
                romanNum = romanNum + "V";
                number -= 5;
            }
            while (number >= 4) {
                romanNum = romanNum + "IV";
                number -= 4;
            }
            while (number >= 1) {
                romanNum = romanNum + "I";
                number -= 1;
            }
        }
        return romanNum;
    }
}

