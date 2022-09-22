package Lab4;

public class SinhVienIT extends SinhVienBtec {
	protected double diemJava;
	protected double diemCss;
	protected double diemHtml;
	
	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
		super(hoTen,nganh);
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}
	
	@Override
	double getDiem() {
		return (2* diemJava + diemJava + diemCss)/4;
	}
}
