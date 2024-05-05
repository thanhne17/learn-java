import java.util.Scanner;

public class bai_tap_ifelse {
    public static void main(String[] args) {
        System.out.println("nhapak vào cân nặng:");
        double kg = new Scanner(System.in).nextDouble();

        System.out.println("nhapak vào chiều cao:");
        double cm = new Scanner(System.in).nextDouble();

        double bmi = kg / (Math.pow(cm/100,2));

        if (bmi > 15 ) {
            System.out.println("gay qua1");
        }
        else if (bmi > 25 ) {
            System.out.println("gay qua2");
        }
        else if (bmi > 35 ) {
            System.out.println("gay qua3");
        }
        else {
            System.out.println("beo qua");
        }
    }

}
