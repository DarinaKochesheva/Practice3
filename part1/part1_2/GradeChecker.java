package part1.part1_2;

public class GradeChecker {

    public static String getGradeClassic(int score) {
        // TODO: реализуйте вариант через классический switch.
        // Подсказка: удобно сначала вычислить "десяток" score / 10.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int tens = score / 10;
        switch (tens) {
            case 10:
            case 9:
                return "Отлично (A)";
            case 8:
                return "Хорошо (B)";
            case 7:
                return "Удовлетворительно (C)";
            case 6:
                return "Слабо (D)";
            default:
                return "Неудовлетворительно (F)";
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String getGradeArrow(int score) {
        // TODO: реализуйте вариант через switch -> (Java 14+).
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int tens = score / 10;
        switch (tens) {
            case 10, 9 -> { return "Отлично (A)"; }
            case 8 -> { return "Хорошо (B)"; }
            case 7 -> { return "Удовлетворительно (C)"; }
            case 6 -> { return "Слабо (D)"; }
            default -> { return "Неудовлетворительно (F)"; }
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        int[] samples = {95, 85, 73, 62, 45, 100, 0};
        for (int score : samples) {
            System.out.printf("%d -> classic: %s | arrow: %s%n",
                score, getGradeClassic(score), getGradeArrow(score));
        }
        // Проверь себя: для одного score оба метода дают одинаковую оценку.
    }
}
