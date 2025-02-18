import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Блок 1: Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        boolean isMale = true;

        if (!isMale) {
            System.out.println("Женский или средний род.");
        } else {
            System.out.println("Мужской род.");
        }

        int age = 21;

        if (age > 18) {
            System.out.println("Совершеннолетний.");
        } else {
            System.out.println("Несовершеннолетний.");
        }

        float height = 1.75f;

        if (height < 1.8) {
            System.out.println("Отличный рост!");
        } else {
            System.out.println("Высоковато.");
        }

        char firstLetterName = "Nikolai".charAt(0);

        if (firstLetterName == 'M') {
            System.out.println("Это имя на английскую M.");
        } else if (firstLetterName == 'I') {
            System.out.println("Скорее всего это Ivan.");
        } else {
            System.out.println("Интересно, на какую букву это имя?");
        }

        // Блок 2: Поиск большего числа
        System.out.println("\n2. Поиск большего числа\n");

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.printf("Число %d больше числа %d%n.", a, b);
        } else if (a < b) {
            System.out.printf("Число %d меньше числа %d%n", a, b);
        } else {
            System.out.printf("Число %d равно числу %d%n", a, b);
        }

        // Блок 3: Проверка числа
        System.out.println("\n3. Проверка числа\n");

        int anyNumber = 5;

        if (anyNumber == 0) {
            System.out.println("Число = 0.");
        } else {
            System.out.println("Загаданное число - " + anyNumber);
            if (anyNumber % 2 == 0) {
                System.out.println("Число четное.");
            } else {
                System.out.println("Число нечетное.");
            }
            if (anyNumber > 0) {
                System.out.println("Число положительное.");
            } else {
                System.out.println("Число отрицательное.");
            }
        }

        // Блок 4: Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        int firstNumber = 123;
        int secondNumber = 223;

        int hundredsFirstNumber = firstNumber / 100;
        int tensFirstNumber = (firstNumber % 100) / 10;
        int onesFirstNumber = firstNumber % 10;

        int hundredsSecondNumber = secondNumber / 100;
        int tensSecondNumber = (secondNumber % 100) / 10;
        int onesSecondNumber = secondNumber % 10;

        if (hundredsFirstNumber != hundredsSecondNumber && tensFirstNumber != tensSecondNumber && 
                onesFirstNumber != onesSecondNumber) {
            System.out.println("Между двумя числами нет одинаковых цифр в разрядах.");
        } else {
            System.out.println("Исходные числа: " + firstNumber + " и " + secondNumber);
            if (hundredsFirstNumber == hundredsSecondNumber) {
                System.out.println("Одинаковые разряды сотен: " + hundredsFirstNumber);
            }
            if (tensFirstNumber == tensSecondNumber) {
                System.out.println("Одинаковые разряды десятков: " + tensFirstNumber);
            }
            if (onesFirstNumber == onesSecondNumber) {
                System.out.println("Одинаковые разряды единиц: " + onesFirstNumber);
            }
        }

        // Блок 5: Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду\n");

        char secretChar = '\u0057';

        if (secretChar >= 'A' && secretChar <= 'Z') {
            System.out.println("'" + secretChar + "' - большая буква");
        } else if (secretChar >= 'a' && secretChar <= 'z') {
            System.out.println("'" + secretChar + "' - маленькая буква");
        } else if (secretChar >= '0' && secretChar <= '9') {
            System.out.println("'" + secretChar + "' - цифра");
        } else {
            System.out.println("'" + secretChar + "' - ни буква и ни цифра");
        }

        // Блок 6: Подсчет начисленных банком %
        System.out.println("\n6. Подсчет начисленных банком %\n");

        double deposit = 321123.59;
        double interestRate = 0.10;

        if (deposit < 100000) {
            interestRate = 0.05;
        } else if (deposit <= 300000) {
            interestRate = 0.07;
        }

        double interest = deposit * interestRate;
        double totalAmount = deposit + interest;

        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Сумма начисленного %: " + interest + " руб.");
        System.out.println("Итоговая сумма с %: " + totalAmount + " руб.");

        // Блок 7: Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам\n");

        int historyPercent = 59;
        int historyGrade = 5;


        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        }

        int programmingPercent = 92;
        int programmingGrade = 5;

        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        }

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);

        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercent = (historyPercent + programmingPercent) / 2.0;

        System.out.println("Средний балл оценок по предметам: " + averageGrade);
        System.out.println("Средний % по предметам: " + averagePercent);

        // Блок 8: Расчет годовой прибыли
        System.out.println("\n8. Расчет годовой прибыли\n");

        double monthlySales = 13025.233;
        double monthlyRent = 5123.018;
        double monthlyCost = 9001.729;

        double yearlyProfit = (monthlySales - monthlyRent - monthlyCost) * 12;

        if (yearlyProfit > 0) {
            System.out.printf("Прибыль за год: +%.2f руб.\n", yearlyProfit);
        } else {
            System.out.printf("Прибыль за год: %.2f руб.\n", yearlyProfit);
        }

        // Блок 9: Расчет годовой прибыли
        System.out.println("\n9. Расчет годовой прибыли\n");

        BigDecimal monthlySalesBd = new BigDecimal("13025.233");
        BigDecimal monthlyRentBd = new BigDecimal("5123.018");
        BigDecimal monthlyCostBd = new BigDecimal("9001.729");

        BigDecimal yearlyProfitBd = 
                (monthlySalesBd.subtract(monthlyRentBd).subtract(monthlyCostBd))
                        .multiply(BigDecimal.valueOf(12));

            System.out.printf("Прибыль за год: %.2f руб.\n", 
                    yearlyProfitBd.setScale(2, RoundingMode.HALF_UP));

        // Блок 10: Подсчет начисленных банком %
        System.out.println("\n10. Подсчет начисленных банком %\n");

        BigDecimal depositBd = new BigDecimal("321123.59");
        BigDecimal interestRateBd = new BigDecimal("0.10");

        if (depositBd.compareTo(BigDecimal.valueOf(100000)) < 0) {
            interestRateBd = new BigDecimal("0.05");
        } else if (depositBd.compareTo(BigDecimal.valueOf(300000)) <= 0) {
            interestRateBd = new BigDecimal("0.07");
        }

        BigDecimal interestBd = depositBd.multiply(interestRateBd);
        BigDecimal totalAmountBd = depositBd.add(interestBd);

        System.out.println("Сумма вклада: " + 
                depositBd.setScale(2, RoundingMode.HALF_UP) + " руб.");
        System.out.println("Сумма начисленного %: " + 
                interestBd.setScale(2, RoundingMode.HALF_UP) + " руб.");
        System.out.println("Итоговая сумма с %: " + 
                totalAmountBd.setScale(2, RoundingMode.HALF_UP) + " руб.");
    }
}