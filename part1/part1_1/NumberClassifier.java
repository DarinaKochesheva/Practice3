package part1.part1_1;

import java.time.LocalDate;

public class NumberClassifier {

    /**
     * Классифицирует число по диапазонам.
     * Подсказка 1: интервалы должны быть непересекающимися.
     * Подсказка 2: проверяйте от самых специфичных граничных случаев.
     */
    public static String classify(int number) {
        // TODO: верните категорию для number по условию задания.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return "TODO";
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        System.out.println("Group: ИМЯ_ВАШЕЙ_ГРУППЫ");
        System.out.println("Sequence number: ВАШ_ПОРЯДКОВЫЙ_НОМЕР_В_ГРУППЕ");
        System.out.println("Date: " + LocalDate.now());
         // ▲ КОНЕЦ ВАШЕГО КОДА ▲

        int[] samples = {-5, 0, 7, 42, 100, 1000, -999};
        for (int n : samples) {
            System.out.println(n + " -> " + classify(n));
        }
        // Проверь себя: 0 -> ноль, 7 -> однозначное, 1000 -> большое
        // Типичные ошибки: пропущены края 9/10/99/100/999/1000.
    }
}
