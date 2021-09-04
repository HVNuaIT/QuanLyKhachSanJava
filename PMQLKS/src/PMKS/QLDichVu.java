package PMKS;

import java.util.ArrayList;
import java.util.Scanner;

public class QLDichVu {
ArrayList<DichVu> dsDichVu = new ArrayList<DichVu>();
static Scanner nhap= new Scanner(System.in) ; 



void themDichVu() {
	System.out.println("Nhap Ma Dich vu");
	String maDV = nhap.nextLine();
	System.out.println("Nhap ten Dich Vu : ");
	String tenDichVu = nhap.nextLine();
	System.out.println("Nhap Gía ");
	double giaDv = nhap.nextDouble();
DichVu	dichVu = new DichVu(maDV, tenDichVu, giaDv );
	dsDichVu.add(dichVu);

}
void inDSDichVu() {
	for (DichVu x : dsDichVu) {
		System.out.println(x.toString());
	}
}
void xoaDichVu(String maDV) {
	for (DichVu x : dsDichVu) {
		if (x.getMaDV().equalsIgnoreCase(maDV)) {
			dsDichVu.remove(x);
		}
	}
}
void timKiemDV (String maDV) {
	for (DichVu  x : dsDichVu) {
		if (x.getMaDV().equalsIgnoreCase(maDV)) {
			System.out.println(x.toString());
		}
	}	
}
void hienThiQLDV () {
	int chon = 0  ; 
	do {
		menu();
		chon =nhap.nextInt();
		switch (chon) {
		case 1:
			nhap.nextLine();
		themDichVu();
			
			break;

		case 2 :
			
			inDSDichVu();
			break;
		case 3 : 
			nhap.nextLine();
			System.out.println("Nhap Ma DV Can Xoa");
			String maDV = nhap.nextLine();
			xoaDichVu(maDV);
			break ; 
		case 4 : 
			nhap.nextLine();
			System.out.println("Nhap Ma DV Can Tim ");
			String maDichV = nhap.nextLine();
			timKiemDV(maDichV);
			break ; 
		case 5 : 
			System.out.println(" Da Thoat GD Dich Vu");
			break ; 
			
		}
		
		nhap.nextLine();
	} while (chon < 5);
}

static void menu() {
	System.out.println("-- MENU QL Dich Vu--");
	System.out.println("1. Them Dich Vu");
	System.out.println("2. In Dich Vu");
	System.out.println("3. Xoa Dich Vu");
	System.out.println("4. Tim Kiem DV");
	System.out.println("5. Thoat GD Dich Vu ");
}
double thanhTien () {
	double thanhTien = 0 ; 
	for (DichVu x : dsDichVu) {
		 thanhTien = x.getGiaDV();
		System.out.println("Tien dich Vu" + thanhTien);
	}
	return thanhTien;
}

}
