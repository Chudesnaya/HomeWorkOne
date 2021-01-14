package be;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Введите своё число: ");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        int setNumber = (int) (Math.random() * 101);
        System.out.println("Заданное число: " + setNumber);
        if (setNumber > userNumber) {
            float difference = (setNumber - userNumber) / 10f;
            System.out.println("Разница между числами в пределах 10% = " + difference);
        } else {
            float difference = (userNumber - setNumber) / 10f;
            System.out.println("Разница между числами в пределах 10% = " + difference);
        }
    }
}