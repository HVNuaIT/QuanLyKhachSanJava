package PMKS;

import java.util.Scanner;

public class HoaDon {
private String maHoaDon ; 
private String ngayThanhToan  ; 
private double tongtien ;
private DatPhong datPhong ; 
private Phong phong ; 
private DichVu dichVu ; 
private KhachHang khach ;

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
public double getTongtien() {
	return tongtien;
}
public void setTongtien(double tongtien) {
	this.tongtien = tongtien;
}
public DatPhong getDatPhong() {
	return datPhong;
}
public void setDatPhong(DatPhong datPhong) {
	this.datPhong = datPhong;
}
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

public HoaDon(String maHoaDon, String ngayThanhToan, double tongtien, DatPhong datPhong , DichVu dichVu,
		Phong phong  , KhachHang khachHang 
		) {
	super();
	this.maHoaDon = maHoaDon;
	this.ngayThanhToan = ngayThanhToan;
	this.tongtien = tongtien;
	this.datPhong = datPhong;
	this.dichVu = dichVu;
	this.phong = phong ; 
	this.khach = khachHang;
	
}
@Override
public String toString() {
	return "HoaDon [maHoaDon=" + maHoaDon + ", ngayThanhToan=" + ngayThanhToan + ", tongtien=" + tongtien
			+ ", madatPhong=" + datPhong.getMaPhieuDatPhong() + ", maphong=" + phong.getMaPhong() + ", madichVu=" + dichVu.getMaDV()+ ", makhach=" + khach.getMaKhachHang() + "Gia Phong : " +phong.getGiaPhong()+
			"\nGia DV :" + dichVu.getGiaDV()+"]";
}


	

	
}
