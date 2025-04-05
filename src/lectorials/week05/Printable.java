package lectorials.week05;

public interface Printable {
    public default String convertString() {
        return null;
    }
    void print();
}
