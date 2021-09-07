package PMKS;

public class Phong {
	private String maPhong ; 
	private String loaiPhong ; 
	private double giaPhong ;
	private boolean tinhTrangPhong;
	
	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public double getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(double giaPhong) {
		this.giaPhong = giaPhong;
	}
	


public boolean isTinhTrangPhong() {
		return tinhTrangPhong;
	}

	public void setTinhTrangPhong(boolean tinhTrangPhong) {
		this.tinhTrangPhong = tinhTrangPhong;
		
	}

Phong (){
	
}
Phong (String maPhong){
	this.maPhong = maPhong;
}

public Phong(String maPhong, String loaiPhong, double giaPhong, boolean tinhTrangPhong) {
	super();
	this.maPhong = maPhong;
	this.loaiPhong = loaiPhong;
	this.giaPhong = giaPhong;
	this.tinhTrangPhong = tinhTrangPhong;

	
}
Phong ( String ma,double gia){
	this.giaPhong = gia;
}

@Override
public String toString() {
	return "Phong [maPhong=" + maPhong + ", loaiPhong=" + loaiPhong + ", giaPhong=" + giaPhong + ", tinhTrangPhong="
			+ tinhTrangPhong  + "]";
}



}
