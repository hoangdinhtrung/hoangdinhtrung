
public class INSACH {
	public static void main(String[] args) {
		SACH vl = new SACH(null, "MỎ ĐỊA CHẤT", "DCCTCT65D2 ", "THÁI BÌNH ", 2021050663, 100, 100, 15000);
		System.out.println("IN SÁCH " + vl.getGia());

		System.out.println("Mã Sách : " + vl.getMaSach());
		System.out.println("Nhà Xuất Bản : " + vl.getNhaXuatBan());
		System.out.println("Số Tập:  " + vl.getSoTap());
		System.out.println("Tên Tác Giả :" + vl.getTenTacGia());
		System.out.println("Số Trang  " + vl.getSoTrang());
		System.out.println(" Tên Sách: " + vl.getTenSach());
		vl.setTenSach("Hoàn Đình Trung   ");
		System.out.println(" tên sách " + vl.getTenSach());

	}

}
