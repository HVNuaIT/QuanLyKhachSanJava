package PMKS;

import java.util.Scanner;

public class GDDangNhap {

	private boolean trangthai ; 
	private TaiKhoan tk;
	
public boolean isTrangthai() {
		return trangthai;
	}
	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}
	public TaiKhoan getTk() {
		return tk;
	}
	public void setTk(TaiKhoan tk) {
		this.tk = tk;
	}
	static Scanner nhap= new Scanner (System.in);
boolean hienthiDN(TaiKhoan tk) {
	int chon = 0;
	
do {
	
	try {
	menu();
	chon  = nhap.nextInt();
	switch (chon) {
	case 1:
		nhap.nextLine();
		System.out.println(" Nhap Vao Tai Khoan : ");
		String tK = nhap.nextLine();
		System.out.println("Nhap Vao Mat Khau : ");
		String mK = nhap.nextLine();
		 tk = new TaiKhoan(tK, mK);
		 QLTK qlTK = new QLTK();
		 if (qlTK.kiemTraDN(tk)==true) {
			 return this.trangthai=true ; 
		 }
		break;
	case 2 :
		System.out.println("Tam Biet");
		break;
	}
	}catch (Exception e) {
		System.err.println(" !!LOI!!");
		nhap.nextLine();
	}
	nhap.nextLine();
}while(chon <2);
return this.trangthai=false;
}
static void menu () {
	System.out.println("-------------------------------MenuDangNhap-------------------");
	System.out.println("**				1. DANG NHAP                 **");
	System.out.println("**				2. THOAT                     **");
}

}
