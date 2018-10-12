/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;
class HoaQua{
    private String nguon_goc, ngayNhap;
    private int giaBan, soLuong;

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setNguon_goc(String nguon_goc) {
        this.nguon_goc = nguon_goc;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public String getNguon_goc() {
        return nguon_goc;
    }
}

 class QuaCam extends HoaQua{
    private String mau;

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getMau() {
        return mau;
    }
}

 class QuaTao extends HoaQua{
    private String muivi;

    public void setMuivi(String muivi) {
        this.muivi = muivi;
    }
    public String getMuivi() {
        return muivi;
    }
}
 class CamcaoPhong extends QuaCam {
    private String kichThuoc;

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }
}

 class CamSanh extends QuaCam {
    private String voNgoai;

    public void setVoNgoai(String voNgoai) {
        this.voNgoai = voNgoai;
    }

    public String getVoNgoai() {
        return voNgoai;
    }
}

 class main{
    public static void main(String[] args) {
     HoaQua hq = new HoaQua();
     hq.setGiaBan(25);
     System.out.println("Gia ban hua qua"+ hq.getGiaBan());
     hq.setNgayNhap("9/09/2019");
     System.out.println("Ngay nhap :"+hq.getNgayNhap());
     hq.setNguon_goc("Viet Nam");
     System.out.println("nguon goc :"+hq.getNguon_goc());
     QuaCam qc = new QuaCam();
     qc.setMau("vang - cam");
     System.out.println("mau qua cam"+ qc.getMau());
     qc.setNgayNhap("10/10/2019");
     System.out.println("Ngay nhap qua cam: "+ qc.getNgayNhap());
     qc.setSoLuong(300);
     System.out.println("So luong qua cam: "+qc.getSoLuong());
     QuaTao qt = new QuaTao();
     qt.setMuivi("ngon-ngot");
     qt.setNgayNhap("10/4/2018");
     qt.setGiaBan(25);
     System.out.println("Mui vi qua tao: " +qt.getMuivi() );
     System.out.println("ngay nhap qua tao: "+qt.getNgayNhap());
     System.out.println("Gia ban qua tao: "+ qt.getGiaBan());
     System.out.println("Nguon goc cua tao: "+qt.getNguon_goc());
     CamcaoPhong ccp = new CamcaoPhong();
     ccp.setNgayNhap("10/10/2018");
     ccp.setNguon_goc("Hoa Binh");
     ccp.setKichThuoc("hing tron");
     System.out.println("ngay nhap qua cam cao phong: "+ ccp.getNgayNhap());
     System.out.println("Nguon goc cam cao phong: "+ ccp.getNguon_goc());
     System.out.println("Hinh dang cam cao phong: "+ ccp.getKichThuoc());
     CamSanh cs = new CamSanh();
     cs.setGiaBan(30);
     cs.setVoNgoai("san sui");
     System.out.println("Gia ban cam sanh "+ cs.getGiaBan());
     System.out.println("Hinh dang vo ngoai : "+ cs.getVoNgoai());
    }
}