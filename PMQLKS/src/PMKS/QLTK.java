package PMKS;

import java.util.Scanner;

public class QLTK {
	private TaiKhoan tk ; 
	private boolean trangThai = false ;
	
	
	public TaiKhoan getTk() {
		return tk;
	}

	public void setTk(TaiKhoan tk) {
		this.tk = tk;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public QLTK(TaiKhoan tk, boolean trangThai) {
		super();
		this.tk=tk;
		this.trangThai = trangThai;
	} 
	
	QLTK(){
	}
	public boolean kiemTraDN (TaiKhoan s) {
	
				if (s.getTaiKhoan().equalsIgnoreCase("Nam") && s.getMatkhau().equalsIgnoreCase("123")) {
				System.out.println(" Dang Nhap Thanh Cong ");
				NhanVien nhanV = new NhanVien("Ha Van Nua","Nam" , "Viet Nam" , 20,"NV-01" , "LeTan");
				return this.trangThai = true ;
			}else {
				System.out.println("Dang Nhap Khong thanh Cong ");
	
			}
			return trangThai;	
	}
	
}

