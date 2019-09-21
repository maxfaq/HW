package Schenyatskiy.HOTcold;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        int a = kama();
        int c = kama3(a);
        kama1(a, c);
    }

    private static int kama() {
        Random rnd = new Random();
        int n = rnd.nextInt(101);
        System.out.print("Компьютер загадал целое число от 0 до 100" + "\n" + "\n");
        return n;
    }

    private static int kama3(int a) {
        int c;
        System.out.print("Попробуйте угадать цисло с первой попытки" + "Введите число:" + "\n" + "\n");
        Scanner G = new Scanner(System.in);
        while (!G.hasNextInt()) {
            System.out.print("Вы допустили ошибку, при вводе" + "\n" + "Попробуйте еще раз!" + "\n" + "Введите число :" + "\n");
            G.next();
        }
        c = G.nextInt();
        if (c == a) {
            System.out.print("А ты ХОРОШ!" + "\n" + "УСПЕХ!");
            System.exit(1);
        } else {
            System.out.print("Попробуйте еще раз" + "\n");
        }
        return c;
    }

    private static void kama1(int a, int c) {
        int num1;
        Scanner G = new Scanner(System.in);
        do {
            System.out.print("Введите число:" + "\n");
            while (!G.hasNextInt()) {
                System.out.print("Вы допустили ошибку, при вводе" + "\n" + "Попробуйте еще раз!" + "\n" + "Введите число :" + "\n");
                G.next();
            }
            num1 = G.nextInt();
            if (abs(num1 - a) < abs(c - a)) {
                System.out.print("Горячо" + "\n");
            } else {
                System.out.print("Холодно" + "\n");
            }
            c = num1;
        }
        while (num1 != a);
        System.out.println("Вы угадали число!  " + num1 + "\n" + "УСПЕХ!");
    }
}