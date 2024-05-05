package CongTy;

public class test {
    public static void main(String[] args) {
//         NhanVien nv1 = new NhanVien("NV1", "HN", 1012);
//         double luong = nv1.tinhLuong();
//         System.out.println(luong);
//
//        nv1.hienthi();

        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("NV1", "HN", 1002);
        double luong1 = hc1.tinhLuong();
        System.out.println(luong1);

        NhanVienDiCa hcdc1 = new NhanVienDiCa("NV1", "HN", 1002);
        double luong2 = hcdc1.tinhLuong();
        System.out.println(luong2);

        hc1.hienthi();
    }
}
