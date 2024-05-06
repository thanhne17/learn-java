package nhanSu;

public class test {
    public static void main(String[] args) {
        nhanSuBan ns1;
        ns1 = new phoPhong(22, 123, "HN");
        System.out.println(ns1.tinhLuong(100));
        System.out.println(ns1.getQue());

        ns1 = new truongPhong(ns1.getTuoi(), ns1.getCccd(), ns1.getQue());
        System.out.println(ns1.tinhLuong(100));
        System.out.println(ns1.getQue());
    }
}
