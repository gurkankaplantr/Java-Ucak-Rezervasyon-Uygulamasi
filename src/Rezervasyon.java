import java.util.Random;

public class Rezervasyon {
    public int ucret;
    private Random random = new Random();

    public Rezervasyon() {
        ucret = random.nextInt(6500 - 1000 + 1) + 1000;
    }
}
