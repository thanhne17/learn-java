import java.util.Scanner;

public class ham {

    public static void main(String[] args) {

        System.out.println("nhap vao so a: ");
        float a = new Scanner(System.in).nextFloat();

        System.out.println("nhap vao so b: ");
        float b = new Scanner(System.in).nextFloat();

        System.out.println("nhap vao so c: ");
        float c = new Scanner(System.in).nextFloat();
        String kq = cong(a, b, c);
        System.out.println(kq);
    }

    public static String cong (float q, float w, float e) {

        float delta = (float) (Math.pow(w, 2) - 4 * q * e);
        float x=0, x2;

        if (delta == 0) {
            x = -w / (2 * q);
//            System.out.println("pt có 2 nghiệm: " + x);
            return "pt có 2 nghiệm: " + x;
        } else if (delta < 0) {
            System.out.println(delta);
            return "pt vô nghiệm";
        } else {
            x = (float) ((-w + Math.sqrt(delta)) / 2 * q);
            x2 = (float) ((-w - Math.sqrt(delta)) / 2 * q);
            return  "pt có 2 nghiệm: x1= "+x+" x2= "+x2;
        }
    }
}
