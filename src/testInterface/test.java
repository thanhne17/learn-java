package testInterface;

public class test {
    public static void main(String[] args) {
        keThuaInterface kt1 = new keThuaInterface();
        kt1.thongtin("0012", 2002);
        double kq = kt1.tinhLuong(500000, 356);
        System.out.println(kq);
    }
}
