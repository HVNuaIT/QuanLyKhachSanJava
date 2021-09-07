package PMKS;

import java.security.spec.DSAGenParameterSpec;
import java.util.Scanner;

public class KhachSanTestDrive {
	static Scanner nhap = new Scanner(System.in);
	public static void main(String[] args) {
		QLTK qlTk = new QLTK();
		TaiKhoan taiKhoan =  new TaiKhoan();
		QLKH dsKhach = new QLKH();
		QLPhong dsPhong = new QLPhong();
		QLDatPhong  dsDatPhong  = new QLDatPhong();
		QLDichVu dsDichVu = new QLDichVu();
		QLHD dsHoaDon  = new QLHD();
		GDDangNhap dn = new GDDangNhap();
		
		
		int chon =0  ; 
		
		if (dn.hienthiDN(taiKhoan)==true) {
		
		do {
			try {
				
			menu();
			chon = nhap.nextInt();
			switch (chon) {
			case 1 :
			dsPhong.hienthiQLPhong();
		
				break; 
			case 2 : 
				dsDichVu.hienThiQLDV();
				 break ;
			
			case 3 : 
				dsKhach.hienThiQLKH();	
				break;
			case 4 :
				nhap.nextLine();
				System.out.println("--------Danh Sach Dat Phong-----------");
				dsDatPhong.inDSDatPhong();
				System.out.println("----------------Danh Sach Dich Vu----------------");
				dsDichVu.inDSDichVu();
				System.out.println("Nhap ma Khach");
				String maKhach = nhap.nextLine();
				dsKhach.timKiemKH(maKhach);
				System.out.println("Nhap ma Phong");
				String maP =nhap.nextLine();
				dsPhong.tinhTrangPhong(maP);
				dsHoaDon.hienThiQLHD();
				break ;
			case 5 :  
				nhap.nextLine();
				System.out.println("Danh Sach Thong Tin Khach Hang ") ; 
				System.out.println("-------------------------------");
				dsKhach.inDSKH();
				System.out.println("Danh Sach Thong Tin Phong ");
				System.out.println("--------------------------");
				dsPhong.inDSPhong();
				nhap.nextLine();
				System.out.println("Nhap ma phong can tim :");
				String maPhong = nhap.nextLine();
				dsPhong.timPhongtrong(maPhong);
				dsDatPhong.hienThiQLDatPhong();
				break;
			case 6 : 
				nhap.nextLine();
				System.out.println(" -----------------------------Tam Biet ----------------------------------");
				
			}
		}catch (Exception e) {
			System.err.println("LOI ");
			nhap.nextLine();
		}
		}while (chon <6) ;
		}
		
		
		}
			
	
	 static void menu() {
		System.out.println("-----------------Menu----------------------");
		System.out.println("** 1. Quan Ly Phong 	**");
		System.out.println("** 2. Quan Ly Dich Vu	**");
		System.out.println("** 3.Quan Ly Khach Hang	**");
		System.out.println("** 4.Quan Ly Hoa Don 	**");
		System.out.println("** 5.Quan Ly Dat Phong  **");
		System.out.println("** 6.Thoat              **");
		
		
		
		
		
		
		
	 }
}
