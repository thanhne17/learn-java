import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class randomjava {
    public static void main(String[] args) {
        Random rd = new Random();

        int sn = rd.nextInt(100)-50;
//        int  sn = ThreadLocalRandom.current().nextInt(-50,51);
        System.out.println(sn);
    }
}
