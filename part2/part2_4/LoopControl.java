package part2.part2_4;

public class LoopControl {
    public static void main(String[] args) {
        System.out.println("--- Первое простое > 100 ---");
        int n = 101;
        outer:
        while (true) {
            if (n % 2 == 0 && n != 2) {
                n++;
                continue;
            }
            for (int d = 3; d * d <= n; d += 2) {
                if (n % d == 0) {
                    n++;
                    continue outer;
                }
            }
            break;
        }
        System.out.println("Первое простое > 100: " + n);

        System.out.println("\n--- Нечётные, не кратные 3 (от 1 до 20) ---");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) continue;
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n--- Поиск в матрице ---");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        int foundRow = -1, foundCol = -1;

        search:
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    foundRow = row;
                    foundCol = col;
                    break search;
                }
            }
        }

        if (foundRow != -1) {
            System.out.printf("Число %d найдено на позиции [%d][%d]%n", target, foundRow, foundCol);
        }

        // TODO: объясните в комментарии ниже 3 пункта из задания 2.4.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        // 1) как работают метки outer: и search:
        // Позволяют break/continue управлять не только внутренним циклом, но и любым внешним по имени. Без метки — только ближайший цикл.
        // 2) что делает continue outer на строке с проверкой делителей
        // При нахождении делителя (не простого числа) — переходит сразу же на следующую итерацию внешнего цикла, не до конца проверяя текущий кандидат. Тем самым,экономя лишние проверки.
        // 3) какой результат выведет каждый из трёх блоков программы?
        // Первый блок:
        // --- Первое простое > 100 ---
        //Первое простое > 100: 101

        // Второй блок:
        //--- Нечётные, не кратные 3 (от 1 до 20) ---
        //1 5 7 11 13 17 19

        // Третий блок:
        //--- Поиск в матрице ---
        //Число 5 найдено на позиции [1][1]
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }
}
