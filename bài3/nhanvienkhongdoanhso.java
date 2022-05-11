package bài3;

public class nhanvienkhongdoanhso extends nhanvien {

	public nhanvienkhongdoanhso(String name, double danhso, double tienthuong) {
		super(name, danhso, tienthuong);
		
	}

	public void tennhanvien() {
		System.out.println("Nguyễn Gia Huy");
	}

	public double doanhsobanhang(double x) {
		return this.getDanhso();
	}

	public double tienthuong(double x) {
		return this.getTienthuong();
	}
}
