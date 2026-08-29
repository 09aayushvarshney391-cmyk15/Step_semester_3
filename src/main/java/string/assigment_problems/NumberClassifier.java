package main.java.string.assigment_problems;

public class NumberClassifier {
    public static void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        classifyNumber(5);
        classifyNumber(-3);
        classifyNumber(0);
    }
}
