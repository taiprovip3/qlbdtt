/**
 * 19524791 - PHAN TAN TAI
 * Dung de luu tru thuoc tinh cua nhan vien bao gom thong tin ca nhan va tai khoan dang nhap phan mem ca nhan + quyen hanh
 */
package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class NhanVien {
	@Id
	private String maNhanVien;
	private String tenNhanVien;
	private String soDienThoai;
	private String tenDangNhap;
	private String matKhau;
	private int thoiGianSuDung;
	private boolean quyenLenh;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<HoaDon> danhSachHoaDon;

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public int getThoiGianSuDung() {
		return thoiGianSuDung;
	}

	public void setThoiGianSuDung(int thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}

	public boolean isQuyenLenh() {
		return quyenLenh;
	}

	public void setQuyenLenh(boolean quyenLenh) {
		this.quyenLenh = quyenLenh;
	}

	public List<HoaDon> getDanhSachHoaDon() {
		return danhSachHoaDon;
	}

	public void setDanhSachHoaDon(List<HoaDon> danhSachHoaDon) {
		this.danhSachHoaDon = danhSachHoaDon;
	}

	public NhanVien() {
		super();
	}

	public NhanVien(String maNhanVien, String tenNhanVien, String soDienThoai, String tenDangNhap, String matKhau,
			int thoiGianSuDung, boolean quyenLenh, List<HoaDon> danhSachHoaDon) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.soDienThoai = soDienThoai;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.thoiGianSuDung = thoiGianSuDung;
		this.quyenLenh = quyenLenh;
		this.danhSachHoaDon = danhSachHoaDon;
	}

	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", soDienThoai=" + soDienThoai
				+ ", tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", thoiGianSuDung=" + thoiGianSuDung
				+ ", quyenLenh=" + quyenLenh + ", danhSachHoaDon=" + danhSachHoaDon + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maNhanVien == null) ? 0 : maNhanVien.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		if (maNhanVien == null) {
			if (other.maNhanVien != null)
				return false;
		} else if (!maNhanVien.equals(other.maNhanVien))
			return false;
		return true;
	}
	
}
