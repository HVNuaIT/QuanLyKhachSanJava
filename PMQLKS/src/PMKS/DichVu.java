package PMKS;

public class DichVu {

 private String maDV; 
 private String tenDV ; 
 private double  giaDV ;
  
 public String getMaDV() {
	return maDV;
}
public void setMaDV(String maDV) {
	this.maDV = maDV;
}
public String getTenDV() {
	return tenDV;
}
public void setTenDV(String tenDV) {
	this.tenDV = tenDV;
}
public void setGiaDV(double giaDV) {
	if (giaDV >0) {
	this.giaDV = giaDV;}
}
public double getGiaDV() {
	return giaDV;
}
public DichVu(String maDV, String tenDV, double giaDV  ) {
	super();
	this.maDV = maDV;
	this.tenDV = tenDV;
	this.giaDV = giaDV;
	
} 
 public DichVu() {
	 
 }
@Override
public String toString() {
	return "DichVu [maDV=" + maDV + ", tenDV=" + tenDV + ", giaDV=" + giaDV +  "]";
}
 DichVu (String maDV){
	 this.maDV = maDV;
 }
 DichVu (String ma,double giaDV){
	this.giaDV=giaDV;
 }
}
