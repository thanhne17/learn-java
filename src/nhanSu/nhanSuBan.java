package nhanSu;

public abstract class nhanSuBan {
    private int tuoi;
    private int cccd;
    private String que;

    public nhanSuBan(int tuoi, int cccd, String que) {
        this.tuoi = tuoi;
        this.que = que;
        this.cccd = cccd;
    }

    public nhanSuBan(int tuoi, int cccd) {
        this.tuoi = tuoi;
        this.cccd = cccd;
    }

    public nhanSuBan() {
    }


    public abstract double tinhLuong(int ngayCong);

    public int getTuoi() {
        return tuoi;
    }

    public int getCccd() {
        return cccd;
    }

    public String getQue() {
        return que;
    }
}
