package PMKS;

public class TaiKhoan {
	private String taiKhoan ; 
	private String matkhau ;
	public String getMatkhau() {
		return matkhau;
	}
	public void setMakhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public TaiKhoan() {
		// TODO Auto-generated constructor stub
	}
	public TaiKhoan(String taiKhoan, String matkhau) {
		super();
		this.taiKhoan = taiKhoan;
		this.matkhau = matkhau;
	}
	
	
}
