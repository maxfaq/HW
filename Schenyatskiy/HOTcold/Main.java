package Schenyatskiy.HOTcold;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        int chisloCom = computerZagadyvaetChislo();
        int pervoeChislo = vvodPervogoChislaIObrabotkaEgo(chisloCom);
        vvodChislaIObrabotkaEgo(chisloCom, pervoeChislo);
    }

    private static int computerZagadyvaetChislo() {
        Random rnd = new Random();
        int n = rnd.nextInt(101);
        System.out.print("Компьютер загадал целое число от 0 до 100" + "\n" + "\n");
        return n;
    }

    private static int vvodPervogoChislaIObrabotkaEgo(int chisloCom) {
        System.out.print("Попробуйте угадать цисло с первой попытки"+"\n");
        int pervoeChislo = vvodChisla();
        if (pervoeChislo == chisloCom) {
            System.out.print("А ты ХОРОШ!" + "\n" + "УСПЕХ!");
            System.exit(1);
        } else {
            System.out.print("Попробуйте еще раз" + "\n");
        }
        return pervoeChislo;
    }

    private static int vvodChisla() {
        int vvedenoeChislo;
        System.out.print("Введите число:" + "\n" + "\n");
        Scanner vvodChisla = new Scanner(System.in);
        while (!vvodChisla.hasNextInt()) {
            System.out.print("Вы допустили ошибку, при вводе"
                    + "\n" + "Попробуйте еще раз!"
                    + "\n" + "Введите число :"
                    + "\n");
            vvodChisla.next();
        }
        vvedenoeChislo = vvodChisla.nextInt();
        return vvedenoeChislo;
    }

    private static void vvodChislaIObrabotkaEgo(int chisloCom, int predidisheeChislo) {
        int vvedenoeChislo;
        do {
            vvedenoeChislo = vvodChisla();
            if (abs(vvedenoeChislo - chisloCom) < abs(predidisheeChislo - chisloCom)) {
                System.out.print("Горячо" + "\n");
            } else {
                System.out.print("Холодно" + "\n");
            }
            predidisheeChislo = vvedenoeChislo;
        }
        while (vvedenoeChislo != chisloCom);
        System.out.println("Вы угадали число!  " + vvedenoeChislo + "\n" + "УСПЕХ!");
    }
}
