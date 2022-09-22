package Lab4;

public class Vuong extends ChuNhat {
	public Vuong(double canh) {
		super(canh,canh);
		double rong = canh;
	}
	public double DienTich() {
		return rong*rong;
	}
	public double ChuVi() {
		return 4*rong;
	}
	public void xuat() {
		System.out.println("--------------------------------------");
		System.out.println("Diện tich hình vuông là: " +getDienTich());
		System.out.println("Chu vi hình chữ nhật là: " + getChuVi());
	}
}
