
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
		System.out.println("Nhap ma Khach : ");
		String maKhach = nhap.nextLine();
		System.out.println("Nhap C M N D ");
		String cm = nhap.nextLine();
		System.out.println("Nhap ma Dich vu : ");
		String maDV = nhap.nextLine();
		System.out.println("Nhap ma Phong ");
		String maPhong = nhap.nextLine();
		System.out.println("Nhap gia Dat Phong ");
		double giaPhong = nhap.nextDouble() ; 
		System.out.println("Nhap Gia Dich Vu");
		double giaDV  = nhap.nextDouble();
		double gia = giaDV + giaPhong ;
		nhap.nextLine();
	DatPhong datPhong = new DatPhong(maPhieuDat);
	DichVu dichVu  = new DichVu(maPhong, giaDV);
	Phong phong = new Phong(maPhong, gia);
	KhachHang khach  = new KhachHang(maKhach, cm);
	hoaDon = new HoaDon(maHD, ngayTT, gia, datPhong, dichVu, phong, khach);
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
				nhap.nextLine();
				System.out.println("Tra Phong" ) ; 
				System.out.println ("\nNhap cm ") ; 
				String cm =nhap.nextLine();
				thanhToan(cm);
			
			break ; 
			case 6 : 
				
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
		System.out.println("4.Tim Kiem1 Hoa Don");
		System.out.println("5.Thanh Toan    ");
		System.out.println("6.Thoat GD HD");
		
	}
	void thanhToan (String cM) {
		QLPhong phong = new QLPhong() ; 
		QLDichVu dv = new QLDichVu();
		for (HoaDon x : dsHoaDon) {
			if (x.getKhach().getChungMT().equalsIgnoreCase(cM)) {
				double thanhTien =x.getDichVu().getGiaDV() + x.getPhong().getGiaPhong();
				System.out.println(thanhTien);
				
			}
		}
	}
}
