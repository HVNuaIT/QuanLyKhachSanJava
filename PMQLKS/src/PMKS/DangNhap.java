package PMKS;

public class DangNhap {
	private  String TaiKhoan  ; 
	private  String MatKhau  ;
	public String getTaiKhoan() {
		return TaiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		TaiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	} 
	public DangNhap() {
		// TODO Auto-generated constructor stub
	}
	public DangNhap(String TaiKhoan , String MatKhau )
	{
		this.TaiKhoan  = TaiKhoan;
		this.MatKhau = MatKhau;
	}
	

}
