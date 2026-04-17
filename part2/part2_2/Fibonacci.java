package part2.part2_2;

public class Fibonacci {

    public static long fibIterative(int n) {
        // TODO: реализуйте while-вариант.
        // Подсказка: базовые случаи n=0 и n=1 обработайте отдельно.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0;
        long b = 1;
        long result = 0;
        int count = 1;
        while (count < n) {
            result = a + b;
            a = b;
            b = result;
            count++;
        }
        return result;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static long fibFor(int n) {
        // TODO: реализуйте for-вариант.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0;
        long b = 1;
        long result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static long firstGreaterThan(long threshold) {
        // TODO: найдите первое число Фибоначчи > threshold.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (threshold < 0) return 0;
        long a = 0;
        long b = 1;
        while (a <= threshold) {
            long next = a + b;
            a = b;
            b = next;
        }
        return a;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            System.out.printf("F(%d)=%d | %d%n", i, fibIterative(i), fibFor(i));
        }
        System.out.println("Первое число Фибоначчи > 1000: " + firstGreaterThan(1000));
        // Проверь себя: обе реализации fib дают одинаковые значения.
    }
}
