package nhanSu;

public class phoPhong extends nhanSuBan{
    public phoPhong(int tuoi, int cccd, String que) {
        super(tuoi, cccd, que);
    }

    public phoPhong(int tuoi, int cccd) {
        super(tuoi, cccd);
    }

    public phoPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 40*ngayCong;
    }
}
