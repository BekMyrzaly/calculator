package com.company;
import java.util.*;



public class Main {
    public static void calculateNum(String num1, String sym, String num2){
        int resultInt;
        int numInt1 = Integer.parseInt(num1);
        int numInt2 = Integer.parseInt(num2);

        if (sym.equals("+")) {
            resultInt = numInt1 + numInt2;
            System.out.println(resultInt);
        } else if (sym.equals("-")) {
            resultInt = numInt1 - numInt2;
            System.out.println(resultInt);
        } else if (sym.equals("*")) {
            resultInt = numInt1 * numInt2;
            System.out.println(resultInt);
        } else if (sym.equals("/")) {
            resultInt = numInt1 / numInt2;
            System.out.println(resultInt);
        }else {
            System.out.println("Неправильный символ: " + sym);
        }
    }

    public static void calculateRom(String num1, String sym, String num2) {
        boolean numV = true;
        boolean symV = true;
        int leftInt, rightInt;
        int resultInt = 0;
        leftInt = roman_num.toInt(num1);
        rightInt = roman_num.toInt(num2);

        if (leftInt == -1) {
            numV = false;
            System.out.println("Неправильное число: " + num1);
        }
        if (rightInt == -1) {
            numV = false;
            System.out.println("Неправильное число: " + num2);
        }

        if (sym.equals("+") || sym.equals("-") || sym.equals("*") ||
                sym.equals("/")) {
            symV = true;
        } else {
            symV = false;
            System.out.println("Неправильный символ: " + sym);

        }

        if (numV == true && symV == true) {

            if (sym.equals("+")) {
                resultInt = leftInt + rightInt;
            } else if (sym.equals("-")) {
                resultInt = leftInt - rightInt;
            } else if (sym.equals("*")) {
                resultInt = leftInt * rightInt;
            } else if (sym.equals("/")) {
                resultInt = leftInt / rightInt;
            }
            if (resultInt <= 0 || resultInt >= 101) {
                System.out.println("Результат вне диапазона");
        }else {
                System.out.println(roman_num.toRom(resultInt));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1, sym, num2;

             num1 = sc.next();
             sym = sc.next();
             num2 = sc.next();
             try {


        if (num1.equals("1") || num1.equals("2") || num1.equals("3") || num1.equals("4") ||
                num1.equals("5") || num1.equals("6") || num1.equals("7") ||
                num1.equals("8") || num1.equals("9") || num1.equals("10") &&
                num2.equals("1") || num2.equals("2") || num2.equals("3") || num2.equals("4")
                || num2.equals("5") || num2.equals("6") || num2.equals("7") ||
                num2.equals("8") || num2.equals("9") || num2.equals("10")) {
            calculateNum(num1, sym, num2);
        }else {
            calculateRom(num1, sym, num2);
        }}catch (Exception e){
                 System.out.println(e.getMessage());
             }
    }

}

