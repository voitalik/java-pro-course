import java.util.List;

public class Main {
    public static void main(String[] args) {
        animalsVoice(List.of(new Cow(), new Cow()));
        animalsVoice(List.of(new Animal(), new Animal()));
    }

    public static void animalsVoice(List<? super Cow> cowsOrParent) {
        for (Object obj : cowsOrParent) {
            if (obj instanceof Cow cow) {
                cow.voice();
            } else {
                System.out.println("Чупакрабра якась...");
            }
        }
    }
}
