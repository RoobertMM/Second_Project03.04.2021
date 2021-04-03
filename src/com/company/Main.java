package com.company;

public class Main {
    public static int calculateDifferenceAndProduct(int numberOne, int numberTwo, int numberTree, int numberFour){
        return (numberOne - numberTwo) * numberTree *numberFour;
    }

    public static int calculateSumAndProduct(int numberOne, int numberTwo, int numberTree){
        return (numberOne + numberTwo) * numberTree;
    }

    public static int calculateProduct(int numberOne, int numberTwo, int numberTree){
        return numberOne * numberTwo * numberTree;
    }

    public static int calculateDifference(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    public static int calculateProduct(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    public static int calculateSum(int numberOne, int numberTwo){

        return numberOne + numberTwo ;
    }

    public static void main(String[] args) {
        System.out.println("(44 - 23) * 4 * 2 =");
        System.out.println(calculateDifferenceAndProduct(44,23,4,2));
        System.out.println("(572 + 7152) * 0 =");
        System.out.println(calculateSumAndProduct(572,7152,0));
        System.out.println("33 * 21* 74 =");
        System.out.println(calculateProduct(33,21,74));
        System.out.println("573 - 373 =");
        System.out.println(calculateDifference(573,373));
        System.out.println("7 x 4 =");
        System.out.println(calculateProduct(7,4));
        System.out.println("1 + 2 =");
        System.out.println(calculateSum(1, 2));

        
    }
}
