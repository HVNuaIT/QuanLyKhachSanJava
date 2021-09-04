package PMKS;

import java.util.Scanner;

public class QLDN {
	private DangNhap dn ; 
	private boolean trangThai = false ;
	
	public QLDN(DangNhap dn, boolean trangThai) {
		super();
		this.dn = dn;
		this.trangThai = trangThai;
	} 
	
	public QLDN() {
		// TODO Auto-generated constructor stub
	}
	public boolean kiemTraDN (DangNhap dn) {
	int chon  = 0;
	Scanner nhap =new Scanner (System.in);
			do {
		menu();
		System.out.println("Moi Chon ");
		  chon =nhap.nextInt() ; 
		switch (chon) {
		case 1:
			nhap.nextLine();
			System.out.println(" Nhap Vao Tai Khoan : ");
			String tK = nhap.nextLine();
			System.out.println("Nhap Vao Mat Khau : ");
			String mK = nhap.nextLine();
			DangNhap s = new DangNhap(tK, mK);
			if (s.getTaiKhoan().equalsIgnoreCase("Nam") && s.getMatKhau().equalsIgnoreCase("123")) {
				System.out.println(" Dang Nhap Thanh Cong ");
				
				return this.trangThai = true ;
			}else {
				System.out.println("Dang Nhap Khong thanh Cong ");
				
			}
			
			break;
		case 2 :
			System.out.println("Tam Biet !!");
			break;
			
		
		}
		
		
	
	
	}
			while (chon <2) ;
			return trangThai;
			
	}

	
		
	static void menu () {
		System.out.println("-------------------------------MenuDangNhap-------------------");
		System.out.println("**				1. DANG NHAP                 **");
		System.out.println("**				2. THOAT                     **");
	}
	
}
