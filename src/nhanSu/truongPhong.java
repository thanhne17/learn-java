package nhanSu;

public class truongPhong extends nhanSuBan{
    public truongPhong(int tuoi, int cccd, String que) {
        super(tuoi, cccd, que);
    }

    public truongPhong(int tuoi, int cccd) {
        super(tuoi, cccd);
    }

    public truongPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 50*ngayCong;
    }
}
