package part1.part1_3;

public class ObjectDescriber {

    public static String describe(Object obj) {
        // TODO: используйте switch с pattern matching (Java 17+ preview).
        // Подсказка 1: обработайте null отдельным case.
        // Подсказка 2: для Integer укажите "положительное" или "не положительное".
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        switch (obj) {
            case null -> {
                return "null";
            }
            case Integer i -> {
                if (i > 0) {
                    return "Integer: положительное (" + i + ")";
                } else {
                    return "Integer: не положительное (" + i + ")";
                }
            }
            case String s -> {
                if (s.isEmpty()) {
                    return "String: пустая";
                } else {
                    return "String: непустая (\"" + s + "\")";
                }
            }
            case Double d -> {
                return "Double: " + d;
            }
            case int[] arr -> {
                return "int[]: длина " + arr.length;
            }
            default -> {
                return "Другой объект: " + obj;
            }
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        Object[] samples = {null, 42, -5, "", "Привет", 3.14, new int[]{1, 2, 3}, true};
        for (Object sample : samples) {
            System.out.println(describe(sample));
        }
        // Проверь себя: пустая строка и непустая строка должны различаться.
        // Типичные ошибки: забывают обработать default.
    }
}
