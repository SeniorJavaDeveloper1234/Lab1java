
public class LucasNumber {
    private int index;
    private long value;

    public LucasNumber(int index, long value) {
        this.index = index;
        this.value = value;
    }
    public int getIndex() {

        return index;
    }

    public long getValue() {

        return value;
    }

    public boolean isCube() {
        long root = Math.round(Math.cbrt(value));
        return root * root * root == value;
    }
}
