package Lab4;

import java.util.Scanner;

public class SanPham_Bai3 {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public String getTenSp() {
		return tenSp;
	}
	
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	
	public double setDonGia() {
		return donGia;
	}
	public void getDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public double setGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	public SanPham_Bai3(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public SanPham_Bai3(String tenSp, double donGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = 0;
	}
	public SanPham_Bai3() {
	}
	
	private double getThueNhapKhau() {
		return this.donGia*0.1;
	}
	
	public void xuat() {
		System.out.println("Ten san pham: " +this.tenSp);
		System.out.println("Don gia: " + this.donGia);
		System.out.println("Giam gia: " +this.giamGia);
		System.out.println("Thue nhap khau: " +this.getThueNhapKhau());
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ten san pham: ");
		tenSp = scanner.nextLine();
		
		System.out.println("Nhap don gia: ");
		donGia = scanner.nextDouble();
		
		System.out.println("Nhap giam gia: ");
		giamGia = scanner.nextDouble();
		
	}
}
