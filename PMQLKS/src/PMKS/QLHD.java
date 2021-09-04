
package PMKS;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHD {

	ArrayList<HoaDon> dsHoaDon  = new ArrayList<HoaDon>();
	static Scanner nhap = new Scanner (System.in) ; 
	
	void themHD () {
		HoaDon hoaDon = null;
		System.out.println("Nhap Ma Hoa Don ");
		String maHD = nhap.nextLine();
		System.out.println("Nhap ma Phieu Dat ");
		String maPhieuDat =nhap.nextLine();
		System.out.println("Nhap ngay Thanh Toan: ");
		String ngayTT = nhap.nextLine();
		System.out.println("ma nhan Vien");
		String maNhv = nhap.nextLine();
		System.out.println("Nhap Gia tien");
		double gia = nhap.nextDouble();
		hoaDon = new HoaDon(maPhieuDat, maHD, ngayTT, maNhv, gia);
		
	 dsHoaDon.add(hoaDon);  
	}
	void inDSHoaDon() {
		for (HoaDon x : dsHoaDon) {
			System.out.println(x.toString());
		}
	}
	//XOA DANH SACH HOA DON 
	void xoaHD (String maHD) {
for (HoaDon x : dsHoaDon) {
	if (x .getMaHoaDon().equalsIgnoreCase(maHD)) {
		dsHoaDon.remove(maHD);
	}}
}
	

	void timHD (String maHD ) {
		for(HoaDon x : dsHoaDon) {
			if (x.getMaHoaDon().equalsIgnoreCase(maHD)) {
				System.out.println(x.toString());
			}
		}
	}
	void hienThiQLHD () {
		int chon = 0 ; 
		do {
			try {
			menu();
			chon =nhap.nextInt();
			switch (chon) {
			case 1:
				nhap.nextLine();
				themHD();
				break;

			case 2 :
				inDSHoaDon();
				break;
			case 3 :
				nhap.nextLine();
				System.out.println("Nhap ma HD ");
				String maHD = nhap.nextLine();
				xoaHD(maHD);
					break ;
			case 4 :
				nhap.nextLine();
				System.out.println("Nhap ma HD can Tim");
				String maHoaDon  = nhap.nextLine();
				timHD(maHoaDon);
				break ; 
			case 5 : 
				System.out.println("Da Thoat GD HD");
				break ; 
			}
			}catch (Exception e) {

				System.err.println("LOI (>**<)");
				nhap.nextLine();
			}
		} while (chon <5);
	}
	static void menu() {
		System.out.println("-----MenuHD----");
		System.out.println("1.Them Hoa Don    ");
		System.out.println("2.In Hoa Don      ");
		System.out.println("3.Xoa Hoa Don     ");
		System.out.println("4.Tim Kiem Hoa Don");
		System.out.println("5.Thoat GD HD     ");
		
	}
}
