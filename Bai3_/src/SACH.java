import java.util.Scanner;

public class SACH {
	Scanner sc = new Scanner(System.in);
	private String TenSach;
	private String TenTacGia;
	private String NhaXuatBan;
	private long MaSach;
	private int SoTrang;
	private int SoTap;
	private float Gia;

	public SACH(Scanner sc, String tenSach, String tenTacGia, String nhaXuatBan, long maSach, int soTrang, int soTap,
			float gia) {
		super();
		this.sc = sc;
		TenSach = tenSach;
		TenTacGia = tenTacGia;
		NhaXuatBan = nhaXuatBan;
		MaSach = maSach;
		SoTrang = soTrang;
		SoTap = soTap;
		Gia = gia;
	}

	public String getTenSach() {
		return this.TenSach;
	}

	public void setTenSach(String tenSach) {
		this.TenSach = tenSach;
	}

	public String getTenTacGia() {
		return this.TenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.TenTacGia = tenTacGia;
	}

	public String getNhaXuatBan() {
		return this.NhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.NhaXuatBan = nhaXuatBan;
	}

	public long getMaSach() {
		return this.MaSach;
	}

	public void setMaSach(long maSach) {
		this.MaSach = maSach;
	}

	public double getSoTrang() {
		return this.SoTrang;
	}

	public void setSoTrang(int soTrang) {
		this.SoTrang = soTrang;
	}

	public double getSoTap() {
		return this.SoTap;
	}

	public void setSoTap(int soTap) {
		this.SoTap = soTap;
	}

	public float getGia() {
		return this.Gia;
	}

	public void setGia(float gia) {
		this.Gia = gia;
	}

}
