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
        System.out.println("Объем RAM: " + ram + " GB DDR4");
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
        
        float basePrice = penPrice + bookPrice;
        float discountAmount = basePrice * discount;
        float discountPrice = basePrice - discountAmount;
        
        System.out.println("Стоимость товаров без скидки: " + basePrice);
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Стоимость товаров со скидкой: " + discountPrice);

        // Задача 3: Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        // Задача 4: Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte b = Byte.MAX_VALUE;
        
        System.out.println("byte: " + b);
        System.out.println("byte после инкремента: " + (++b));
        System.out.println("byte после декремента: " + (--b));
        System.out.println("");

        short s = Short.MAX_VALUE;
        
        System.out.println("short: " + s);
        System.out.println("short после инкремента: " + (++s));
        System.out.println("short после декремента: " + (--s));
        System.out.println("");

        int i = Integer.MAX_VALUE;
        
        System.out.println("int: " + i);
        System.out.println("int после инкремента: " + (++i));
        System.out.println("int после декремента: " + (--i));
        System.out.println("");

        long l = Long.MAX_VALUE;
        
        System.out.println("long: " + l);
        System.out.println("long после инкремента: " + (--l));
        System.out.println("long после декремента: " + (--l));
        System.out.println("");

        char c = Character.MAX_VALUE;
        
        System.out.println("char: " + (int) c);
        System.out.println("char после инкремента: " + (int) (++c));
        System.out.println("char после декремента: " + (int) (--c));

        // Задача 5: Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных\n");

        int x = 2;
        int y = 5;
        System.out.println("Исходные значения: x = " + x + ", y = " + y);
        
        int temp = x;
        x = y;
        y = temp;
        System.out.println("С помощью третьей переменной: x = " + x + ", y = " + y);
        
        x += y;
        y = x - y;
        x -= y;
        System.out.println("С помощью арифметических операций: x = " + x + ", y = " + y);
        
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("С помощью побитовой операции ^: x = " + x + ", y = " + y);

        // Задача 6: Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов\n");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char line = '|';
        char tilde = '~';
        
        System.out.println((int) dollar + " " + dollar);
        System.out.println((int) asterisk + " " + asterisk);
        System.out.println((int) atSign + " " + atSign);
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
        System.out.println("  " + slash + underscore + openParenthesis + " " + 
                closeParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash);

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

        var penPriceBd = new BigDecimal("105.5");
        var bookPriceBd = new BigDecimal("235.83");
        var discountBd = new BigDecimal("0.11");
        
        var basePriceBd = penPriceBd.add(bookPriceBd);
        var discountAmountBd = basePriceBd.multiply(discountBd);
        var discountPriceBd = basePriceBd.subtract(discountAmountBd);
        
        System.out.println("Стоимость товаров без скидки: " + 
                basePriceBd.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Сумма скидки: " + discountAmountBd.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Стоимость товаров со скидкой: " + 
                discountPriceBd.setScale(2, RoundingMode.HALF_UP));
    }
}