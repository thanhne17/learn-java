package testInterface;

public class keThuaInterface implements vdInterface {
    @Override
    public void thongtin(String cccd, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay*soNgayCong;
    }
}
