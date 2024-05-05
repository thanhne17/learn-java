import java.util.ArrayList;

public class javamath {
    public static void main(String[] args) {
        System.out.println(Math.max(1, 1111111111));
        int goc = 80;
        double sin = Math.sin(Math.PI * goc / 180);
        double cos = Math.cos(Math.PI * goc / 180);
        double tan = Math.tan(Math.PI * goc / 180);
        for (int i = 0; i < 10; i++) {
            double randomValue = Math.random();
            int random = (int) (randomValue*10);
            System.out.println(random);
        }


    }
}
