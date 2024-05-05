package truongdaihoc;

import java.util.Arrays;

public class SinhVien {
    public String name;
    private int tuoi;
//    public truongdaihoc.SinhVien () {
//        name="Thanh";
//        tuoi=22;
//    }

    public SinhVien (String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }
    public void hienThi () {
        System.out.println(name + " " + tuoi);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double dtb (double toan, double van, double anh) {
        return (toan + van + anh) / 3;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }

    private boolean checkdiem () {
        return this.tuoi > 20;
    }

    public void checkhoptuoi () {
        if (checkdiem()) System.out.println("ok nha");
        else System.out.println("k ok nha");
    }

    public double tinhdtb (double ... arr){
        double tong=0.0;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        for (double x : arr){
            tong+=x;
        }
        return tong;
    }
}
