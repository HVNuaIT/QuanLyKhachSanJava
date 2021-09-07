package PMKS;

import java.util.ArrayList;
import java.util.Scanner;

public class QLKH {
 	ArrayList<Nguoi >dsNguoi = new ArrayList<Nguoi>();
	
 static Scanner nhap = new Scanner(System.in) ;
 
 
 
	void themKhach () {
		Nguoi nguoi  = null; 
		System.out.println("Nhap Ten  : ");
		String ten  = nhap.nextLine();
		System.out.println("Gioi tinh :  ");
		String gioiTinh = nhap.nextLine();
		System.out.println("Nhap Quoc Tich : ");
		String quocTich = nhap.nextLine();
		System.out.println("Nhap vao Tuoi");
		int tuoi = nhap.nextInt();
			nhap.nextLine();
			System.out.println("Nhap ma khach hang :");
			String maKhach = nhap.nextLine();
			System.out.println("Nhap Chung minh :");
			String soChungMinh = nhap.nextLine();
			System.out.println("Nhap So Dien Thoai : ");
			String soDT = nhap.nextLine();
			
			nguoi  = new KhachHang(ten, gioiTinh, quocTich, tuoi, maKhach, soChungMinh, soDT);
		dsNguoi.add(nguoi);	
	}
	void inDSKH () {
		for (Nguoi x : dsNguoi) {
			if (x instanceof KhachHang) {
				KhachHang khach = (KhachHang)x ; 
				System.out.println(khach.toString());
			}
		}
	}
	void timKiem (String maKhach) {
		for (Nguoi x : dsNguoi ) {
		 if (x instanceof KhachHang ){
			 KhachHang khach = (KhachHang) x ; 
			 if ( khach.getMaKhachHang().equalsIgnoreCase(maKhach)) {
				 System.out.println(x.toString());
			 }		
		 }	 
		}	
	}
	void xoaDS() {
		System.out.println("Nhap ma Khach Can xoa");
		String maKhach = nhap.nextLine();
		for (Nguoi x : dsNguoi) {
			if (x instanceof KhachHang) {
				KhachHang khach = (KhachHang)x ; 
				if (khach.getMaKhachHang().equalsIgnoreCase(maKhach)) {
					dsNguoi.remove(khach);
				}
			}
		}
	}
	static void menu() {
		System.out.println("------------MenuQLKhach-------------");
		System.out.println("1. ThemKhach");
		System.out.println("2. In Khach ");
		System.out.println("3. Tim Khach ");
		System.out.println("4.Xoa Khach");
		System.out.println("5. Thoat GD");
	}
	
	void hienThiQLKH () {
		int chon =  0 ;
		do {
			try {
			menu();
			chon =nhap.nextInt();
			switch (chon) {
			case 1:
				nhap.nextLine();
				themKhach();
				break;
			case 2 :
				inDSKH();
				break;
			case 3 :
				nhap.nextLine();
			 System.out.println("Nhap ma Khach Can Tim");
			 String maKhach = nhap.nextLine();
			 timKiem(maKhach);
			 break ; 
			case 4 : 
				nhap.nextLine();
				 System.out.println("Nhap ma Khach Can Xoa");
				 String maK= nhap.nextLine();
				 xoaDS(); break  ; 	 
			case 5 : 
				System.out.println("Da Thoat GD QL Khach");
				break;
			}
			}catch (Exception e) {
				// TODO: handle exception
				System.err.println("LOI (>**<)");
				nhap.nextLine();
			}
			
			
		} while (chon <5);
	}
	boolean timKiemKH(String ma) {
		for(Nguoi x : dsNguoi) {
			if (x instanceof KhachHang) {
				KhachHang khach = (KhachHang )x;
				if (khach.getMaKhachHang().equalsIgnoreCase(ma)) {
					System.out.println(x.toString());
					dsNguoi.remove(khach);
					return true ;
									}
				}
		}return false;
	}
	void timkiem(String cM) {
		for (Nguoi x : dsNguoi) {
			if (x instanceof KhachHang) {
				KhachHang khach = (KhachHang )x ; 
				if (khach.getChungMT().equalsIgnoreCase(cM)) {
					System.out.println(x.toString());
					
				
				}
			}
		}
	}
	}

