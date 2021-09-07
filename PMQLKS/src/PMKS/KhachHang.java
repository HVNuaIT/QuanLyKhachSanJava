package PMKS;

public class KhachHang extends Nguoi {
	private String maKhachHang ; 
	private String chungMT ; 
	private String soDT ;
	
	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getChungMT() {
		return chungMT;
	}

	public void setChungMT(String chungMT) {
		this.chungMT = chungMT;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	KhachHang (String maKhach) {
		this.maKhachHang = maKhach;
	}
	KhachHang(String maKhach , String CM){
		this.maKhachHang = maKhach; 
		this.chungMT = CM;
	}

	public KhachHang(String hoTen, String gioiTinh, String quocTich, int tuoi,String maKhachHang, String chungMT, String soDT) {
		super(hoTen, gioiTinh, quocTich, tuoi);
		this.maKhachHang = maKhachHang;
		this.chungMT = chungMT;
		this.soDT = soDT;
	}

	@Override
	public String toString() {
		return super.toString()+ "KhachHang [maKhachHang=" + maKhachHang + ", chungMT=" + chungMT + ", soDT=" + soDT + "]";
	} 
	
	

	
	
	

}
