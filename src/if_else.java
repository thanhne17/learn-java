import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
//        System.out.println("nhap so bat ky: ");
//        int a = new Scanner(System.in).nextInt();
//        if (a < 2 && a == 1) {
//            System.out.println("haha");
//        }
//        else if (a > 2 && a == 3) {
//            System.out.println("haii");
//        }
//        else {
//            System.out.println("huhu");
//        }
        System.out.println("nhap vao tong: ");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("nhap vao HIEU: ");
        double b = new Scanner(System.in).nextDouble();

        double sl = (a+b)/2;
        double sb = a-sl;
        System.out.println("số lớn là: "+sl);
        System.out.println("số bé là: "+sb);
    }
}
