package PMKS;

public class DatPhong {
private String maPhieuDatPhong ; 
private String ngayDat ;  
private KhachHang khachHang ; 
private Phong phong ;
public String getMaPhieuDatPhong() {
	return maPhieuDatPhong;
}
public void setMaPhieuDatPhong(String maPhieuDatPhong) {
	this.maPhieuDatPhong = maPhieuDatPhong;
}
public void setNgayDat(String ngayDat) {
	this.ngayDat = ngayDat;
}
public String getNgayDat() {
	return ngayDat;
}
public KhachHang getKhachHang() {
	return khachHang;
}
public void setKhachHang(KhachHang khachHang) {
	this.khachHang = khachHang;
}
public Phong getPhong() {
	return phong;
}
public void setPhong(Phong phong) {
	this.phong = phong;
}
public DatPhong(String maPhieuDatPhong, String ngayDat,KhachHang khach , Phong phong) {
	super();
	this.maPhieuDatPhong = maPhieuDatPhong;
	this.ngayDat = ngayDat;
	this.khachHang = khach ;  
	this.phong = phong ; 
	
}
DatPhong (){
	
}
@Override
public String toString() {
	return "DatPhong [maPhieuDatPhong=" + maPhieuDatPhong + ", ngayDat=" + ngayDat + ", maKhachHang=" + khachHang.getMaKhachHang()
			+ ", maPhong=" + phong.getMaPhong() + "]";
}

public DatPhong(String maPhieuDat) {
	// TODO Auto-generated constructor stub
	this.maPhieuDatPhong=maPhieuDat;
}


}