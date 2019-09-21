package Schenyatskiy.algoritm_luna;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        long c;
        long[] NK = new long[16];
        System.out.print("Введите 16-и значный номер карты:" + "\n" + "\n");
        Scanner G = new Scanner(System.in);
        while (!G.hasNextLong()) {
            System.out.print("Вы допустили ошибку, при вводе" + "\n" + "Попробуйте еще раз!" + "\n" + "\n");
            G.next();
        }
        c = G.nextLong();
//Загоняем число в масив
        for (int i = 15; c > 0; i--) {
            long l = c % 10;

            c /= 10;
            NK[i] = l;

        }
//Применяем алгоритм Луна
        for (int i = 0; i < 15; i++) {
            c = NK[i];
            if ((c * 2) > 9) {
                NK[i] = c * 2 - 9;
            } else {
                NK[i] = c * 2;
            }
            i++;
        }
//Сумма после применения алгоритма
        int sum = 0;
        for (long i : NK)
            sum += i;
//Результат
        if (sum % 10 == 0) {
            System.out.print("Номер карты валиден!" + "\n" + "\n");
        } else {
            System.out.print("Номер карты НЕ валиден!" + "\n" + "\n");
        }

    }
}
