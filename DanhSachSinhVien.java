package Lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
	ArrayList<SinhVienBtec> list = new ArrayList<>();
	
	public void nhap() {
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập ho ten sinh vien: ");
			String hoTen = scanner.nextLine();
			if(hoTen == null || hoTen.equals("")) {
				break;
			}
			System.out.println("Nhap ten nganh (IT/Biz): ");
			String nganh = scanner.nextLine();
			if (nganh.equalsIgnoreCase("IT")) {
				System.out.println("Diem Java: ");
				double diemJava = scanner.nextDouble();
				System.out.println("Nhap diem CSS: ");
				double diemCss = scanner.nextDouble();
				System.out.println("Nhap diem HTML: ");
				double diemHtml = scanner.nextDouble();
				SinhVienBtec newSV = new SinhVienIT(hoTen, nganh, diemJava, diemCss, diemHtml);
				list.add(newSV);
			}
			else if(nganh.equalsIgnoreCase("Biz")) {
				System.out.println("Nhap diem Marketting: ");
				double diemMarketting = scanner.nextDouble();
				System.out.println("Nhap diem Sales: ");
				double diemSales = scanner.nextDouble();
				SinhVienBtec newSV = new SinhVienBiz(hoTen, nganh,diemMarketting, diemSales);
				list.add(newSV);
			}
		} while (true);
	}
	
	public void xuat() {
		
	for(SinhVienBtec sv: list) {
		System.out.printf("Ho ten: %s | Nganh: %s DiemTB: %s.2f Hoc luc: %s\n", sv.getHoTen(), sv.getNganh(), sv.getDiem(), sv.getHocLuc());
	}
	}
	
	public void xuatGioi() {
		for(SinhVienBtec sv: list) {
			if (sv.getHocLuc().equalsIgnoreCase("Gioi")) {
			System.out.printf("Ho ten: %s | Nganh: %s DiemTB: %.2f Hoc luc: %s\n", sv.getHoTen(), sv.getNganh(), sv.getDiem(), sv.getHocLuc());
		}
		}
	}
	
	Comparator<SinhVienBtec> comp = new Comparator<SinhVienBtec>() {
	@Override
	public int compare(SinhVienBtec o1, SinhVienBtec o2) {
		return Double.compare(o1.getDiem(), o2.getDiem());
	}
	};
	
	public void sapXepTheoDiem() {
		Collections.sort(list, comp);
		System.out.println("Sắp xếp tăng dần theo điểm");
		xuat();
		
	}
	
    public void menu() {
    	Scanner s = new Scanner(System.in);
    	int chon = 0;
    	do {
    	System.out.println("\n Menu chuong trinh");
    	System.out.println("1. Nhập danh sách sinh viên");
    	System.out.println("2. Xuất thông tin danh sách sinh viên");
    	System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
    	System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
    	System.out.println("5. Thoát");
    	System.out.println("Moi bạn chon: ");
    	
    	chon = s.nextInt();
    	if(chon != 0) {
    		switch (chon) {
    		case 0:
    			break;
    		case 1:
    			nhap();
    			break;
    		case 2:
    			xuat();
    			break;
    		case 3:
    			xuatGioi();
    			break;
    		case 4: 
    			sapXepTheoDiem();
    			break;
    		default: 
    			System.out.println("Nhập sai, nhập lại!");
    		}
    	}
    }while(chon != 0);
}
}

