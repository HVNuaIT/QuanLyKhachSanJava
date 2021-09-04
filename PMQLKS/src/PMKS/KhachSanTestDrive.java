package PMKS;

import java.security.spec.DSAGenParameterSpec;
import java.util.Scanner;

public class KhachSanTestDrive {
	static Scanner nhap = new Scanner(System.in);
	public static void main(String[] args) {
		QLDN qlDN = new QLDN() ;
		DangNhap dn  = new DangNhap();
		QLKH dsKhach = new QLKH();
		QLPhong dsPhong = new QLPhong();
		QLDatPhong  dsDatPhong  = new QLDatPhong();
		QLDichVu dsDichVu = new QLDichVu();
		QLHD dsHoaDon  = new QLHD();
		
		int chon =0  ; 
		
		if (qlDN.kiemTraDN(dn)==true) {
		
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
				dsHoaDon.hienThiQLHD();
				break ;
			case 5 :  
				nhap.nextLine();
				System.out.println("Danh Sach Thong Tin Khach Hang ") ; 
				System.out.println("-------------------------------");
				dsKhach.inDSKH();
				System.out.println("Danh Sach Thong Tin Phong ");
				System.out.println("--------------------------");
				dsPhong.timPhongtrong();
				dsDatPhong.hienThiQLDatPhong();
			break;
				
			case 6 : 
				nhap.nextLine() ; 
				System.out.println("Nhap cm");
				String cM = nhap.nextLine();
				if (dsKhach.timKiemKH(cM)== true) {
					System.out.println("Tien Phong " + dsPhong.thanhToan());
					System.out.println("Tien Dich Vu : " + dsDichVu.thanhTien());
					double tong = dsPhong.thanhToan()+dsDichVu.thanhTien();
					
				System.out.println("Tong Tien " + tong);
				}
				
				
				
				
			break ;
			}
			
		
		}catch (Exception e) {
			System.err.println("LOI ");
			nhap.nextLine();
		}
		}while (chon <10) ;
		}
		
		
		}
			
	
	 static void menu() {
		System.out.println("-----------------Menu----------------------");
		System.out.println("** 1. Quan Ly Phong 	**");
		System.out.println("** 2. Quan Ly Dich Vu	**");
		System.out.println("** 3.Quan Ly Khach Hang	**");
		System.out.println("** 4.Quan Ly Hoa Don 	**");
		System.out.println("** 5.Quan Ly Dat Phong  **");
		System.out.println("** 6.Thanh Toan         **");
		
		
		
		
		
		
	 }
}
