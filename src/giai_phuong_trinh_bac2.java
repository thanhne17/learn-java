import java.util.Scanner;

public class giai_phuong_trinh_bac2 {
    public static void main(String[] args) {
        //ax^2 + bx + c = 0  Tính Δ=b2-4ac
//        Δ < 0 => phương trình (1) vô nghiệm
//        Δ = 0 => phương trình (1) có nghiệm kép x_{1} =x_{2} = - \frac{b}{2a}
//        Δ > 0 => phương trình (1) có 2 nghiệm phân biệt, ta dùng công thức nghiệm sau:
//        x_{1} =\frac{-b+\sqrt{\triangle } }{2a} và x_{2} =\frac{-b-\sqrt{\triangle } }{2a}

        System.out.println("nhap vao so a: ");
        float a = new Scanner(System.in).nextFloat();

        System.out.println("nhap vao so b: ");
        float b = new Scanner(System.in).nextFloat();

        System.out.println("nhap vao so c: ");
        float c = new Scanner(System.in).nextFloat();

        float delta = (float) (Math.pow(b, 2) - 4 * a * c);
        float x, x2;

        if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("pt có 2 nghiệm: " + x);
        } else if (delta < 0) {
            System.out.println(delta);
            System.out.println("pt vô nghiệm");
        } else {
            x = (float) ((-b + Math.sqrt(delta)) / 2 * a);
            x2 = (float) ((-b - Math.sqrt(delta)) / 2 * a);
            System.out.println("pt có 2 nghiệm: ");
            System.out.println(x);
            System.out.println(x2);
        }


    }
}
