/**
 * 19524791 - PHAN TAN TAI
 * Chua thong tin khach hang va nhung hoa don khach hang da mua
 */
package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class KhachHang {
	private int stt;
	@Id
	private String maKhachHang;
	@Column(columnDefinition = "nvarchar(255)")
	private String hoTen;
	private String diaChi;
	private String soDienThoai;
	private String loaiKhachHang;
	
	@OneToMany(mappedBy = "khachHang", fetch = FetchType.EAGER)
	private List<HoaDon> danhSachHoaDon;

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getLoaiKhachHang() {
		return loaiKhachHang;
	}

	public void setLoaiKhachHang(String loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}

	public List<HoaDon> getDanhSachHoaDon() {
		return danhSachHoaDon;
	}

	public void setDanhSachHoaDon(List<HoaDon> danhSachHoaDon) {
		this.danhSachHoaDon = danhSachHoaDon;
	}

	public KhachHang() {
		super();
	}

	

	public KhachHang(int stt, String maKhachHang, String hoTen, String diaChi, String soDienThoai, String loaiKhachHang) {
		super();
		this.stt = stt;
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.loaiKhachHang = loaiKhachHang;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maKhachHang == null) ? 0 : maKhachHang.hashCode());
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
		KhachHang other = (KhachHang) obj;
		if (maKhachHang == null) {
			if (other.maKhachHang != null)
				return false;
		} else if (!maKhachHang.equals(other.maKhachHang))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KhachHang [stt=" + stt + ", maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", diaChi=" + diaChi
				+ ", soDienThoai=" + soDienThoai + ", loaiKhachHang=" + loaiKhachHang + ", danhSachHoaDon="
				+ danhSachHoaDon + "]";
	}
	
}
