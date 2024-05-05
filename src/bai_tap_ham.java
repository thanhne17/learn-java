import java.util.Scanner;

public class bai_tap_ham {
    public static void main(String[] args) {
        float a, b;
        String c;
        do {
            System.out.println("nhap vao so a: ");
            a = new Scanner(System.in).nextFloat();

            System.out.println("nhap vao so b: ");
            b = new Scanner(System.in).nextFloat();

            System.out.println("nhap vao phep tinh: ");
            c = new Scanner(System.in).nextLine();
        }
        while (a == 0 && b == 0);
        double kq = calculator(a, b, c);
        System.out.println(kq);
    }

    public static double calculator(double a, double b, String c) {
        double kq=0;
        switch (c) {
            case "+":
                kq= a + b;
                break;

            case "-":
                kq= a - b;
                break;

            case "*":
                kq= a * b;
                break;

            case "/":
                if(b==0){
                    System.out.println("hihi");
                    kq=12345;
                }
                else{
                    kq= a / b;
                }
                break;
            default:
                System.out.println("concac");
                break;
        }

        return kq;
    }
}
