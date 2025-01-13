import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        // Блок 1: Вывод характеристик компьютера
        System.out.println("\n1. Вывод характеристик компьютера\n");

        byte cores = 4;
        short threads = 8;
        int ram = 12;
        long windowsVersion = 11;
        float ramFrequency = 2133.5f;
        double cpuFrequency = 3.5;
        char laptopModel = 'X';
        boolean hasGpu = true;

        System.out.println("Описание характеристик компьютера:");
        System.out.println("Количество ядер процессора: " + cores);
        System.out.println("Количество потоков: " + threads);
        System.out.println("Объем RAM: " + ram + " GB");
        System.out.println("Версия Windows: " + windowsVersion);
        System.out.println("Частота RAM: " + ramFrequency + " MHz");
        System.out.println("Частота процессора: " + cpuFrequency + " GHz");
        System.out.println("Модель ноутбука: " + laptopModel);
        System.out.println("Наличие GPU: " + hasGpu);

        // Задача 2: Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        float penPrice = 105.5f;
        float bookPrice = 235.83f;
        float discount = 0.11f;
        
        float totalPrice = penPrice;
        totalPrice += bookPrice;
        float discountAmount = totalPrice;
        discountAmount *= discount;
        float priceWithDiscount = totalPrice;
        priceWithDiscount -= discountAmount;
        
        System.out.println("Стоимость товаров без скидки: " + totalPrice);
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Стоимость товаров со скидкой: " + priceWithDiscount);

        // Задача 3: Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        // Задача 4: Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;
        char c = Character.MAX_VALUE;
        
        System.out.println("byte: " + b);
        System.out.println("byte после инкремента: " + (b + 1));
        System.out.println("byte после декремента: " + (b - 1));
        
        System.out.println("short: " + s);
        System.out.println("short после инкремента: " + (s + 1));
        System.out.println("short после декремента: " + (s - 1));
        
        System.out.println("int: " + i);
        System.out.println("int после инкремента: " + (i + 1));
        System.out.println("int после декремента: " + (i - 1));
        
        System.out.println("long: " + l);
        System.out.println("long после инкремента: " + (l + 1));
        System.out.println("long после декремента: " + (l - 1));
        
        System.out.println("char: " + (int) c);
        System.out.println("char после инкремента: " + (int) (c + 1));
        System.out.println("char после декремента: " + (int) (c - 1));

        // Задача 5: Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных\n");

        int x = 2;
        int y = 5;
        System.out.println("Исходные значения: x = " + x + ", y = " + y);
        
        int temp = x;
        x = y;
        y = temp;
        System.out.println("С помощью третьей переменной: x = " + x + ", y = " + y);
        
        x = 2;
        y = 5;
        x += y;
        y = x - y;
        x -= y;
        System.out.println("С помощью арифметических операций: x = " + x + ", y = " + y);
        
        x = 2;
        y = 5;
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("С помощью побитовой операции ^: x = " + x + ", y = " + y);

        // Задача 6: Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов\n");

        char dollar = 36;
        char asteriks = 42;
        char at = 64;
        char line = 124;
        char tilde = 126;
        
        System.out.println((int) dollar + " " + dollar);
        System.out.println((int) asteriks + " " + asteriks);
        System.out.println((int) at + " " + at);
        System.out.println((int) line + " " + line);
        System.out.println((int) tilde + " " + tilde);

        // Задача 7: Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + openParenthesis + " " + closeParenthesis + 
                backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + "" + underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash + backslash);

        // Задача 8: Манипуляции с сотнями, десятками и единицами числа
        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа\n");

        int number = 123;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        
        int sum = hundreds + tens + ones;
        int multiplication = hundreds * tens * ones;
        
        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);
        System.out.println("Сумма разрядов = " + sum);
        System.out.println("Произведение разрядов = " + multiplication);

        // Задача 9: Перевод секунд в часы, минуты и секунды
        System.out.println("\n9. Перевод секунд в часы, минуты и секунды\n");

        int total = 86399;
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;
        
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));

        // Задача 10: *Расчет стоимости товара со скидкой
        System.out.println("\n10. *Расчет стоимости товара со скидкой\n");

        var penCost = new BigDecimal("105.5");
        var bookCost = new BigDecimal("235.83");
        var discountCost = new BigDecimal("0.11");
        
        var totalPriceCost = penCost.add(bookCost);
        var discountAmountCost = totalPriceCost.multiply(discountCost);
        var priceWithDiscountCost = totalPriceCost.subtract(discountAmountCost);
        
        System.out.println("Стоимость товаров без скидки: " + totalPriceCost.setScale(2, 
                RoundingMode.HALF_UP));
        System.out.println("Сумма скидки: " + discountAmountCost.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Стоимость товаров со скидкой: " + priceWithDiscountCost.setScale(2, 
                RoundingMode.HALF_UP));
    }
}
