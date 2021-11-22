/**
 * 19524791 - PHAN TAN TAI
 * NhaCungCap cung cap san pham cho shop bang cac lo xe van chuyen (nhap kho).
 */
package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class NhaCungCap {
	@Id
	private String maNhaCungCap;
	private String tenDoiTac;
	private String quocGia;
	private String soDienThoai;
	
	@OneToMany(mappedBy = "nhaCungCap")
	private List<SanPham> danhSachSanPham;

	public String getMaNhaCungCap() {
		return maNhaCungCap;
	}

	public void setMaNhaCungCap(String maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}

	public String getTenDoiTac() {
		return tenDoiTac;
	}

	public void setTenDoiTac(String tenDoiTac) {
		this.tenDoiTac = tenDoiTac;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public List<SanPham> getDanhSachSanPham() {
		return danhSachSanPham;
	}

	public void setDanhSachSanPham(List<SanPham> danhSachSanPham) {
		this.danhSachSanPham = danhSachSanPham;
	}

	public NhaCungCap() {
		super();
	}

	public NhaCungCap(String maNhaCungCap, String tenDoiTac, String quocGia, String soDienThoai,
			List<SanPham> danhSachSanPham) {
		super();
		this.maNhaCungCap = maNhaCungCap;
		this.tenDoiTac = tenDoiTac;
		this.quocGia = quocGia;
		this.soDienThoai = soDienThoai;
		this.danhSachSanPham = danhSachSanPham;
	}

	@Override
	public String toString() {
		return "NhaCungCap [maNhaCungCap=" + maNhaCungCap + ", tenDoiTac=" + tenDoiTac + ", quocGia=" + quocGia
				+ ", soDienThoai=" + soDienThoai + ", danhSachSanPham=" + danhSachSanPham + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maNhaCungCap == null) ? 0 : maNhaCungCap.hashCode());
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
		NhaCungCap other = (NhaCungCap) obj;
		if (maNhaCungCap == null) {
			if (other.maNhaCungCap != null)
				return false;
		} else if (!maNhaCungCap.equals(other.maNhaCungCap))
			return false;
		return true;
	}
	
}
