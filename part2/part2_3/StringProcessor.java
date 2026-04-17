package part2.part2_3;

public class StringProcessor {
    private static final String VOWELS = "aeiouyаеёиоуыэюя";

    public static int countVowels(String text) {
        // TODO: посчитайте русские и английские гласные.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (text == null) return 0;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (VOWELS.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static boolean isPalindrome(String text) {
        // TODO: палиндром без учета регистра и знаков препинания.
        // Подсказка: сравнение символов с двух концов.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (text == null) return false;
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String cleanedStr = cleaned.toString();
        int left = 0;
        int right = cleanedStr.length() - 1;
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String reverse(String text) {
        // TODO: реверс без StringBuilder.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (text == null) return "";
        if (text.isEmpty()) return "";
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String findLongestWord(String sentence) {
        // TODO: найдите самое длинное слово.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (sentence == null || sentence.isEmpty()) return "";
        String longest = "";
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '-' || c == '\'') {
                currentWord.append(c);
            } else {
                if (currentWord.length() > longest.length()) {
                    longest = currentWord.toString();
                }
                currentWord = new StringBuilder();
            }
        }
        if (currentWord.length() > longest.length()) {
            longest = currentWord.toString();
        }
        return longest;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        String s1 = "Привет, Java-разработчик!";
        String s2 = "топот";
        String s3 = "Madam";
        String s4 = "hello";
        String s5 = "А роза упала на лапу Азора";
        String s6 = "The quick brown fox jumps over the lazy dog";

        System.out.println("Гласные: " + countVowels(s1));
        System.out.println("Палиндром (топот): " + isPalindrome(s2));
        System.out.println("Палиндром (Madam): " + isPalindrome(s3));
        System.out.println("Реверс (hello): " + reverse(s4));
        System.out.println("Палиндром (фраза): " + isPalindrome(s5));
        System.out.println("Самое длинное слово: " + findLongestWord(s6));
    }
}
