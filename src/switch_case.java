import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        System.out.println("1: Tìm tên");
        System.out.println("2: Tìm tiêu đề");

        int scaner = new Scanner(System.in).nextInt();
//        do {
//            int sc = new Scanner(System.in).nextInt();
//        }while (Integer.parseInt(scaner));

        switch (scaner) {
            case 0:
                System.out.println("s0 chan");
                break;
            default:
                System.out.println("s0 le");
        }
    }
}
