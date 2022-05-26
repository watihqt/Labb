package com.lab;

public class Main
{
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    private static int greaterValue(int num1, int num2){
        if(num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    private static Double greaterValue(double num1, double num2){
        if(num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) throws Exception {

        System.out.println("Hello Mahal kong World!\n");

        System.out.println("The sum of 10 and 69 is "+ computeSum(10,60));
        System.out.println("The sum of 10, 12,and 13 is "+ computeSum(10,12,13)+"\n");

        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));
        System.out.println("The greater value between 3.14, 9.8 is " + greaterValue(3.14,9.8));

    }
}
