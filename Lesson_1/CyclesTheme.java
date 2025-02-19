public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел. \n");

        int segmentStart = -10;
        int segmentEnd = 21;
        int number = segmentStart;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
            number++;
        } while (number <= segmentEnd);

        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d%n",
                segmentStart, segmentEnd, sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания. \n");

        int numberA = 10;
        int numberB = 5;
        int numberC = -1;
        int max;
        int min;

        if (numberA > numberB && numberA > numberC) {
            max = numberA;
        } else {
            if (numberB > numberA && numberB > numberC) {
                max = numberB;
            } else {
                max = numberC;
            }
        }

        if (numberA < numberB && numberA < numberC) {
            min = numberA;
        } else {
            if (numberB < numberA && numberB < numberC) {
                min = numberB;
            } else {
                min = numberC;
            }
        }

        System.out.println("max число = " + max + ",min число = " + min);

        for (int i = max - 1; i > min; i--) {
            System.out.println(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр. \n");

        int straightNumber = 1234;
        int reverseNumber = 0;
        int sumDigits = 0;
        int misc = straightNumber;
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

        for (int i = start; i < end; i++) {
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

        int randomNumber = 3242592;
        int temp = randomNumber;
        int element;
        int counter = 0;

        while (temp != 0) {
            element = temp % 10;
            if (element == 2) {
                counter += 1;
            }
            temp = temp / 10;
        }
        if (counter % 2 == 0) {
            System.out.println("В " + randomNumber + " четное (" + counter + ") количество двоек");
        } else {
            System.out.println("В " + randomNumber + " нечетное (" + counter + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур. \n");

        for (int i = 0; i < 6; i++) {
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
        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%-10d%-10c%s%n", i, (char) i, Character.getName(i));
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (i % 2 == 0) {
                System.out.printf("%-10d%-10c%s%n", i, (char) i, Character.getName(i));
            }
        }
        System.out.println();

        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ. \n");

        int polyndromNumber = 1234321;
        int reverPolyndromNumber = 0;
        int checkPolyndrom = polyndromNumber;

        while (checkPolyndrom != 0) {
            int cifra = checkPolyndrom % 10;
            reverPolyndromNumber = reverPolyndromNumber * 10 + cifra;
            checkPolyndrom = checkPolyndrom / 10;
        }

        String isPolyndrom = (polyndromNumber == reverPolyndromNumber) ? "палиндром" : "не палиндром";

        System.out.printf("Число %d - %s", reverPolyndromNumber, isPolyndrom);
        System.out.println();

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ. \n");

        int luckyNumber = 123321;
        int half = luckyNumber / 1000;
        int otherHalf = luckyNumber % 1000;
        int sumFirst = 0;
        int halfDummy = 0;

        halfDummy = half;
        while (halfDummy != 0) {
            sumFirst += halfDummy % 10;
            halfDummy /= 10;
        }

        int sumSecond = 0;
        halfDummy = otherHalf;
        while (halfDummy != 0) {
            sumSecond += halfDummy % 10;
            halfDummy /= 10;
        }
        String lucky = (sumFirst == sumSecond) ? "счастливое" : "не счастливое";
        System.out.printf("Число %d - %s %nСумма цифр %d = %d %nСумма цифр %d = %d", 
                luckyNumber, lucky, half, sumFirst, otherHalf, sumSecond);

        System.out.println();
        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА. \n");

        System.out.println("  |  2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d |", i);
            for (int k = 2; k <= 9; k++) {
                int p = i * k;
                System.out.printf("%3d", p);
            }
            System.out.println();
        }
    }
}