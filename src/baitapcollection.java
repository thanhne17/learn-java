import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class baitapcollection {
    public static void main(String[] args) {
        System.out.println("nhap vao n phan tu: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i=0;i<n;i++){
            Random rd = new Random();
            int rdValue = rd.nextInt(101)-1;
            lst.add(rdValue);
        }
        System.out.println("mang: "+lst);

        for (int i=0;lst.size()>i;i++){
            double lsti = (double) lst.get(i);
            double newValue = Math.pow(lsti, 2);
            int newValue2 = (int) newValue;
            lst.set(i, newValue2);
        }

        System.out.println(lst);
        int a=0;
        for (int x: lst){
            if(x>50){
                a++;
            }
            else {

            }
        }
        System.out.println("so lon hon 50 la: "+a);
    }
}
