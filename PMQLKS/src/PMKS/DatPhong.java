package PMKS;

public class DatPhong {
private String maPhieuDatPhong ; 

private String maPhong ; 
private String maKhach ;
private String ngayDen ; 
private String ngayDi ; 
private String tenNhanVien ;
public String getMaPhieuDatPhong() {
	return maPhieuDatPhong;
}
public void setMaPhieuDatPhong(String maPhieuDatPhong) {
	this.maPhieuDatPhong = maPhieuDatPhong;
}

public String getMaPhong() {
	return maPhong;
}
public void setMaPhong(String maPhong) {
	this.maPhong = maPhong;
}
public String getMaKhach() {
	return maKhach;
}
public void setMaKhach(String maKhach) {
	this.maKhach = maKhach;
}
public String getNgayDen() {
	return ngayDen;
}
public void setNgayDen(String ngayDen) {
	this.ngayDen = ngayDen;
}
public String getNgayDi() {
	return ngayDi;
}
public void setNgayDi(String ngayDi) {
	this.ngayDi = ngayDi;
}
public String getTenNhanVien() {
	return tenNhanVien;
}
public void setTenNhanVien(String tenNhanVien) {
	this.tenNhanVien = tenNhanVien;
}
public DatPhong(String maPhieuDatPhong, String maPhong, String maKhach, String ngayDen,
		String ngayDi, String tenNhanVien) {
	super();
	this.maPhieuDatPhong = maPhieuDatPhong;
	this.maPhong = maPhong;
	this.maKhach = maKhach;
	this.ngayDen = ngayDen;
	this.ngayDi = ngayDi;
	this.tenNhanVien = tenNhanVien;
}
@Override
public String toString() {
	return "DatPhong [maPhieuDatPhong=" + maPhieuDatPhong  + ", maPhong=" + maPhong
			+ ", maKhach=" + maKhach + ", ngayDen=" + ngayDen + ", ngayDi=" + ngayDi + ", tenNhanVien=" + tenNhanVien
			+ "]";
} 



}