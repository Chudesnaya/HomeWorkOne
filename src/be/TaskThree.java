package be;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("Введите три числа: ");
        Scanner sc = new Scanner(System.in);
        int userNumberOne = sc.nextInt();
        int userNumberTwo = sc.nextInt();
        int userNumberThree = sc.nextInt();
        int sum;
        sum = (userNumberOne + userNumberTwo + userNumberThree) / 3;
        System.out.println("Среднее арифметическое введенных чисел равно: " + sum);
        if (userNumberOne > userNumberTwo && userNumberOne > userNumberThree) {
            System.out.println("Наибольшее число: " + userNumberOne);
        } else if (userNumberTwo > userNumberThree) {
            System.out.println("Наибольшее число: " + userNumberTwo);
        } else {
            System.out.println("Наибольшее число: " + userNumberThree);
        }
        if (userNumberOne < userNumberTwo && userNumberOne < userNumberThree)
            System.out.println("Наименьшее число: " + userNumberOne);
        else if (userNumberTwo < userNumberThree) {
            System.out.println("Наимешьншее число: " + userNumberTwo);
        } else {
            System.out.println("Наименьшее число: " + userNumberThree);
        }
    }
}
