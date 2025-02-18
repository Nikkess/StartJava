public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел. \n");

        int a = -10;
        int b = 21;
        int i = a;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i <= b);

        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d%n",
                a, b, sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания. \n");

        int ten = 10;
        int five = 5;
        int minusOne = -1;
        int max;
        int min;

        if (ten > five && ten > minusOne) {
            max = ten;
        } else {
            if (five > ten && five > minusOne) {
                max = five;
            } else {
                max = minusOne;
            }
        }

        if (ten < five && ten < minusOne) {
            min = ten;
        } else {
            if (five < ten && five < minusOne) {
                min = five;
            } else {
                min = minusOne;
            }
        }

        System.out.println("max число = " + max + ",min число = " + min);

        for (i = max - 1; i > min; i--) {
            System.out.println(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр. \n");

        int number = 1234;
        int reverseNumber = 0;
        int sumDigits = 0;
        int misc = number;
        int digit;

        while (misc != 0) {
            digit = misc % 10;
            sumDigits += digit;
            reverseNumber = reverseNumber * 10 + digit;
            digit = 0;
            misc = misc / 10;
        }

        System.out.println("Исходное число в обратном порядке - " + reverseNumber + 
                " Сумма выделенных чисел - " + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк. \n");

        int start = 1;
        int end = 24;
        int count = 0;

        for (i = start; i < end; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }

        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }
        System.out.println();

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность. \n");

        int example = 3242592;
        int temp = example;
        int oneDigit;
        int counter = 0;

        while (temp != 0) {
            oneDigit = temp % 10;
            if (oneDigit == 2) {
                counter += 1;
            }
            temp = temp / 10;
        }
        if (counter % 2 == 0) {
            System.out.println("В " + example + " четное (" + counter + ") количество двоек");
        } else {
            System.out.println("В " + example + " нечетное (" + counter + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур. \n");

        for (i = 0; i < 6; i++) {
            System.out.println("**********");
        }
        System.out.println();

        int height = 5;
        int width = 5;

        while (height != 0) {
            int widthNow = width;
            while (widthNow != 0) {
                System.out.print("#");
                widthNow--;
            }
            System.out.println();
            height--;
            width--;
        }
        System.out.println();

        int rows = 5;
        int currentRow = 1;

        do {
            int reps = 1;
            do {
                System.out.print("$");
                reps++;
            } while (reps <= currentRow);
            System.out.println();
            currentRow++;
        } while (currentRow <= 3);

        do {
            int reps = 1;
            do {
                System.out.print("$");
                reps++;
            } while (reps <= (rows - currentRow) + 1);
            System.out.println();
            currentRow++;
        } while (currentRow <= rows);

        System.out.println("\n7. Вывод ASCII-символов. \n");

        System.out.printf("%-10s%-10s%s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%-10d%-10c%s%n", i, (char) i, Character.getName(i));
            }
        }
        for (i = 'a'; i <= 'z'; i++) {
            if (i % 2 == 0) {
                System.out.printf("%-10d%-10c%s%n", i, (char) i, Character.getName(i));
            }
        }
        System.out.println();

        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ. \n");

        int polyndrom = 1234321;
        int polyndrom2 = 0;
        int checkPolyndrom = polyndrom;

        while (checkPolyndrom != 0) {
            int cifra = checkPolyndrom % 10;
            polyndrom2 = polyndrom2 * 10 + cifra;
            checkPolyndrom = checkPolyndrom / 10;
        }

        String isPolyndrom = (polyndrom == polyndrom2) ? "палиндром" : "не палиндром";

        System.out.printf("Число %d - %s", polyndrom2, isPolyndrom);
        System.out.println();
        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ. \n");

        int luckyNumber = 123321;
        int half = luckyNumber / 1000;
        int otherHalf = luckyNumber % 1000;
        int sumFirst = 0;
        int temporary = 0;

        temporary = half;
        while (temporary != 0) {
            sumFirst += temporary % 10;
            temporary /= 10;
        }

        int sumSecond = 0;
        temporary = otherHalf;
        while (temporary != 0) {
            sumSecond += temporary % 10;
            temporary /= 10;
        }
        String lucky = (sumFirst == sumSecond) ? "счастливое" : "не счастливое";
        System.out.printf("Число %d - %s %nСумма цифр %d = %d %nСумма цифр %d = %d", 
                luckyNumber, lucky, half, sumFirst, otherHalf, sumSecond);

        System.out.println();
        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА. \n");

        System.out.println("  |  2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------");
        for (i = 2; i <= 9; i++) {
            System.out.printf("%d |", i);
            for (int k = 2; k <= 9; k++) {
                int p = i * k;
                System.out.printf("%3d", p);
            }
            System.out.println();
        }
    }
}