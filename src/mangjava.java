public class mangjava {
    public static void main(String[] args) {
        //khai báo mảng
        String[] mangString;
        Float[] mangFloat;

        //khởi tạo mảng
        String[] mangString2 = new String[12];
        int[] mangint = new int[5];

        //
        String[] mangstring3 = new String[]{"hihi", "hiaha", "huhu", "hichic"};
        int[] mangInt = new int[]{1,2,3,4,5,6,7,8,9};

        //truy xuất phần tử
//        System.out.println(mangstring3.length);
//        for (String pt : mangstring3) {
//            System.out.println(pt);
//        }

//        for (int i =0; i<mangstring3.length; i++) {
//            System.out.println(mangstring3[i]);
//        }

        for (int i=0; i<mangInt.length; i++){
//            mangint[i] = mangint[i]+5;
            System.out.println(mangInt[i]);
        }
        System.out.println("  ");
        for (int i=0; i<mangInt.length; i++){
            mangInt[i] = mangInt[i]+5;
            System.out.println(mangInt[i]);
        }
    }

}
