/**
 * 19524791 - PHAN TAN TAI
 * NhaCungCap cung cap san pham cho shop bang cac lo xe van chuyen (nhap kho).
 */
package entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class NhaCungCap {
	private int stt;
	@Id
	private String maNhaCungCap;
	@Column(columnDefinition = "nvarchar(255)")
	private String tenDoiTac;
	@Column(columnDefinition = "nvarchar(255)")
	private String quocGia;
	private String soDienThoai;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "nhaCungCap")
	private List<SanPham> danhSachSanPham;

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

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

	public NhaCungCap(int stt, String maNhaCungCap, String tenDoiTac, String quocGia, String soDienThoai) {
		super();
		this.stt = stt;
		this.maNhaCungCap = maNhaCungCap;
		this.tenDoiTac = tenDoiTac;
		this.quocGia = quocGia;
		this.soDienThoai = soDienThoai;
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

	@Override
	public String toString() {
		return "NhaCungCap [stt=" + stt + ", maNhaCungCap=" + maNhaCungCap + ", tenDoiTac=" + tenDoiTac + ", quocGia="
				+ quocGia + ", soDienThoai=" + soDienThoai + ", danhSachSanPham=" + danhSachSanPham + "]";
	}

	


}
