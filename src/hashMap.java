import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> hsm = new HashMap<>();

        hsm.put("0", "Thanh");
        hsm.put("1", "17");
        hsm.put("2", "hihi");
        hsm.put("3", "100223");

        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap stk:");
        String tk = sc.nextLine();
        System.out.println("moi nhap mat khau");
        String mk = sc.nextLine();

        if (!hsm.containsKey(tk) ) {
            System.out.println("deo co tk nay");
        }
        else if (!hsm.get(tk).equals(mk)){
            System.out.println("nonono");
        }
        else {
            System.out.println("ccmnl");
        }

//        for (String i : hsm.keySet()) {
//            String value = hsm.get(i);
//            if ()
//        }

    }
}
