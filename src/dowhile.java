public class dowhile {
    public static void main(String[] args) {
        int a = 0;
        int tong = 0;

        do {
            tong = tong + a;
            a ++;
            System.out.println(tong);
        }
        while (a <= 5);
    }
}
