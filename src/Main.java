import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> func = (x, y) -> (double) x / y;
        System.out.println(
                func.apply(10, 2)
        );
    }
}
