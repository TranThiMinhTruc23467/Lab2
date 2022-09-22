package Lab4;

public class ChuNhat {
	protected double rong;
	protected double dai;
	
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	public double getChuVi() {
		return(dai+rong)*2;
	}
	
	public double getDienTich() {
		return dai*rong;
	}
	
	public void xuat() {
		System.out.println("Diện tích hình chữ nhật là: " + getDienTich());
		System.out.println("Chu vi hình chữ nhật là: " +getChuVi());
	}
}
