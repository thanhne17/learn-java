import java.util.Scanner;

public class kieuchar {
    public static void main(String[] args) {
        System.out.println("nhap vào 1 ký tự: ");
        Scanner sc = new Scanner(System.in);

        String kytu = sc.nextLine();

        char kytu1 = kytu.charAt(0);

        System.out.println(kytu1);
    }
}
