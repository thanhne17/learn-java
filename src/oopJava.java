import truongdaihoc.SinhVien;

public class oopJava {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Thanh", 21);
        sv1.name = "HIhi";
        sv1.hienThi();

        System.out.println(sv1.getName());
        System.out.println(sv1.getTuoi());

        sv1.setName("Nguyeexn Tuaasn Thanhf");
        sv1.setTuoi(100);

        sv1.hienThi();

        double dtb = sv1.dtb(9, 9 ,10);
        System.out.println(Math.round(dtb));

        String toS = sv1.toString();
        System.out.println(toS);

        sv1.checkhoptuoi();

        double tinhdtb = sv1.tinhdtb(1,2,3,4,5,6,7,9);
        System.out.println(tinhdtb);
    }
}
