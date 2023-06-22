import java.util.HashMap;
import java.util.Map;

public class UniqueCharacterFinder {

    public static char findFirstUniqueCharacter(String text) {
        // Використовуємо HashMap для підрахунку кількості зустрічання кожного символу
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Проходимося по кожному слову в тексті
        for (String word : text.split("\\s+")) {
            // Проходимося по кожному символу в слові
            for (char c : word.toCharArray()) {
                // Оновлюємо кількість зустрічань символу
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Проходимося по кожному слову в тексті
        for (String word : text.split("\\s+")) {
            // Проходимося по кожному символу в слові
            for (char c : word.toCharArray()) {
                // Перевіряємо, чи символ зустрічається лише один раз
                if (charCountMap.get(c) == 1) {
                    return c; // Повертаємо перший унікальний символ
                }
            }
        }
        // Якщо унікальний символ не знайдено, повертаємо '\0'
        return '\0';
    }

    public static void main(String[] args) {
        String text = "The Tao gave birth to machine language. Machine language gave birth to the assembler. "
                + "The assembler gave birth to the compiler. Now there are ten thousand languages. "
                + "Each language has its purpose, however humble. Each language expresses the Yin and Yang of software. "
                + "Each language has its place within the Tao. "
                + "But do not program in COBOL if you can avoid it. "
                + "-- Geoffrey James, \"The Tao of Programming\"";

        char uniqueChar = findFirstUniqueCharacter(text);
        System.out.println("The first unique char: " + uniqueChar);
    }
}

