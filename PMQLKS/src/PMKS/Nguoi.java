package PMKS;

public class Nguoi {
	private String hoTen;
	private String gioiTinh;
	private String quocTich;
	private int tuoi;
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		if (this.tuoi>18 && this.tuoi <=100) {
		this.tuoi = tuoi;
		}
	}
	public Nguoi() {
		// TODO Auto-generated constructor stub
	}

	public Nguoi(String hoTen, String gioiTinh, String quocTich, int tuoi) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.quocTich = quocTich;
		this.tuoi = tuoi;
	}

	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", quocTich=" + quocTich + ", tuoi=" + tuoi + "]";
	}

}
