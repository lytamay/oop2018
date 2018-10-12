package week4.task1;

public class main {

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
		// TODO Auto-generated method stub

	}

}
