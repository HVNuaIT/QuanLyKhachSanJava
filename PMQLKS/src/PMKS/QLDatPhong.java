package PMKS;

import java.util.ArrayList;
import java.util.Scanner;

public class QLDatPhong {
ArrayList<DatPhong>dsDP = new ArrayList<DatPhong>();
static Scanner nhap = new Scanner (System.in);

void themDatPhong () {
	
	DatPhong datPhong = null ;
	System.out.println("Nhap ma Phieu Dat ");
	String maPhieuDat = nhap.nextLine();
	System.out.println("Nhap ngay Dat");
	String ngayDat = nhap.nextLine();
	System.out.println("Nhap ma Khach");
	String maKhach = nhap.nextLine();
	System.out.println("Nhap maPhong ");
	String maPhong = nhap.nextLine();
	KhachHang khach = new KhachHang(maKhach);
	Phong phong= new Phong(maPhong);
	datPhong = new DatPhong(maPhieuDat, ngayDat, khach, phong);
	
	dsDP.add(datPhong);
}
void inDSDatPhong() {
	for (DatPhong x  : dsDP) {
		System.out.println(x.toString());
	}
}
void xoaPhieuDatPhong (String maPhieuDat) {
	for (DatPhong x : dsDP) {
		if (x.getMaPhieuDatPhong().equalsIgnoreCase(maPhieuDat)) {
			dsDP.remove(maPhieuDat);
		}
	}}
	void timKiemDP (String maDatPhong) {
		for (DatPhong x : dsDP) {
			if (x.getMaPhieuDatPhong().equalsIgnoreCase(maDatPhong)) {
				System.out.println(x.toString());
				
			}
		}
		
	}
	

static void menu () {
	System.out.println("------------MenuDatPhong--------------");
	System.out.println("1.Them Dat Phong ");
	System.out.println("2.In DS Dat Phong");
	System.out.println("3.Xoa DS Dat Phong");
	System.out.println("4.Tim Kiem Dat Phong");
	System.out.println("5. Thoat GD Dat Phong");
	
	
}
void hienThiQLDatPhong () {
	int chon =  0 ;
	do {
		try {
			menu();
			chon =nhap.nextInt();
			switch (chon) {
			case 1:
			nhap.nextLine();	
				themDatPhong();
				break;
			case 2 :
				inDSDatPhong();
				break;
			case 3 : 
				nhap.nextLine();
				System.out.println("Nhap ma Dat Phong ");
				String maDat = nhap.nextLine();
				xoaPhieuDatPhong(maDat);
				break ; 
			case 4 : 
				nhap.nextLine();
				System.out.println("Nhap ma Dat Phong ");
				String maDatPh = nhap.nextLine();
				timKiemDP(maDatPh);
				break ; 
			case 5 : 
				System.out.println("Dang thoat GD ");
				break;
			}
		} catch (Exception e) {
			System.err.println("LOI (>**<)");
		nhap.nextLine();
		}
		
		
		
	} while (chon<5);
}

}
