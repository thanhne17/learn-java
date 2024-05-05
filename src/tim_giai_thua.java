import java.util.Scanner;

public class tim_giai_thua {
    public static void main(String[] args) {
        System.out.println("mời nhập vào số n: ");

        int sc = new Scanner(System.in).nextInt();
        int kq = 0;
        for (int i=0; i<=sc; i++){
          if(i%2!=0){
              if (i==3){
//                  continue;
                  break;
              }
              else {
                  kq = kq + i;
              }
          }
        }
        System.out.println(kq);
    }
}
