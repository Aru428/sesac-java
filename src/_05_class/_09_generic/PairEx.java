package _05_class._09_generic;

public class PairEx {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<Integer, String> pair2 = new Pair<>(2, "Two");

        System.out.printf("Key: %s, Value: %d\n", pair1.getKey(), pair1.getValue());
        System.out.printf("Key: %d, Value: %s\n", pair2.getKey(), pair2.getValue());
    }
}
