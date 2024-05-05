import java.util.Arrays;
import java.util.Scanner;

public class baitapmang {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập vào một số: ");
//        int n = sc.nextInt();

//        int[] mangInt = new int[n];

//        for (int i = 0; i < n; i ++){
//            Scanner sc1 = new Scanner(System.in);
//            System.out.println("nhập vào giá trị phần tử "+(i+1) + ":");
//            mangInt[i] = sc1.nextInt();
//        }
//        for (int i = 0; i < n; i ++){
//            System.out.println(mangInt[i]);
//        }

//        int[] mang = new int[]{1,2,3,4,5,6,7,8,9};
//        for (int i=0, j=mang.length-1; i<j;i++,j--){
//            int temp = mang[i];
//            mang[i] = mang[j];
//            mang[j] = temp;
//        }
//
//        System.out.println(Arrays.toString(mang));
//        bài1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập vào một số: ");
//        int n = sc.nextInt();
//        int[] mangInt = new int[n];
//
//        for (int i = 0; i<n; i++){
//            double randomValue = Math.random();
//            int randomIntValue = (int) (randomValue*999);
//            mangInt[i] = randomIntValue;
//        }
//
//        System.out.println(Arrays.toString(mangInt));


//        bài 4
//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
//        int n = arr.length;
//
//        bubbleSort(arr, n);
//
//        System.out.println("Mảng sau khi sắp xếp:");
//        printArray(arr);
//    }
//
//    // Hàm hoán đổi giá trị của hai phần tử
//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    // Hàm triển khai thuật toán Bubble Sort
//    static void bubbleSort(int[] arr, int n) {
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    swap(arr, j, j + 1);
//                }
//            }
//        }
//    }
//
//    // Hàm in ra mảng
//    static void printArray(int[] arr) {
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//    }

        //bài  5
        int[] mang = new int[]{1, 22, 4, 5, 6, 7};
        for (int i=0, j=mang.length-1; i<j;i++,j--){
            int temp = mang[i];
            mang[i] = mang[j];
            mang[j] = temp;
        }
        System.out.println(Arrays.toString(mang));
//
//        int cal = 0;
//        for (int i = 0; i < mang.length; i++) {
//            cal += mang[i];
//        }
//        System.out.println(cal);
//
//        System.out.println("nhập vào một số bất kỳ: ");
//        Scanner sc = new Scanner(System.in);
//        int so = sc.nextInt();
//        int kq = timso(so, mang);
//        if (kq != -1){
//            System.out.println(so+" ở vị trí "+kq);
//        }
//        else {
//            System.out.println("đéo có");
//        }
//    }
//
//    static int timso (int so, int[] mang){
//        for (int i=0;i<mang.length-1;i++){
//            if(so == mang[i]){
//                return i;
//            }
//        }
//        return -1;
    }
}
