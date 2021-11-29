/**
 * 19524791 - PHAN TAN TAI
 * Dung de luu lai lich su mua hang cua khach hang va nhan vien nao lam ra HoaDon nay. HoaDon co the ket tap thanh ChiTietHoaDon
 */
package entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class HoaDon {
	private int stt;
	@Id
	private String maHoaDon;
	private Timestamp ngayLapHoaDon;
	private float tongTien;
	@Column(columnDefinition = "nvarchar(255)")
	private String trangThai;
	
	@ManyToOne
	@JoinColumn(name="maKhachHang")
	private KhachHang khachHang;
	
	@ManyToOne
	@JoinColumn(name="maNhanVien")
	private NhanVien nhanVien;
	
	@ManyToOne
	@JoinColumn(name="maSanPham")
	private SanPham sanPham;
	
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public Timestamp getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(Timestamp ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public float getTongTien() {
		return tongTien;
	}
	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public HoaDon() {
		super();
	}
	public HoaDon(int stt, String maHoaDon, Timestamp ngayLapHoaDon, float tongTien, String trangThai) {
		super();
		this.stt = stt;
		this.maHoaDon = maHoaDon;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.tongTien = tongTien;
		this.trangThai = trangThai;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHoaDon == null) ? 0 : maHoaDon.hashCode());
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
		HoaDon other = (HoaDon) obj;
		if (maHoaDon == null) {
			if (other.maHoaDon != null)
				return false;
		} else if (!maHoaDon.equals(other.maHoaDon))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HoaDon [stt=" + stt + ", maHoaDon=" + maHoaDon + ", ngayLapHoaDon=" + ngayLapHoaDon + ", tongTien="
				+ tongTien + ", trangThai=" + trangThai + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien
				+ ", sanPham=" + sanPham + "]";
	}
	
	
	
	
}
