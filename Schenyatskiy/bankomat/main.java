package Schenyatskiy.bankomat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int k = vybor_scheta();
        int chet = peredacha_cheta(k);

        tcykol1(chet);

    }

    private static int vybor_scheta() {
        System.out.print("\n" + "Вас приветствует программа \"Банкомат\"" + "\n" + "Выберете счет"
                + "\n" + "1) Текущий"
                + "\n" + "2) Дебетовый"
                + "\n" + "3) Кредитный"
                + "\n" + "4) Выход"
                + "\n");

        Scanner G = new Scanner(System.in);
        while (!G.hasNextInt()) {
            System.out.print("Выбирите счет:" + "\n");
            G.next();
        }
        int c = G.nextInt();
        if (kreditniy.chet < (-20000) && c == 2) {
            System.out.print("Вам запрещенно работь с дебетовым счетом, " +
                    "по причине задолжности более 20000 на кредитном счете" + "\n" + "\n");
            System.out.print("\n" + "Выберете счет"
                    + "\n" + "1) Текущий"
                    + "\n" + "3) Кредитный"
                    + "\n" + "4) Выход"
                    + "\n");

            Scanner Q = new Scanner(System.in);
            while (!Q.hasNextInt()) {
                System.out.print("Выбирите счет:" + "\n");
                Q.next();
                c = Q.nextInt();
            }}

            if (c == 4) {
                System.exit(1);
            }
            return c;
        }

    private static int peredacha_cheta(int k) {
        int chet;
        switch (k) {
            case 1:
                System.out.print("Вы выбрали текущий счет" + "\n" + "\n");
                chet = tecushiy.chet;
                break;
            case 2:
                System.out.print("Вы выбрали дебетовый счет" + "\n" + "\n");
                chet = debetoviy.chet;
                break;
            case 3:
                System.out.print("Вы выбрали кредитный счет" + "\n" + "\n");
                chet = kreditniy.chet;
                break;
//            case 4:
//                System.exit(1);
//                break;
            default:
                throw new IllegalStateException("Unexpected value: " + k);
        }
        return chet;
    }

    private static void tcykol1(int chet) {
        int c;
        do {
            c = start_menu();
            chet = shag(c, chet);
        } while (c != 4);
    }

    private static int snytie(int chet) {
        int d;
        do {
            d = chislo();
            if (d > 30000) {
                System.out.print("Запрещено снятие болеее 30000 за один сеанс!"
                        + "\n" + "Пожалуйста, укажите сумму менее 30000" + "\n");
            }
        }
        while (d > 30_000);

        chet -= d;
        if (chet < 0) {
            System.out.print("Недостаточно средств" + "\n");
            chet += d;
        } else {
            System.out.print("На вашем счету осталось   " + chet + "\n");

        }
        return chet;
    }

    private static int polozit(int chet) {
        int d = chislo();
        chet += d;
        System.out.print("Баланс вашего счета  " + chet + "\n" + "\n");
        return chet;
    }

    private static int start_menu() {
        System.out.print("\n" + "Выберете действие"
                + "\n" + "1) Снять деньги"
                + "\n" + "2) Внести деньги"
                + "\n" + "3) Баланс"
                + "\n" + "4) Выход"
                + "\n");

        Scanner G = new Scanner(System.in);
        while (!G.hasNextInt()) {
            System.out.print("Выбирите пункт меню:" + "\n");
            G.next();
        }
//        int c = G.nextInt();
        return G.nextInt();
    }

    private static int shag(int c, int chet) {
        switch (c) {
            case 1:
                System.out.print("Выбирите сумму которую желаете снять");
                chet = snytie(chet);
                break;
            case 2:
                System.out.print("Вставте деньги в купюро приемник");
                chet = polozit(chet);
                break;
            case 3:
                System.out.print("Баланс вашего счета  " + chet + "\n" + "\n");
                break;
        }
        return chet;
    }

    private static int chislo() {
        int d;
        System.out.print("\n" + "Введите сумму:" + "\n");
        Scanner G = new Scanner(System.in);
        while (!G.hasNextInt()) {
            System.out.print("Введите:" + "\n");
            G.next();
        }
        d = G.nextInt();
        return d;
    }
//    private static int cheta(int p){
//        ArrayList<int> cats = new ArrayList<>(4);
//     int deb=new int(15000);
//    }
}
