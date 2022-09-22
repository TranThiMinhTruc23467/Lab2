package Lab4;
import java.util.Scanner;

public class SanPham {
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
		
		public SanPham(String tenSp, double donGia, double giamGia) {
			this.tenSp = tenSp;
			this.donGia = donGia;
			this.giamGia = giamGia;
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
			Scanner Scanner = new Scanner(System.in);
			System.out.println("Ten san pham: ");
			tenSp = Scanner.nextLine();
			
			System.out.println("Nhap don gia: ");
			donGia = Scanner.nextDouble();
			
			System.out.println("Nhap giam gia: ");
			giamGia = Scanner.nextDouble();
			
		}
		
		
	}