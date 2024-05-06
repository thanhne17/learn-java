package testInterface;

public class keThuaInterface2 implements vdInterface,vdInterface2 {
    @Override
    public void thongtin(String cccd, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay*soNgayCong;
    }

    @Override
    public void setThuong(int cccd, double doanhThu) {

    }
}
