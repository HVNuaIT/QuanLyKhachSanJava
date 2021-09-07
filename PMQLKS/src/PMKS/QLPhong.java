package PMKS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class QLPhong {
ArrayList<Phong>dsPhong  = new ArrayList<Phong>() ;
static Scanner nhap = new Scanner (System.in);

void themPhong ( ) {
	 Phong phong = null ;
	System.out.println("Nhap Ma Phong : ");
	String maPhong = nhap.nextLine();
	System.out.println("Nhap Loai Phong : ");
	String loaiPhong = nhap.nextLine();
	System.out.println("Nhap gia Phong : ");
	double giaPhong  = nhap.nextDouble() ; 
	nhap.nextLine();
	 System.out.println("Nhap Tinh Trang : ");
	 boolean tinhTrang = nhap.nextBoolean();
	 phong  = new Phong(maPhong, loaiPhong, giaPhong, tinhTrang);
	 dsPhong.add(phong);
}
void inDSPhong () {
	for (Phong x : dsPhong ) {
		System.out.println(x.toString());
	}
}
void timKiemPhong (String maPhong ) {
	for(Phong x: dsPhong ) {
		if (x .getMaPhong().equalsIgnoreCase(maPhong)) 
		{
			System.out.println(x.toString());
		}
	}	

	}
void xoaPhong (String maPhong ) {
	for (Phong x : dsPhong) {
		if (x.getMaPhong().equalsIgnoreCase(maPhong)) {
			dsPhong.remove(x);
		}
	}
}

double thanhToan () {
	double thanhTien =  0;
	for (Phong x : dsPhong) {
		if (x.getLoaiPhong().equalsIgnoreCase("Vip")) {
			 thanhTien = x.getGiaPhong()*0.1 ; 
			
		}else {
			 thanhTien = x.getGiaPhong() ; 
		}
	}
	return thanhTien;
}
boolean timPhongtrong (String maPhong  ) {
	
	for (Phong x : dsPhong) {
		if (x.getMaPhong().equalsIgnoreCase(maPhong)) {
			System.out.println(x.toString());
			x.setTinhTrangPhong(false);
		}}
	return false;
	}
boolean tinhTrangPhong (String maPhong) {
		for (Phong x : dsPhong) {
			if (x.getMaPhong().equalsIgnoreCase(maPhong)) {
				System.out.println(x.toString());
				x.setTinhTrangPhong(true);
				
			}
		}
	return false;
}




static void menu () {
	System.out.println("-------MeNu QL Phong----------");
	System.out.println("1.Them Phong ");
	System.out.println("2. In Phong");
	System.out.println("3. Xoa Phong ");
	System.out.println("4. Tim Phong Theo ma");
	System.out.println("5 . Thoat GD QL Phong ");
	
}
void hienthiQLPhong () {
	int chon  = 0 ; 
	do {
		try {
		menu();
		chon = nhap.nextInt();
		switch (chon) {
		case 1 :
			nhap.nextLine();
			themPhong();
			break;
		case 2 :
			inDSPhong();
			break;
		case 3 : 
			nhap.nextLine();
			System.out.println("Nhap Ma Phong Can xoa");
			String maPhong= nhap.nextLine();
			xoaPhong(maPhong);
			break; 
		case 4 : 
			nhap.nextLine ();
			System.out.println("Nhap Ma Phong Can Tim");
			String maPh = nhap.nextLine();
			timKiemPhong(maPh);
			break ;
		case 5 :
			System.out.println(" Da Thoat GD Phong");
			break ;
		}
		}catch (Exception e) {
			System.err.println("LOI (>**<)");
			nhap.nextLine();	
		}
	} while (chon <5);
}
}