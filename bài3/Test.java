package bài3;

public class Test {
	public static void main(String[] args) {
		nhanvienkhongdoanhso s = new nhanvienkhongdoanhso("Hoàng Đình Trung", 10, 15000);
		nhanviencodoanhso n = new nhanviencodoanhso("A B C", 0, 0);

		System.out.println("nhân viên có doanh số : " + s.getDanhso());
		System.out.println("nhân viên có doanh số : " + s.getName());
		System.out.println("nhân viên có doanh số : " + s.getTienthuong());

		System.out.println("nhân viên không có doanh số : " + n.getDanhso());
		System.out.println("nhân viên không có doanh số : " + n.getName());
		System.out.println("nhân viên không có doanh số : " + n.getTienthuong());

	}
}