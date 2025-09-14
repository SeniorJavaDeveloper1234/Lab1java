/**
 * Клас для представлення числа Люка.
 * Зберігає номер у послідовності та його значення.
 */
public class LucasNumber {
    private int index;
    private long value;

    /**
     * Конструктор створює нове число Люка.
     * @param index номер числа у послідовності
     * @param value значення числа Люка
     */
    public LucasNumber(int index, long value) {
        this.index = index;
        this.value = value;
    }

    /**
     * Повертає номер числа у послідовності.
     * @return номер числа
     */
    public int getIndex() {
        return index;
    }

    /**
     * Повертає значення числа Люка.
     * @return значення
     */
    public long getValue() {
        return value;
    }

    /**
     * Перевіряє, чи є число досконалим кубом.
     * @return true, якщо число є кубом; false — інакше
     */
    public boolean isCube() {
        long root = Math.round(Math.cbrt(value));
        return root * root * root == value;
    }
}
