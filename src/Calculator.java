import java.util.Scanner;

public class Calculator {


    private static Scanner read;

    public static void main (String[] args){

        read = new Scanner(System.in);

        double first;
        double second;
        String operator;

        System.out.print("Первое число ");

        first = read.nextDouble();
        System.out.println("Знак");
        operator = read.next();
        System.out.println("Второе число");
        second = read.nextDouble();
        System.out.println("Ответ");

        if (operator.equals("*")){
            System.out.println("= " + (first * second));
        }
        if (operator.equals("/")){
            System.out.println("= " + (first / second));
        }
        if (operator.equals("+")){
            System.out.println("= " + (first + second));
        }
        if (operator.equals("-")){
            System.out.println("= " + (first - second));
        }

    }
}