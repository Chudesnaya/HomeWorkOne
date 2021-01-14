package be;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        int firstDot = 10;
        int secondDot = 100;
        if (userNumber < firstDot) {
            System.out.println("Введенное число " + userNumber + " находится в диапозоне от - бесконечности до " + firstDot);
        } else if (userNumber >= firstDot && userNumber <= secondDot) {
            System.out.println("Введенное число " + userNumber + " находится в диапозоне от  " + firstDot + " до " + secondDot);
        } else {
            System.out.println("Введенное число " + userNumber + " находится в диапозоне от" + secondDot + " до бесконечности");
        }
    }
}

