package PMKS;

import java.util.Scanner;

public class HoaDon {
private String maPhieuThue ;
private String maHoaDon ; 
private String ngayThanhToan  ; 
private String maNhanVien ;
private double tongtien ;
private Phong phong ; 
private DichVu dichVu ; 
private KhachHang khach ; 

public Phong getPhong() {
	return phong;
}

public void setPhong(Phong phong) {
	this.phong = phong;
}

public DichVu getDichVu() {
	return dichVu;
}

public void setDichVu(DichVu dichVu) {
	this.dichVu = dichVu;
}

public KhachHang getKhach() {
	return khach;
}

public void setKhach(KhachHang khach) {
	this.khach = khach;
}

public String getMaPhieuThue() {
	return maPhieuThue;
}

public void setMaPhieuThue(String maPhieuThue) {
	this.maPhieuThue = maPhieuThue;
}

public String getMaHoaDon() {
	return maHoaDon;
}

public void setMaHoaDon(String maHoaDon) {
	this.maHoaDon = maHoaDon;
}

public String getNgayThanhToan() {
	return ngayThanhToan;
}

public void setNgayThanhToan(String ngayThanhToan) {
	this.ngayThanhToan = ngayThanhToan;
}

public String getMaNhanVien() {
	return maNhanVien;
}

public void setMaNhanVien(String maNhanVien) {
	this.maNhanVien = maNhanVien;
}

public double getTongtien() {
	return tongtien;
}

public void setTongtien(double tongtien) {
	this.tongtien = tongtien;
}
public HoaDon() {
	// TODO Auto-generated constructor stub
}
public HoaDon(String maPhieuThue, String maHoaDon, String ngayThanhToan, String maNhanVien, double tongtien) {
	super();
	this.maPhieuThue = maPhieuThue;
	this.maHoaDon = maHoaDon;
	this.ngayThanhToan = ngayThanhToan;
	this.maNhanVien = maNhanVien;
	this.tongtien = tongtien;
}

@Override
public String toString() {
	return "HoaDon [maPhieuThue=" + maPhieuThue + ", maHoaDon=" + maHoaDon + ", ngayThanhToan=" + ngayThanhToan
			+ ", maNhanVien=" + maNhanVien + ", tongtien=" + tongtien + "]";
} 

	

	
}
