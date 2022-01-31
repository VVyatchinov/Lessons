package io.metadevs.vvyatchinov;

public class Lesson3 {

    public static void main(String[] args) {
        int num = 0;
        switch (num) {
            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
        comparisonsOperators(3);
        loops();
        leapyearCheck(85);

    }

    public static void comparisonsOperators(int cum) {
//         != - оператор сравнения "не равно"
//         && - быстрый оператор "и". Возвращает true тогда, когда все выражения истинны
//         - быстрый "или" . Возвращает false только тогда, когда все выражения ложны

        int num = 0;
        if (num != 8 && num != 1 && num != 9) {
            System.out.println("Число не равно 1, 8, 9");
        } else System.out.println("Число равно 1, 8, или 9");

        if (num == 0 || num == 1) {
            System.out.println("Число равно 1 или 0");
        } else {
            System.out.println("Число не равно ни 1, ни 0");
        }

    }

    public static void loops() {
        int counter = 1;
        while (counter < 100) {
            counter++;
            System.out.println(counter);
        }
    }

    public static void leapyearCheck(int year) {
        while (year >= 0) {
            if (year % 4 == 0) {
                System.out.println("Високосный год: " + year);
            }
            year--;  // эта запись означает отнять единицу у year"
        }
    }
}
