package Schenyatskiy.algoritm_luna;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        long nomerKarty;
        long chislo;
        long[] massivKarty = new long[16];
        System.out.print("Введите 16-и значный номер карты:" + "\n" + "\n");
        Scanner vvodNomera = new Scanner(System.in);
        while (!vvodNomera.hasNextLong()) {
            System.out.print("Вы допустили ошибку, при вводе" + "\n" + "Попробуйте еще раз!" + "\n" + "\n");
            vvodNomera.next();
        }
        nomerKarty = vvodNomera.nextLong();
//Загоняем число в масив
        for (int i = 15; nomerKarty > 0; i--) {
            long l = nomerKarty % 10;
            nomerKarty /= 10;
            massivKarty[i] = l;
        }
//Применяем алгоритм Луна
        for (int i = 0; i < 15; i++) {
            chislo = massivKarty[i];
            if ((chislo * 2) > 9) {
                massivKarty[i] = chislo * 2 - 9;
            } else {
                massivKarty[i] = chislo * 2;
            }
            i++;
        }
//Сумма после применения алгоритма
        int sum = 0;
        for (long i : massivKarty)
            sum += i;
//Результат
        if (sum % 10 == 0) {
            System.out.print("Номер карты валиден!" + "\n" + "\n");
        } else {
            System.out.print("Номер карты НЕ валиден!" + "\n" + "\n");
        }

    }
}
