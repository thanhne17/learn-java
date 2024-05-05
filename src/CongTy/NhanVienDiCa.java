package CongTy;

public class NhanVienDiCa extends NhanVien{
    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan*1.05;
    }
}
