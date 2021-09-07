package PMKS;

public class NhanVien extends Nguoi {

	private String maNV ; 
	private String chucVu ; 
	private TaiKhoan tk ; 
	
	public TaiKhoan getTk() {
		return tk;
	}
	public void setTk(TaiKhoan tk) {
		this.tk = tk;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public NhanVien(String hoTen, String gioiTinh, String quocTich, int tuoi , String maNV , String chucVu  ) {
		super(hoTen, gioiTinh, quocTich, tuoi);
		// TODO Auto-generated constructor stub ,
		this.maNV = maNV ; 
		this.chucVu=chucVu ; 
	}
	public NhanVien() {
		
		
	}
	@Override
	public String toString() {
		return super.toString()+ "Nhan Vien [maNV=" + maNV + ", chucVu=" + chucVu + "]";
	}
}
